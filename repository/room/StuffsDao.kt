import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

@Dao
interface StuffsDao {

    @Query("SELECT * FROM stuffs")
    fun getStuff(): List<Stuff>

    @Insert
    fun saveStuff(stuff: Stuff)

    @Update
    fun updateStuffs(stuffs: List<Stuff>)

    @Delete
    fun removeStuff(stuff: Stuff)

    @Query("SELECT * FROM stuffs WHERE id = :id")
    fun findStuffById(id: Long): Stuff?

}
