package models
import Config.driver.simple._

object DAOWrapper{
  abstract class DAOBase[E]{
    type TableType <: Table[E]
  }
  object SitesDAO extends DAOBase[Site]{
    type TableType = tables.Sites
  }
}

