// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/receta/conf/routes
// @DATE:Sun Jan 31 16:40:58 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
