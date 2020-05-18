package Assignment1
import scala.math._
object VolumeOfSphere extends App{
  def getVol(r:Double)=4.0/3*Pi*math.pow(r,3);
  println(getVol(5));
}
