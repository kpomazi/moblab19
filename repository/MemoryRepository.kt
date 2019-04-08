import android.content.Context
import java.util.Date
import javax.inject.Inject

class MemoryRepository @Inject constructor() : Repository {

    companion object {
        var favourites = mutableListOf(
                Favourite(
                        title = "Example 1",
                        content = "Content 1",
                        id = 1L
                ),
                Favourite(
                        title = "Example 2",
                        content = "Content 2",
                        id = 3L
                ),
                Favourite(
                        title = "Example 3",
                        content = "Content 3",
                        id = 2L
                )
        )
    }

    override fun open(context: Context) {
        // Empty
    }

    override fun close() {
        // Empty
    }

    override fun getFavourites(): List<Favourite> {
        return favourites
    }

    override fun saveFavourite(favourite: Favourite) {
        favourites.add(favourite)
    }

    override fun updateFavourites(favourites: List<Favourite>) {
        favourites.forEach { favourites ->
            val removed = favourites.removeAll { it.id == favourites.id }
            if (removed) {
                favourites.add(favourites)
            }
        }
    }

    override fun removeFavourite(favourites: Favourite) {
        favourites.remove(favourites)
    }
}
