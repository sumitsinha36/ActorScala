import scala.actors.Actor._
object EchoActor{
  val echoactor = actor{
	receive{
		case msg=> println("That is a Question")    
  	     }
	} 
def main(args:Array[String]):Unit={
	echoactor
	}
}