import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface FavouritesApi {

    @GET("Favourites")
    fun getAllFavourites(): Call<List<Favourites>>

    @PUT("Favourites/{id}")
    fun update(@Path("id") id: Long?, @Body email: String): Call<ResponseBody>

    @DELETE("Flights/{id}")
    fun delete(@Path("id") id: Long?): Call<ResponseBody>

}
