package com.kissthinker

import org.scalatest._

/**
 * The following can not be run in ImplicitsSpec because of a clash of implicits between "fold" for Boolean in com.kissthinker.Implicits and Specs2 implicit of fold on Option.
 */
class ImplicitsTest extends FlatSpec with Matchers with Implicits {
  "Boolean" should "fold into the true path" in {
    true.fold("wrong path")("correct path") should be ("correct path")
  }

  "Boolean" should "fold into the false path" in {
    false.fold("correct path")("wrong path") should be ("correct path")
  }
}