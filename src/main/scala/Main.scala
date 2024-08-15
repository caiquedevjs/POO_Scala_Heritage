object Main extends App {
  val dev1 = new Desenvolvedor("Bruno",25, Array("Scala","java","Node"))
  println(s"${dev1.name} tenha suas habilidades em: ${dev1.skills.mkString(", ")} e domina ${dev1.mensageria}")
}