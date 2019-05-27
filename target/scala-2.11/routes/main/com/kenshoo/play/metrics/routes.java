
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/prod.routes
// @DATE:Mon May 27 13:23:52 BST 2019

package com.kenshoo.play.metrics;

import prod.RoutesPrefix;

public class routes {
  
  public static final com.kenshoo.play.metrics.ReverseMetricsController MetricsController = new com.kenshoo.play.metrics.ReverseMetricsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final com.kenshoo.play.metrics.javascript.ReverseMetricsController MetricsController = new com.kenshoo.play.metrics.javascript.ReverseMetricsController(RoutesPrefix.byNamePrefix());
  }

}
