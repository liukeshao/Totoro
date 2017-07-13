package xyz.gosick.totoro.web.exception

import org.springframework.http.HttpStatus


/**
 * Created by ks on 2017/7/13.
 */
class RestfulException(val status: HttpStatus, message: String = "") : RuntimeException(message)