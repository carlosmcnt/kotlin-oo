package one.digitalinnovation.digionebank

/*  Classe para armazenamento de informações específicas
    ou um objeto que não devem ser modificado
 */
data class Banco(val nome: String, val numero: Int){
    fun info () = "$nome - $numero"
}