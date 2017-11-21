package xyz.gosick.totoro.common.model

class Response<T> {

    /**
     * 请求是否成功
     */
    var success: Boolean = false


    /**
     * 返回的错误信息。当success为false的时候，该字段提供具体错误原因。
     */
    var message: String? = null
        set(message) {
            this.success = false
            field = message
        }

    /**
     * 具体业务返回值
     */
    var data: T? = null
        set(data) {
            this.success = true
            field = data
        }


    companion object {
        fun <T> success(data: T?): Response<T> {
            val response = Response<T>()
            response.data = data
            return response
        }

        fun <T> success(): Response<T> = Response.success(null)


        fun <T> fail(message: String): Response<T> {
            val response = Response<T>()
            response.message = message
            return response
        }

    }

}
