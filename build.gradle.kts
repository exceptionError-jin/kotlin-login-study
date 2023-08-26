import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
	mavenCentral()
}

plugins {
	id("org.springframework.boot") version "2.7.15"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("org.jetbrains.kotlin.jvm") version "1.4.21"
	id("org.jetbrains.kotlin.plugin.spring") version "1.4.21"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.4.21"
}

group = "com.app"
version = "1.0"

 java {
     sourceCompatibility = JavaVersion.VERSION_11
 }

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-mustache")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "11"
	}
}