package ar.edu.unq.obj3.clase4

case class User(name: String)

class UserRepository {
  def removeUser(user: User): Unit = {
    Thread.sleep(1000L)
  }

  def listUsers(): List[User] = {
    Thread.sleep(1500L)
    List(User("a"), User("b"), User("c"))
  }
}

object Logger {
  def log[T](bloque:()=>T): T = {
    val startTime = System.currentTimeMillis()

    val result = bloque.apply()

    val endTime = System.currentTimeMillis()
    println(s"took ${endTime - startTime}ms")
    result
  }
}

object TimeLogger extends App {
  val repository = new UserRepository()

  Logger.log(()=>repository.removeUser(User("a")))

  val users = Logger.log(()=> repository.listUsers())

}
