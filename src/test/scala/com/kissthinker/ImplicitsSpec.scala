package com.kissthinker

import org.specs2.mutable.Specification

class ImplicitsSpec extends Specification {
  "String" should {
    "act like a list whereby we check that a list of string contains a given string" in {
      "John" ++ "Paul" ++ "George" ++ "Ringo" contains "Paul" should beTrue
    }

    "act like a list whereby we check that a list of string does not contain a given string" in {
      "John" ++ "Paul" ++ "George" ++ "Ringo" contains "David" should beFalse
    }
  }
}