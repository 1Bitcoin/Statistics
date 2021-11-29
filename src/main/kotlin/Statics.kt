import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.io.IOException


class Statics {
    private val client = OkHttpClient()

    private var uri = 588823
    private var habrURL = "https://habr.com/kek/v2/articles/$uri"

    fun run(): MetaData {
        val request = Request.Builder()
            .url(habrURL)
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            
            val responseJSON = JSONObject(response.body!!.string()).getJSONObject("statistics")

            return ObjectMapper().readValue(responseJSON.toString(), MetaData::class.java)
        }
    }
}