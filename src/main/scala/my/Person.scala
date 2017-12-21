package my

case class Person(name: String, age: Int, address: Option[String], phones: List[String] /* don't use Array! */)
