package ar.edu.unq.obj3.clase4

import ar.edu.unq.obj3.clase4.ComplicatedStrings._


object ComplicatedStrings {
  def nicer(a:String, b:String): String = {
    if (isNice(a)) a else b
  }

  private def isNice(text:String): Boolean = text.length > 5

  def beautify(text:String): String = {
    println(s"ejecutando beautify: $text")
    text
  }
}

object LazyComputation extends App {
  val result = nicer(beautify("uno"), beautify("dos"))
}
