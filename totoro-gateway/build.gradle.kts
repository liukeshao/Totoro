apply {
    plugin("org.springframework.boot")
}
dependencies {
    compile("io.jsonwebtoken:jjwt")
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-zuul")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
}