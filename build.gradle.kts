plugins {
    java
    application
}

tasks.javadoc {
    isFailOnError = false
}

repositories {

    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.3")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.3")
}

val mainClass: String by project

application {
    mainClass.set("it.unibo.TestAllClasses")
}

tasks.withType<Test> {
    // Use junit platform for unit tests
    useJUnitPlatform()
    testLogging {
        events(*(org.gradle.api.tasks.testing.logging.TestLogEvent.values())) // events("passed", "skipped", "failed")
    }
    testLogging.showStandardStreams = true
}
