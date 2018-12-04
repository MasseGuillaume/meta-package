package foo.json

import foo.bar._

import spray.json._
import DefaultJsonProtocol._

object P {
  implicit val f2: RootJsonFormat[B.C] = ???
  implicit val f = jsonFormat1(A)
}