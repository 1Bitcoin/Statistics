import com.fasterxml.jackson.annotation.JsonProperty

data class MetaData (
    @JsonProperty("commentsCount")
    var commentsCount: Int,

    @JsonProperty("favoritesCount")
    var favoritesCount: Int,

    @JsonProperty("readingCount")
    var readingCount: Int,

    @JsonProperty("score")
    var score: Int,

    @JsonProperty("votesCount")
    var votesCount: Int
)
