plugins {
    java
    `java-library`
}

group = "com.coryjreid"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    flatDir { dirs("libs/jacob-1.21") }
}

dependencies {
    implementation("com.jacob:jacob")
}
