package Assignment6

case object example extends App{
  var p1 = Point(1,2)
  var p2 = Point(4,5)

  //Display points
  println("\nThe points used in the example : ")
  println("p1 = "+p1)
  println("p2 = "+p2)

  //Distance
  printf("\nDistance between p1 and p2 : ")
  println(p1.distance(p2))

  //Add (+)
  printf("\nAdd p1 and p2 : ")
  println(p1+p2)

  //Move
  println("\nMove p1 by dy=1 and dx=1 distances ==> ")
  val p4 = p1.move(1,1)
  p1=p4.copy()
  println("New p1 cordinates : "+p1)


  //Invert
  printf("\nInvert p2 ==> ")
  val p5 = p2.invert
  p2=p5.copy()
  println("\nNew p2 cordinates : "+p2)

}
