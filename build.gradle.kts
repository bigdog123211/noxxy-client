plugins {
	id("fabric-loom") version "1.4.8"
	id("maven-publish")
}

version = "1.0.0"
group = "dev.noxxy"

repositories {
	mavenCentral()
	maven {
		name = "Fabric"
		url = uri("https://maven.fabricmc.net/")
	}
}

dependencies {
	minecraft("com.mojang:minecraft:1.21.1")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:0.15.11")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.100.0+1.21.1")
}

tasks.withType<JavaCompile> {
	options.release = 21
}

java {
	sourceCompatibility = JavaVersion.VERSION_21
	targetCompatibility = JavaVersion.VERSION_21
}
