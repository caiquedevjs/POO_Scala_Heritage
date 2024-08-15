trait MicroSerivco {
  val mensageria : String = "RabbitMQ"
  val dominio: String = "MicroServiço"
  def aperfeicoamento() : Unit ={
    println(s"Dominio ${this.mensageria} dentro de ${this.dominio}")
  }
};
