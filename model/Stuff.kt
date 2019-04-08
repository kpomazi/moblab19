import com.google.gson.annotations.SerializedName

import java.util.Date

class Stuff(
        @SerializedName("date")
        val date: Date? = null,

        @SerializedName("title")
        val title: String,

        @SerializedName("content")
        val content: String? = null,

        @SerializedName("id")
        @PrimaryKey
        val id: Long
)
