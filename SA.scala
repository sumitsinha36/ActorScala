import scala.actors.Actor._
object SA{
  val sa2 = actor(
    for (i <- 1 to 10)
      println("That is a Question")    
  )
def main(args:Array[String]):Unit={
	println(sa2)
}
}