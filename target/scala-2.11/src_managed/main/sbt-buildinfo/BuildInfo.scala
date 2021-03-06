package uk.gov.hmrc

/** This object was generated by sbt-buildinfo. */
case object BuildInfo {
  /** The value is "vampirefsm". */
  val name = "vampirefsm"
  /** The value is "0.1.0-SNAPSHOT". */
  val version = "0.1.0-SNAPSHOT"
  /** The value is "2.11.11". */
  val scalaVersion = "2.11.11"
  /** The value is "0.13.17". */
  val sbtVersion = "0.13.17"
  /** The value is Seq("org.scala-lang:scala-library:2.11.11", "com.typesafe.play:twirl-api:1.1.1", "com.geirsson:scalafmt-core_2.12:1.5.1:scalafmt", "com.lucidchart:scalafmt-impl_2.12:1.16-1.5:scalafmt", "com.typesafe.play:play-server:2.5.19", "com.typesafe.play:play-test:2.5.19:test", "com.typesafe.play:play-omnidoc:2.5.19:docs", "com.typesafe.play:play-netty-server:2.5.19", "com.typesafe.play:play-logback:2.5.19", "com.typesafe.play:play-ws:2.5.19", "uk.gov.hmrc:bootstrap-play-25:4.10.0", "uk.gov.hmrc:govuk-template:5.23.0", "uk.gov.hmrc:play-ui:7.32.0-play-25", "uk.gov.hmrc:auth-client:2.9.0-play-25", "uk.gov.hmrc:play-fsm:0.37.0-play-25", "uk.gov.hmrc:play-partials:6.5.0", "uk.gov.hmrc:agent-kenshoo-monitoring:3.6.0", "uk.gov.hmrc:agent-mtd-identifiers:0.13.0", "uk.gov.hmrc:domain:5.3.0", "uk.gov.hmrc:mongo-caching:6.4.0-play-25", "uk.gov.hmrc:hmrctest:3.4.0-play-25:test", "org.scalatest:scalatest:3.0.5:test", "org.mockito:mockito-core:2.26.0:test", "org.scalatestplus.play:scalatestplus-play:2.0.1:test", "com.github.tomakehurst:wiremock:2.22.0:test", "uk.gov.hmrc:hmrctest:3.4.0-play-25:it", "org.scalatest:scalatest:3.0.5:it", "org.mockito:mockito-core:2.26.0:it", "org.scalatestplus.play:scalatestplus-play:2.0.1:it", "com.github.tomakehurst:wiremock:2.22.0:it"). */
  val libraryDependencies = Seq("org.scala-lang:scala-library:2.11.11", "com.typesafe.play:twirl-api:1.1.1", "com.geirsson:scalafmt-core_2.12:1.5.1:scalafmt", "com.lucidchart:scalafmt-impl_2.12:1.16-1.5:scalafmt", "com.typesafe.play:play-server:2.5.19", "com.typesafe.play:play-test:2.5.19:test", "com.typesafe.play:play-omnidoc:2.5.19:docs", "com.typesafe.play:play-netty-server:2.5.19", "com.typesafe.play:play-logback:2.5.19", "com.typesafe.play:play-ws:2.5.19", "uk.gov.hmrc:bootstrap-play-25:4.10.0", "uk.gov.hmrc:govuk-template:5.23.0", "uk.gov.hmrc:play-ui:7.32.0-play-25", "uk.gov.hmrc:auth-client:2.9.0-play-25", "uk.gov.hmrc:play-fsm:0.37.0-play-25", "uk.gov.hmrc:play-partials:6.5.0", "uk.gov.hmrc:agent-kenshoo-monitoring:3.6.0", "uk.gov.hmrc:agent-mtd-identifiers:0.13.0", "uk.gov.hmrc:domain:5.3.0", "uk.gov.hmrc:mongo-caching:6.4.0-play-25", "uk.gov.hmrc:hmrctest:3.4.0-play-25:test", "org.scalatest:scalatest:3.0.5:test", "org.mockito:mockito-core:2.26.0:test", "org.scalatestplus.play:scalatestplus-play:2.0.1:test", "com.github.tomakehurst:wiremock:2.22.0:test", "uk.gov.hmrc:hmrctest:3.4.0-play-25:it", "org.scalatest:scalatest:3.0.5:it", "org.mockito:mockito-core:2.26.0:it", "org.scalatestplus.play:scalatestplus-play:2.0.1:it", "com.github.tomakehurst:wiremock:2.22.0:it")
  /** The value is "2019-05-27". */
  val builtAt = "2019-05-27"
  /** The value is "master". */
  val GitBranch = "master"
  /** The value is "6bbb6e12ffc53f17f163032e01a12904ac18bd30". */
  val GitHeadRev = "6bbb6e12ffc53f17f163032e01a12904ac18bd30"
  /** The value is "false". */
  val GitRepoIsClean = "false"
  /** The value is "2019-05-27T12:41:17.000+01:00". */
  val GitCommitDate = "2019-05-27T12:41:17.000+01:00"
  /** The value is "Marianne Pearson". */
  val GitCommitAuthor = "Marianne Pearson"
  /** The value is "2019-05-27T12:53:15.996+01:00". */
  val BuildDate = "2019-05-27T12:53:15.996+01:00"
  /** The value is "6bbb6e12ffc53f17f163032e01a12904ac18bd30". */
  val GitDescribe = "6bbb6e12ffc53f17f163032e01a12904ac18bd30"
  override val toString = "name: %s, version: %s, scalaVersion: %s, sbtVersion: %s, libraryDependencies: %s, builtAt: %s, GitBranch: %s, GitHeadRev: %s, GitRepoIsClean: %s, GitCommitDate: %s, GitCommitAuthor: %s, BuildDate: %s, GitDescribe: %s" format (name, version, scalaVersion, sbtVersion, libraryDependencies, builtAt, GitBranch, GitHeadRev, GitRepoIsClean, GitCommitDate, GitCommitAuthor, BuildDate, GitDescribe)

  val toMap = Map[String, Any](
    "name" -> name,
    "version" -> version,
    "scalaVersion" -> scalaVersion,
    "sbtVersion" -> sbtVersion,
    "libraryDependencies" -> libraryDependencies,
    "builtAt" -> builtAt,
    "GitBranch" -> GitBranch,
    "GitHeadRev" -> GitHeadRev,
    "GitRepoIsClean" -> GitRepoIsClean,
    "GitCommitDate" -> GitCommitDate,
    "GitCommitAuthor" -> GitCommitAuthor,
    "BuildDate" -> BuildDate,
    "GitDescribe" -> GitDescribe)
}