plugins {
    `java-library`
    `maven-publish`
    id("ca.cutterslade.analyze")
    id("com.github.ben-manes.versions")
    id("com.jfrog.bintray") version "1.8.5"
    id("org.openjfx.javafxplugin")
}

project.group = "com.github.ngyewch.leafletfx"
project.version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11

    modularity.inferModulePath.set(true)

    withJavadocJar()
    withSourcesJar()
}

javafx {
    version = "11"
    modules(
            "javafx.graphics",
            "javafx.web"
    )
    configuration = "compileOnly"
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.12.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.2")
    implementation("org.apache.commons:commons-lang3:3.12.0")
}

tasks {
    withType(ca.cutterslade.gradle.analyze.AnalyzeDependenciesTask::class) {
        justWarn = true
    }
}

bintray {
    user = project.properties["bintrayUser"] as String?
    key = project.properties["bintrayKey"] as String?
    with(pkg) {
        repo = "maven"
        name = "LeafletFX"
        with(version) {
            name = project.version as String
        }
    }
    setPublications("maven")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String
            artifactId = project.name
            version = project.version as String

            from(components["java"])
        }
    }
}
