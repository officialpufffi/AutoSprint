version = "0.1.0"

plugins {
    id("java-library")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

dependencies {
    api(project(":api"))
}

labyModProcessor {
    referenceType = net.labymod.gradle.core.processor.ReferenceType.DEFAULT
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}