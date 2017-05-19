object LearningScala1 {

  val hello: String = "Hello!"
  println(hello)


  // mutable
  var helloThere: String = hello
  helloThere = hello + " There !"

  // immutable
  val immutableHelloThere: String = hello + "There!"
  helloThere = hello + " There !"

  // Some types
  val numberOne: Int = 1
  val truth: Boolean = true
  var letterA: Char = 'a'
  var pi: Double = 3.1415
  val piSinglePrecision: Float = 3.1415f
  val bigNumber: Long = 1234567890
  val smallNumber: Byte = 127

  // String printing tricks
  println("Here is a mess: " + numberOne + truth + pi + bigNumber)

  // format start with f
  println(f"Pi is about $piSinglePrecision%.3f")
  println(f"Zero padding on the left: $numberOne%05d")

  // Substituting in variables:
  println(s"I can use s prefix to use variable like $numberOne $truth $letterA ")

  // Substituting expressions:
  println(s"I can use s prefix to use expression like ${1 + 4}")

  // Using regular expressions:
  val theUltimateAnswer: String = "To life, the universe, and everything is 42."

  val pattern =""".* ([\d]+).*""".r
  val pattern(answerString) = theUltimateAnswer
  val answer = answerString.toInt


}