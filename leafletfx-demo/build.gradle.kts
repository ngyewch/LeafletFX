plugins {
    application
    id("ca.cutterslade.analyze")
    id("com.github.ben-manes.versions")
    id("it.gianluz.capsule") version "1.0.3"
    id("org.openjfx.javafxplugin")
}

application {
    mainClass.set("com.github.ngyewch.leafletfx.demo.Main")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11

    modularity.inferModulePath.set(true)
}

javafx {
    version = "11"
    modules(
            "javafx.controls",
            "javafx.fxml",
            "javafx.graphics",
            "javafx.web"
    )
    //configuration = "compileOnly"
}

dependencies {
    implementation(project(":leafletfx"))
}

tasks {
    withType(ca.cutterslade.gradle.analyze.AnalyzeDependenciesTask::class) {
        justWarn = true
    }

    create<us.kirchmeier.capsule.task.FatCapsule>("fatCapsule") {
        applicationClass("com.github.ngyewch.leafletfx.demo.Main")
        embedConfiguration(configurations.getByName("runtimeClasspath"))

        capsuleManifest.minJavaVersion = "11"
    }

    named("assemble") {
        dependsOn("fatCapsule")
    }
}
