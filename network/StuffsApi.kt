import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StuffsApi {

    @GET("Stuffs")
    fun getAllStuffs(): Call<List<Stuff>>

    @PUT("Stuffs/{id}")
    fun update(@Path("id") id: Long?, @Body email: String): Call<ResponseBody>

    @DELETE("Stuffs/{id}")
    fun delete(@Path("id") id: Long?): Call<ResponseBody>

}
