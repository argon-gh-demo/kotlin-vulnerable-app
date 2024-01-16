plugins {
    application 
}

repositories {
    mavenCentral() 
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.10")
    implementation("org.springframework:spring-core:4.2.3.RELEASE")

}

application {
    mainClass.set("demo.AppKt") 
}

// write locks
dependencyLocking {
    lockAllConfigurations()
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}
