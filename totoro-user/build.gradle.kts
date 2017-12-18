apply {
    plugin("org.springframework.boot")
}
dependencies {
    compile(project(":totoro-user-api"))
    compile("com.zaxxer:HikariCP")
    compile("org.flywaydb:flyway-core")
    compile("org.postgresql:postgresql")
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.boot:spring-boot-starter-data-jpa")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    compile("org.springframework.cloud:spring-cloud-starter-netflix-hystrix")
}
