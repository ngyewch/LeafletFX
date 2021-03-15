plugins {
    `java-library`
    `maven-publish`
    signing
    id("ca.cutterslade.analyze")
    id("com.github.ben-manes.versions")
    id("org.openjfx.javafxplugin")
}

project.group = "com.github.ngyewch.leafletfx"
project.version = "0.1.0"

val isReleaseVersion = !(project.version as String).endsWith("SNAPSHOT")

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
    withType(Sign::class) {
        onlyIf { isReleaseVersion }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String
            artifactId = project.name
            version = project.version as String

            from(components["java"])

            pom {
                description.set("Leaflet for JavaFX.")
                url.set("https://github.com/ngyewch/LeafletFX")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://github.com/ngyewch/LeafletFX/blob/main/LICENSE")
                    }
                }
                scm {
                    connection.set("scm:git:git@github.com:ngyewch/LeafletFX.git")
                    developerConnection.set("scm:git:git@github.com:ngyewch/LeafletFX.git")
                    url.set("https://github.com/ngyewch/LeafletFX")
                }
            }
        }
    }
    repositories {
        maven {
            if (isReleaseVersion) {
                setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            } else {
                setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            }
            credentials {
                val ossrhUsername: String? by project
                val ossrhPassword: String? by project
                username = ossrhUsername
                password = ossrhPassword
            }
        }
    }
}

signing {
    sign(publishing.publications["maven"])
}
