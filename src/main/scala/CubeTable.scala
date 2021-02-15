import scala.io.StdIn.readLine

object CubeTable extends App {
  //TODO write a program that takes user input for starting and end values
  //then saves cubes of those values in a Seq data type and then prints the cubes out
  val begVal = readLine("What is the starting value?")
  println(s"Will print cubes starting with cube for $begVal")
  val endVal = readLine ("What is the end value?")
  println(s"Will print cubes ending with cube for $endVal")
  val mySeq = Seq(begVal.map(math.pow(_, 3)), endVal.map(math.pow(_, 3)))
  println(mySeq)

}
