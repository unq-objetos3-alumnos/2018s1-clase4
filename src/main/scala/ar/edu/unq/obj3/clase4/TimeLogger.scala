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

object Main extends App {
  val repository = new UserRepository()

  val startTime = System.currentTimeMillis()
  repository.removeUser(User("a"))
  val endTime = System.currentTimeMillis()
  println(s"removeUser took ${endTime - startTime}ms")


  val startTime2 = System.currentTimeMillis()
  val users = repository.listUsers()
  val endTime2 = System.currentTimeMillis()
  println(s"removeUser took ${endTime2 - startTime2}ms")


}