package com.kissthinker

trait Implicits {
  implicit def booleanExtension(b: Boolean) = new {
    def fold[R](falseCase: => R)(trueCase: => R) = if (b) trueCase else falseCase
  }

  implicit def stringExtension(s: String) = new {
    def ++(other: String) = List(s, other)

    def ++(other: List[String]) = List(s) ++ other
  }

  case class ListExtension[A](l: List[A]) {
    def ++(a: A): List[A] = l :+ a
  }

  implicit def listExtension[A](l: List[A]) = ListExtension(l)
}

object Implicits extends Implicits