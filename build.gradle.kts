plugins {
    application
    java
}

group = "com.github.makeitvsolo"
version = "0.1.0"

application {
    mainClass = "com.github.makeitvsolo.jtemplate.Application"
}

java {
    sourceCompatibility = JavaVersion.toVersion(21)
    targetCompatibility = JavaVersion.toVersion(21)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.3")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
