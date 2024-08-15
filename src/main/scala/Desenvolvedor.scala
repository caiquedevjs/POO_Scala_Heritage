class Desenvolvedor(nome: String, idade: Int, stack: Array[String]) extends Pessoa(nome, idade) with MicroSerivco{
    val skills: Array[String] = stack
}
