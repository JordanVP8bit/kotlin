fun main () {
    println("What rating is your movie?( PG, PG-13, R)")
    val movieRating = readln().trim()

    println("How old are you?")
    val age = readlnOrNull()!!.toInt()

    if (movieRating == null || age == null) {
    println("Invalid input")
    return
    }

    val OldEnough = when {
        movieRating == "PG" -> true
        movieRating == "PG-13" && age >= 13 -> true
        movieRating == "R" && age >= 18 -> true
        else -> false
    }

 if (OldEnough) {
     println("Enjoy your movie!")
 } else {
     println("Sorry you are not old enough to watch this move. Please bring a Parent/Guardian")
 }


}