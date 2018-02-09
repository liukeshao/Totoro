import org.springframework.boot.gradle.dsl.SpringBootExtension

apply {
    plugin("org.springframework.boot")
}
configure<SpringBootExtension> {
    mainClassName = "xyz.gosick.totoro.eureka.Application"
}
dependencies {
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
}

tasks.withType<Jar> {
    enabled = true
    baseName = "totoro-eureka"
}

