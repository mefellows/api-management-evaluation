import apimanagementevaluation.Dependencies
import AssemblyKeys._ // put this at the top of the file

resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

giter8.ScaffoldPlugin.scaffoldSettings

resolvers += "Typesafe" at "http://repo.typesafe.com/typesafe/releases/"

name := "api-management-evaluation"

assemblySettings

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  Dependencies.Compile.respite,
  Dependencies.Compile.scalatra,
  Dependencies.Compile.scalate,
  Dependencies.Compile.logback,
  Dependencies.Compile.scalatraAuth,
  Dependencies.Compile.scalatraJson,
  Dependencies.Compile.subcut,
  Dependencies.Compile.Web.jettyServlet,
  Dependencies.Compile.Web.jettyWebapp,
  Dependencies.Compile.Test.specs2,
  Dependencies.Compile.Test.scalatest,
  Dependencies.Compile.Test.scalatestMongo,
  Dependencies.Compile.Test.scalatraTest,
  Dependencies.Compile.Test.scalaMock,
  Dependencies.Compile.Test.mockito
)

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) => {
  case "logback.xml" => MergeStrategy.first
  case x => old(x)
}
}

mainClass in assembly := Some("au.com.respite.JettyLauncher")

mainClass in Compile := Some("au.com.respite.JettyLauncher")

jarName in assembly := "api-management-evaluation.jar"