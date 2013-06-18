package models
import scala.slick.driver.H2Driver

object Config {
  val driver = H2Driver
  def driver(app: Any): H2Driver = driver
}
import Config.driver.simple._
class Site
object tables{
  class Sites extends Table[Site]("SITE"){
    def * = null
  }
}

