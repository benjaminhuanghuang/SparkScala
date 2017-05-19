object LearningScala2 {


  //Matching
  val number = 3
  number match {
    case 1 => println("one")
    case 2 => println("two")
    case 3 => println("three")
    case _ => println("Something else")
  }

  // For loop
  for (x <- 1 to 4) {
    val squared = x * x
    println(squared)
  }
}