
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/prod.routes
// @DATE:Mon May 27 13:23:52 BST 2019


package prod {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
