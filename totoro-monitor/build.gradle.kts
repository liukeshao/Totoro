apply {
    plugin("org.springframework.boot")
}
dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-hystrix")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-hystrix-dashboard")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-turbine")
}

