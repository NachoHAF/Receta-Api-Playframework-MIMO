// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/Receta-api/conf/routes
// @DATE:Sun Feb 21 18:34:36 CET 2021


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
