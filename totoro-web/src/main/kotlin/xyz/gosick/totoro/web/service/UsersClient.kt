package xyz.gosick.totoro.web.service

import org.springframework.cloud.netflix.feign.FeignClient
import xyz.gosick.totoro.user.rest.Users

@FeignClient("totoro-user")
interface UsersClient : Users