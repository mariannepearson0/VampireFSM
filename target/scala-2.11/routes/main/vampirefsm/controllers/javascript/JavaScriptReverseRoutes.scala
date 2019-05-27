
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/app.routes
// @DATE:Mon May 27 13:23:52 BST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package vampirefsm.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:3
  class ReverseVampireFSMController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def submitStart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.submitStart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "start"})
        }
      """
    )
  
    // @LINE:4
    def start: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.start",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "start"})
        }
      """
    )
  
    // @LINE:10
    def showSun: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.showSun",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sun"})
        }
      """
    )
  
    // @LINE:7
    def submitAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.submitAge",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "age"})
        }
      """
    )
  
    // @LINE:9
    def submitBiteMarks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.submitBiteMarks",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bite-marks"})
        }
      """
    )
  
    // @LINE:3
    def root: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.root",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def showBiteMarks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.showBiteMarks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bite-marks"})
        }
      """
    )
  
    // @LINE:6
    def showAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.showAge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "age"})
        }
      """
    )
  
    // @LINE:12
    def showEnd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.showEnd",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "end"})
        }
      """
    )
  
    // @LINE:11
    def submitSun: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "vampirefsm.controllers.VampireFSMController.submitSun",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sun"})
        }
      """
    )
  
  }


}
