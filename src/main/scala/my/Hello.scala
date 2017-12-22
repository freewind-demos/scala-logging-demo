package my

import com.typesafe.scalalogging.Logger

object Hello extends App {

  val logger = Logger(Hello.getClass)

  println("Hello, logger!")

  logger.trace("This is trace message")
  logger.debug("This is debug message")
  logger.info("This is info message")
  logger.warn("This is warn message")
  logger.error("This is error message")

}
