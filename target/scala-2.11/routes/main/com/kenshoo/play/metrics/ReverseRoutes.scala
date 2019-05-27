
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/prod.routes
// @DATE:Mon May 27 11:01:14 BST 2019

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package com.kenshoo.play.metrics {

  // @LINE:6
  class ReverseMetricsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def metrics(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/metrics")
    }
  
  }


}
