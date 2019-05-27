
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/prod.routes
// @DATE:Mon May 27 13:23:52 BST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package com.kenshoo.play.metrics.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseMetricsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def metrics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.kenshoo.play.metrics.MetricsController.metrics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/metrics"})
        }
      """
    )
  
  }


}
