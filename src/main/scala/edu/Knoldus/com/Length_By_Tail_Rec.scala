package edu.Knoldus.com

import scala.annotation.tailrec

class Length_By_Tail_Rec {
  @tailrec
  final def len(list: List[Int], accum: Int = 0): Int= {
    if(list.isEmpty) accum
    else len(list.tail, accum+1)
  }

}
object main extends App{
  val obj=new Length_By_Tail_Rec
  val list:List[Int]= List(8,2,5,7,1)
  println(obj.len(list))
}
