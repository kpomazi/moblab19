import android.arch.persistence.room.Room
import android.content.Context
import javax.inject.Inject

class RoomRepository @Inject constructor() : Repository {

    private lateinit var favouritesDao: FavouritesDao

    override fun open(context: Context) {
        favouritesDao = Room.databaseBuilder(context, MyDatabase::class.java, "favourites.db").build().roomDao()
    }

    override fun close() {
        // Empty
    }

    override fun getFavourites(): List<Favourite> {
        return favouritesDao.getFavourites()
    }

    override fun saveFavourite(favourite: Favourite) {
        favouritesDao.saveFavourite(flight)
    }

    override fun updateFavourites(favourites: List<Favourite>) {
        favouritesDao.updateFavourites(favourites)
    }

    override fun removeFavourite(favourite: Favourite) {
        favouritesDao.removeFavourite(favourite)
    }

    override fun isFavourite(favourite: Favourite): Boolean {
        return favouritesDao.findFavouriteById(favourite.id) != null
    }

}
