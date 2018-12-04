package foo

package object bar {
  case class A(v: B.C)

  object B {
    type C = E.Value
    object E extends Enumeration {
      val A, B, C = Value
    }
  }
}