
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/app.routes
// @DATE:Mon May 27 13:23:52 BST 2019

package app

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  VampireFSMController_0: javax.inject.Provider[vampirefsm.controllers.VampireFSMController],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    VampireFSMController_0: javax.inject.Provider[vampirefsm.controllers.VampireFSMController]
  ) = this(errorHandler, VampireFSMController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    app.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, VampireFSMController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@vampirefsm.controllers.VampireFSMController@.root"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """start""", """@vampirefsm.controllers.VampireFSMController@.start"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """start""", """@vampirefsm.controllers.VampireFSMController@.submitStart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """age""", """@vampirefsm.controllers.VampireFSMController@.showAge"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """age""", """@vampirefsm.controllers.VampireFSMController@.submitAge"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bite-marks""", """@vampirefsm.controllers.VampireFSMController@.showBiteMarks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bite-marks""", """@vampirefsm.controllers.VampireFSMController@.submitBiteMarks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sun""", """@vampirefsm.controllers.VampireFSMController@.showSun"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sun""", """@vampirefsm.controllers.VampireFSMController@.submitSun"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """end""", """@vampirefsm.controllers.VampireFSMController@.showEnd"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val vampirefsm_controllers_VampireFSMController_root0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_root0_invoker = createInvoker(
    VampireFSMController_0.get.root,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "root",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:4
  private[this] lazy val vampirefsm_controllers_VampireFSMController_start1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_start1_invoker = createInvoker(
    VampireFSMController_0.get.start,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "start",
      Nil,
      "GET",
      """""",
      this.prefix + """start"""
    )
  )

  // @LINE:5
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitStart2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitStart2_invoker = createInvoker(
    VampireFSMController_0.get.submitStart,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "submitStart",
      Nil,
      "POST",
      """""",
      this.prefix + """start"""
    )
  )

  // @LINE:6
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showAge3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("age")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showAge3_invoker = createInvoker(
    VampireFSMController_0.get.showAge,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "showAge",
      Nil,
      "GET",
      """""",
      this.prefix + """age"""
    )
  )

  // @LINE:7
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitAge4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("age")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitAge4_invoker = createInvoker(
    VampireFSMController_0.get.submitAge,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "submitAge",
      Nil,
      "POST",
      """""",
      this.prefix + """age"""
    )
  )

  // @LINE:8
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showBiteMarks5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bite-marks")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showBiteMarks5_invoker = createInvoker(
    VampireFSMController_0.get.showBiteMarks,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "showBiteMarks",
      Nil,
      "GET",
      """""",
      this.prefix + """bite-marks"""
    )
  )

  // @LINE:9
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitBiteMarks6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bite-marks")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitBiteMarks6_invoker = createInvoker(
    VampireFSMController_0.get.submitBiteMarks,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "submitBiteMarks",
      Nil,
      "POST",
      """""",
      this.prefix + """bite-marks"""
    )
  )

  // @LINE:10
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showSun7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sun")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showSun7_invoker = createInvoker(
    VampireFSMController_0.get.showSun,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "showSun",
      Nil,
      "GET",
      """""",
      this.prefix + """sun"""
    )
  )

  // @LINE:11
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitSun8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sun")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_submitSun8_invoker = createInvoker(
    VampireFSMController_0.get.submitSun,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "submitSun",
      Nil,
      "POST",
      """""",
      this.prefix + """sun"""
    )
  )

  // @LINE:12
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showEnd9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("end")))
  )
  private[this] lazy val vampirefsm_controllers_VampireFSMController_showEnd9_invoker = createInvoker(
    VampireFSMController_0.get.showEnd,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "vampirefsm.controllers.VampireFSMController",
      "showEnd",
      Nil,
      "GET",
      """""",
      this.prefix + """end"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case vampirefsm_controllers_VampireFSMController_root0_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_root0_invoker.call(VampireFSMController_0.get.root)
      }
  
    // @LINE:4
    case vampirefsm_controllers_VampireFSMController_start1_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_start1_invoker.call(VampireFSMController_0.get.start)
      }
  
    // @LINE:5
    case vampirefsm_controllers_VampireFSMController_submitStart2_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_submitStart2_invoker.call(VampireFSMController_0.get.submitStart)
      }
  
    // @LINE:6
    case vampirefsm_controllers_VampireFSMController_showAge3_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_showAge3_invoker.call(VampireFSMController_0.get.showAge)
      }
  
    // @LINE:7
    case vampirefsm_controllers_VampireFSMController_submitAge4_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_submitAge4_invoker.call(VampireFSMController_0.get.submitAge)
      }
  
    // @LINE:8
    case vampirefsm_controllers_VampireFSMController_showBiteMarks5_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_showBiteMarks5_invoker.call(VampireFSMController_0.get.showBiteMarks)
      }
  
    // @LINE:9
    case vampirefsm_controllers_VampireFSMController_submitBiteMarks6_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_submitBiteMarks6_invoker.call(VampireFSMController_0.get.submitBiteMarks)
      }
  
    // @LINE:10
    case vampirefsm_controllers_VampireFSMController_showSun7_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_showSun7_invoker.call(VampireFSMController_0.get.showSun)
      }
  
    // @LINE:11
    case vampirefsm_controllers_VampireFSMController_submitSun8_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_submitSun8_invoker.call(VampireFSMController_0.get.submitSun)
      }
  
    // @LINE:12
    case vampirefsm_controllers_VampireFSMController_showEnd9_route(params) =>
      call { 
        vampirefsm_controllers_VampireFSMController_showEnd9_invoker.call(VampireFSMController_0.get.showEnd)
      }
  }
}
