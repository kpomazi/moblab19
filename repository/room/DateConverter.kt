import android.arch.persistence.room.TypeConverter
import java.util.Date

@Suppress("unused")
class DateConverter {

    @TypeConverter
    fun dateToLong(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun longToDate(date: Long): Date {
        return Date(date)
    }

}
