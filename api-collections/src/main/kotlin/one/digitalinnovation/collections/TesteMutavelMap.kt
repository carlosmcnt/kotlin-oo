package one.digitalinnovation.collections

fun main() {
    val margot = Funcionario("Margot", 2700.0, "PJ")
    val victor = Funcionario("Victor", 7000.0, "PJ")
    val pedro = Funcionario("Pedro", 1200.0, "CLT")

    //Cria repositório e associa nomes aos funcionários
    val repositorio = Repositorio<Funcionario>()
    repositorio.create(victor.nome, victor)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(margot.nome, margot)

    println("----------- Procurando Margot pelo ID-----------")
    println(repositorio.findById(margot.nome))

    println("----------- Procurando todos -----------")
    repositorio.findAll().forEach { println(it) }

    println("----------- Após remover Margot -----------")
    repositorio.remove(margot.nome)
    repositorio.findAll().forEach { println(it) }
}