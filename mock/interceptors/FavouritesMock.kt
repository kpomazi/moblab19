import android.net.Uri
import okhttp3.Request
import okhttp3.Response
import java.util.Date

FavouritesMock {

    const val TITLE1 = "Favourite 1"
    const val CONTENT1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque cursus, diam tincidunt fringilla aliquam, magna elit tincidunt nunc, at pellentesque risus elit a urna."

    const val TITLE2 = "Favourite 2"
    const val CONTENT2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque cursus, diam tincidunt fringilla aliquam, magna elit tincidunt nunc, at pellentesque risus elit a urna."

    fun process(request: Request): Response {
        val uri = Uri.parse(request.url().toString())

        val responseString: String
        val responseCode: Int
        val headers = request.headers()

        if (uri.path == NetworkConfig.ENDPOINT_PREFIX + "Favourite" && request.method() == "GET") {
            val newsList = listOf(
                    Favourite(Date(), TITLE1, CONTENT1, 0L),
                    Favourite(Date(), TITLE2, CONTENT2, 0L)
            )

            responseString = GsonHelper.gson.toJson(newsList)
            responseCode = 200
        } else {
            responseString = "ERROR"
            responseCode = 503
        }

        return MockHelper.makeResponse(request, headers, responseCode, responseString)
    }

}
