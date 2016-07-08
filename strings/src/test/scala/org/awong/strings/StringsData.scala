package org.awong.strings

import org.awong.stdlib.StdlibData

object StringsData extends org.awong.stdlib.ModuleData {
  def ababLZW: String = {
    "ABABABA"
  }

  def abra: String = {
    "ABRACADABRA!"
  }
  def abraLZW: String = {
    "ABRACADABRABRABRA"
  }

  def genomeTiny: String = {
    "ATAGATGCATAGCGCATAGCTAGATGTGCTAGC"
  }

  def genomeVirus: Option[String] = {
    StdlibData.resourceAsString("/genome.txt")
  }

  def pi: Option[String] = {
    StdlibData.resourceAsString("/pi.txt")
  }

  def medTale: Seq[String] = {
    org.awong.searching.SearchingData.medTale
  }

  def shells: Seq[String] = {
    Seq(
      "she sells seashells by the sea shore",
      "the shells she sells are surely seashells"
    )
  }

  def shellsST: String = {
    shells.head
  }

  def tale: Seq[String] = {
    org.awong.searching.SearchingData.tale
  }

  def tinyTinyTale = {
    org.awong.searching.SearchingData.tinyTinyTale
  }
}