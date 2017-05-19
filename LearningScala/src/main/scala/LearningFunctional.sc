object LearningFunctional {
  def squareIt(x: Int): Int = {
    x * x
  }

  def cubeIt(x: Int): Int = {
    x * x * x
  }

  // Take function as parameters
  def transformInt(x: Int, f: Int => Int): Int = {
    f(x)
  }

  val result = transformInt(2, cubeIt)

  val result2 = transformInt(3, x => x + 5)

  val result3 = transformInt(2, x => {
    val y = x * 2; y * y
  })
}