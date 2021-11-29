fun main(args: Array<String>) {

    val statics = Statics().run()

    println("commentsCount: ${statics.commentsCount}, favoritesCount: ${statics.favoritesCount}, " +
            "readingCount: ${statics.readingCount}, score: ${statics.score}, votesCount: ${statics.votesCount}")
}