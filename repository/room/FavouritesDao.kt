import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

@Dao
interface FavouritesDao {

    @Query("SELECT * FROM favourites")
    fun getFavourites(): List<Favourite>

    @Insert
    fun saveFavourite(favourite: Favourite)

    @Update
    fun updateFavourites(favourites: List<Favourite>)

    @Delete
    fun removeFavourite(favourite: Favourite)

    @Query("SELECT * FROM favourites WHERE id = :id")
    fun findFlightById(id: Long): Favourite?

}
