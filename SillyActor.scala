import scala.actors.Actor
import scala.actors.Actor._
import java.lang.Thread

object SillyActor extends Actor {
	def act() {
	    for (i <- 1 to 10) {
	      println("i = " + i + "\tI am Sumit's Actor")
	      Thread.sleep(1000)
	    }
	  }
	def main(args:Array[String]):Unit=
	{
		SillyActor.start()
	}
}
