package xyz.gosick.totoro.web.exception

import com.jsoniter.JsonIterator
import com.jsoniter.output.JsonStream
import mu.KotlinLogging
import org.springframework.core.Ordered
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by ks on 2017/7/13.
 */
private val logger = KotlinLogging.logger {}

@Component
class RestfulExceptionResolver : AbstractHandlerExceptionResolver() {
    override fun getOrder(): Int = Ordered.HIGHEST_PRECEDENCE


    override fun doResolveException(request: HttpServletRequest, response: HttpServletResponse, handler: Any?, ex: Exception): ModelAndView {
        logger.info ( "restful exception resolver cached exception: $ex" )
        when (ex) {

            is IllegalArgumentException -> {
                response.status = HttpStatus.BAD_REQUEST.value()
                response.writer.print(getMsg(ex.message))
            }

            is IllegalStateException -> {
                response.status = HttpStatus.INTERNAL_SERVER_ERROR.value()
                response.writer.print(getMsg(ex.message))
            }

            is RestfulException -> {
                response.status = ex.status.value()
                response.writer.print(getMsg(ex.message))
            }

            is MissingServletRequestParameterException,
            is MethodArgumentTypeMismatchException -> {
                response.status = HttpStatus.BAD_REQUEST.value()
                response.writer.print(getMsg("parameters.invalid"))
            }
            else -> {
                logger.error("Internal Server Error $ex")
                response.status = HttpStatus.INTERNAL_SERVER_ERROR.value()
                val errMsg = if (ex.cause.toString().contains("Timeout")) getMsg("connect.timeout") else getMsg("server.error")
                response.writer.print(errMsg)
            }
        }
        return ModelAndView()
    }

    fun getMsg(message: String?): String = JsonStream.serialize(mapOf("errMsg" to message))

}