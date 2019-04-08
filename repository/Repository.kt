import android.content.Context


interface Repository {

    fun getFavourites(): List<Favourite>

    fun open(context: Context)

    fun close()

    fun saveFavourite(favourite: Favourite)

    fun updateFavourites(favourites: List<Favourite>)

    fun removeFavourite(favourite: Favourite)

}
