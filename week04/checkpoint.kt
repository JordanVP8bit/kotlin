const val HERO_NAME = "Karu"
// I have changed the name to Karu
fun main() {
    println("The hero announces their presence to the world")

    println(HERO_NAME)
    var playerlevel = 4
    println(playerlevel)

    if (playerlevel == 1) {
        println("Meet Mr.Bubbles in the Land of soft things")
    } else if (playerlevel <= 5) {
        println("Save the town from the barbarian invasions.")
    } else if (playerlevel == 6) {
        println("Locate Excalibur")
    } else if (playerlevel == 7) {
        println("Recover the long-lost artifact of creation.")
    } else if (playerlevel == 8) {
        println("Defeat Nogratse, bringer of death and eater of worlds.")
    } else {
        println("There are no quests right now.")
    }

    println("Time passes. . .")
    println("The hero returns from their quest")

    playerlevel += 1
    println(playerlevel)

}