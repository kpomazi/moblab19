import android.arch.persistence.room.Room
import android.content.Context
import javax.inject.Inject

class RoomRepository @Inject constructor() : Repository {

    private lateinit var stuffsDao: StuffsDao

    override fun open(context: Context) {
        stuffsDao = Room.databaseBuilder(context, MyDatabase::class.java, "stuffs.db").build().roomDao()
    }

    override fun close() {
        // Empty
    }

    override fun getStuffs(): List<Stuff> {
        return stuffsDao.getStuffs()
    }

    override fun saveStuff(stuff: Stuff) {
        stuffsDao.saveStuff(stuff)
    }

    override fun updateStuffs(stuffs: List<Stuff>) {
        stuffsDao.updateStuffs(stuffs)
    }

    override fun removeStuff(stuff: Stuff) {
        stuffsDao.removeStuff(stuff)
    }

    override fun isStuff(stuff: Stuff): Boolean {
        return stuffsDao.findStuffById(stuff.id) != null
    }

}
