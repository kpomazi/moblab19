import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters

@Database(
        entities = [Stuff::class],
        version = 1,
        exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class MyDatabase : RoomDatabase() {

    abstract fun roomDao(): StuffsDao

}
