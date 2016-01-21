import scala.util.Random

case class CreditCard(number: String)

case class PaymentInfo(billed: Double)

class Bank(name: String) {

  def proccess(toBill: Double, card: CreditCard): PaymentInfo = {
    println(s"you've seriously been billed with amount ${toBill} on ${card.number}, there is no going back'")
    PaymentInfo(toBill)
  }

}

case class Order(what: List[String], amount: Double) {

  def merge(other: Order) = ???
}

class Bar(name: String) {

  // crazy bar, aint it?
  def price(what: String): Double = new Random().nextInt(100).toDouble

  def order(what: String): Order =  {
    val amount = price(what)
    println(s"Prepared order for $what, costs: $amount")
    Order(List(what), amount)
  }

  def prepareBill(order: Order)(processor: (Double,CreditCard) => PaymentInfo): CreditCard => Unit = ???
}


// if u run it, you pay
object CoreApp extends App {

  val bank = new Bank("Very deadly serious bank")
  val bar = new Bar("Puzzle")


  // first arg holds credit card number
  val creditCardNumber = args.head
  // rest hold what client wants to order
  val whats = args.tail
  println(s"we are going to order $whats")

  val finalOrder: Order = ???
  println("ordered!")

  println("check please!")
  val bill: CreditCard => Unit = ???


  bill(CreditCard(creditCardNumber))
  println("paid, goodbye!")
}

object TestRunner {

  // write some tests!!XS


}
