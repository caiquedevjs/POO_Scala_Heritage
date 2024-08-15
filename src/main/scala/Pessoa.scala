class Pessoa(nome: String, idade: Int){
    val name: String = nome
    val  age: Int = idade
    def Apresentar() : Unit = {
        println(s"Olá eu me chamo ${this.name} e tenho ${this.age} anos")
    }
}
