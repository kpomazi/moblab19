import android.content.Context
import java.util.Date
import javax.inject.Inject

class MemoryRepository @Inject constructor() : Repository {

    companion object {
        var stuffs = mutableListOf(
                Stuff(
                        title = "Example 1",
                        content = "Content 1",
                        id = 1L
                ),
                Stuff(
                        title = "Example 2",
                        content = "Content 2",
                        id = 3L
                ),
                Stuff(
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

    override fun getStuff(): List<Stuff> {
        return stuffs
    }

    override fun saveStuff(stuff: Stuff) {
        stuffs.add(stuff)
    }

    override fun updateStuffs(stuffs: List<Stuff>) {
        stuffs.forEach { stuffs ->
            val removed = stuffs.removeAll { it.id == stuffs.id }
            if (removed) {
                stuffs.add(stuffs)
            }
        }
    }

    override fun removeStuff(stuffs: Stuff) {
        stuffs.remove(stuffs)
    }
}
