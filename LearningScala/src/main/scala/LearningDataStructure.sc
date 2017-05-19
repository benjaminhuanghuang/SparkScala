object LearningDataStructure {
  //Tuple, contains different types
  val captainStuff = ("Picard", 200, "NCC")

  // Refer individual fields with 1-based index
  captainStuff._1
  captainStuff._2

  // key/value pair
  val picardsShip = "Picard" -> "Enterprise-D"
  // Refer the value
  picardsShip._2

  // List
  val shipList = List("Enterprise", "Defiant", "Voyager", "Deep")

  shipList(0)
  shipList.head
  shipList.tail // remaining ones after head
  // List + for
  for (ship <- shipList)
    println(ship)

  // List + map
  val backwardShips = shipList.map(ship => ship.reverse)

  val numberList = List(1, 2, 3, 4, 5, 6)
  // reduct() combine all items using a function, fun (result, next)
  val sum = numberList.reduce((x: Int, y: Int) => x + y)

  val iHateFives = numberList.filter(x => x != 5)

  val iHateThrees = numberList.filter(_ != 5)

  // Concatenating lists
  val moreNumbers = List(6, 7, 8, 9)
  val allNumbers = numberList ++ moreNumbers // 6,6

  // list fun return value
  numberList.reverse
  numberList.sorted
  allNumbers.distinct
  allNumbers.max
  allNumbers.sum
  allNumbers.contains(7)

  // maps
  val shipMap = Map("key" -> "value")
  shipMap.contains("name")

  val archerShip = util.Try(shipMap("Archer")) getOrElse("Unknown")
}
