fun main() {
  // Write your code below 🏞
  var responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")

  var responsibilitiesComplete = 0

  var timeSpent = 0

  val totalShiftTime = 4

  var foxiesHealthCheck = mutableMapOf<String, Any?>()

  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

  println("First, ${responsibilities[0]}.")

  println("Feeding Bonnie...")
  chimpsHaveEaten["Bonnie"] = true

  println("Feeding Jubilee...")
  chimpsHaveEaten["Jubilee"] = true

  println("Feeding Frodo...")
  chimpsHaveEaten["Frodo"] = true

  println("Feeding Foxie...")
  chimpsHaveEaten["Foxie"] = true

  timeSpent ++
  responsibilitiesComplete ++

  println("All chimps have now been fed! You've completed ${responsibilitiesComplete} / ${responsibilities.size} responsibilities.")

  println("Next, ${responsibilities[1]}.")

  var games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")

  var randomGame = games.random()

  println(randomGame)

}