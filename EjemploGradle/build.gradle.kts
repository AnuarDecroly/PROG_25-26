plugins {
    id("java")
}

group = "com.decroly"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // Source: https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
    implementation("com.mysql:mysql-connector-j:8.4.0")
    // Source: https://mvnrepository.com/artifact/org.openjfx/javafx-controls
    implementation("org.openjfx:javafx-controls:26-ea+22")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}