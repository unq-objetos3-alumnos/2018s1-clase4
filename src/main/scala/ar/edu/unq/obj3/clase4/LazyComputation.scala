package ar.edu.unq.obj3.clase4

import ar.edu.unq.obj3.clase4.ComplicatedStrings._


object ComplicatedStrings {
  type BeautifulString = ()=>String

  def nicer(a:BeautifulString, b:BeautifulString): String = {
    val resultA = a.apply()
    if (isNice(resultA)) resultA else b.apply()
  }

  private def isNice(text:String): Boolean = text.length > 5

  def beautify(text:String): BeautifulString = {
    ()=> {
      println(s"ejecutando beautify: $text")
      text
    }
  }
}

case class Perro(nombre:String, edad:Int)

object Algo {
  Perro("pepe", 5).copy(nombre = "boby")
}


object LazyComputation extends App {
  val result = nicer(
    beautify("unodostrescuatro"),
    beautify("dos")
  )
  println(s"El más lindo es $result")
}
