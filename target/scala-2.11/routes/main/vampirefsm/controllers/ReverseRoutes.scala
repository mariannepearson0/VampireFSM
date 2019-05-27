
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/app.routes
// @DATE:Mon May 27 12:21:46 BST 2019

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package vampirefsm.controllers {

  // @LINE:3
  class ReverseVampireFSMController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def submitStart(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "start")
    }
  
    // @LINE:4
    def start(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "start")
    }
  
    // @LINE:10
    def showSun(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sun")
    }
  
    // @LINE:7
    def submitAge(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "age")
    }
  
    // @LINE:9
    def submitBiteMarks(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bite-marks")
    }
  
    // @LINE:3
    def root(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def showBiteMarks(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bite-marks")
    }
  
    // @LINE:6
    def showAge(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "age")
    }
  
    // @LINE:12
    def showEnd(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "end")
    }
  
    // @LINE:11
    def submitSun(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sun")
    }
  
  }


}
