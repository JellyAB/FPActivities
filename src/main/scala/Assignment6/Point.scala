package Assignment6

case class Point(cx:Int, cy:Int){
  def x: Int = cx
  def y: Int = cy
  def +(that: Point) = Point(this.x+that.x, this.y+that.y)
  def move(dx: Int, dy: Int) = Point(this.x + dx, this. y + dy)
  def distance = (that: Point) => math.sqrt(math.pow(that.x-this.x, 2) + math.pow(that.y-this.y, 2))
  def invert = Point(this.y, this.x)
}
