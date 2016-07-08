package org.awong.strings

import org.awong.AbstractWordSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class StringsSpec extends AbstractWordSpec {
  "This" should {
    "pass a trivial test" in {
      (1+0) should be (1)
    }
    "load pi.txt" in {
      val piOption = StringsData.pi
      piOption match {
        case Some(x) => {
          x should have length 100000
          x.last should be ('4')
        }
        case None => fail
      }
    }
    "load genome.txt" in {
      val genomeOption = StringsData.genomeVirus
      genomeOption match {
        case Some(x) => {
          x should have length 6251
          x.last should be ('A')
        }
        case None => fail
      }
    }
  }

}