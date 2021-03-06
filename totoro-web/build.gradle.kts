apply {
    plugin("org.springframework.boot")
}
dependencies {
    compile(project(":totoro-user-api"))
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-data-redis")
    compile("org.springframework.session:spring-session-data-redis")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    compile("org.springframework.cloud:spring-cloud-starter-openfeign")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-hystrix")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}