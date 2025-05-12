plugins {
    `java-library`
    `maven-publish`
}

group = "com.coryjreid"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

publishing {
    publications.create<MavenPublication>("autoitx4java") {
        from(components["java"])
    }
}

repositories {
    flatDir { dirs("libs/jacob-1.21") }
}

dependencies {
    implementation("com.jacob:jacob")
}
