package my

import org.json4s._
import org.json4s.native.JsonMethods._
import org.json4s.DefaultFormats
import org.scalatest.{FunSuite, Matchers}
import org.json4s.native.Serialization.{read, write}

class PersonSpec extends FunSuite with Matchers {

  implicit val formats = DefaultFormats

  test("Person to JSON") {
    val person = Person("Freewind", 100, Some("China"), List("111", "222"))
    val json = write(person)
    json shouldBe """{"name":"Freewind","age":100,"address":"China","phones":["111","222"]}"""
  }

  test("JSON to Person") {
    val json = """{"name":"Freewind","age":100,"address":"China","phones":["111","222"]}"""
    val person = read[Person](json)
    person shouldBe Person("Freewind", 100, Some("China"), List("111", "222"))
  }
}
