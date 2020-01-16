object practiceFile extends App {
  val a = List(1,2,3,4,5,6);

  val demo = new Demo();

  println("Last element of list: " + demo.lastElem(a))
}

class Demo {
  def lastElem(nums: List[Int]): Int ={
      return nums.last
  }
}
