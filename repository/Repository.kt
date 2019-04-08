import android.content.Context


interface Repository {

    fun getStuffs(): List<Stuff>

    fun open(context: Context)

    fun close()

    fun saveStuff(stuff: Stuff)

    fun updateStuffs(stuffs: List<Stuff>)

    fun removeStuff(stuff: Stuff)

}
