// For `KotlinCompile` task below
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21" // Kotlin version to use
    application // Application plugin.
}

group = "br.poli" // A company name, for example, `org.jetbrains`
version = "0.1-BETA" // Version to assign to the built artifact

repositories { // Sources of dependencies. See 2️⃣
    mavenCentral() // Maven Central Repository. See 3️⃣
}

dependencies { 
   implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.9.0-RC")

}

kotlin { // Extension for easy setup
}

application {
    mainClass.set("MainKt") // The main class of the application
}
