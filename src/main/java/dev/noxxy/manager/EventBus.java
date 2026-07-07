package dev.noxxy.manager;

import java.lang.reflect.Method;
import java.util.*;

public class EventBus {
    private final Map<Class<?>, List<Object>> listeners = new HashMap<>();
    
    public void register(Object listener) {
        for (Method method : listener.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(EventHandler.class)) {
                Class<?>[] params = method.getParameterTypes();
                if (params.length == 1) {
                    Class<?> eventType = params[0];
                    listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
                    method.setAccessible(true);
                }
            }
        }
    }
    
    public void post(Object event) {
        List<Object> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (Object listener : eventListeners) {
                for (Method method : listener.getClass().getDeclaredMethods()) {
                    if (method.isAnnotationPresent(EventHandler.class)) {
                        Class<?>[] params = method.getParameterTypes();
                        if (params.length == 1 && params[0].isAssignableFrom(event.getClass())) {
                            try {
                                method.invoke(listener, event);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
