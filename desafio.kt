data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel:Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario foi matriculado na formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario()
    val conteudo1 = ConteudoEducacional("Programção em Java")
    val formacao1 = Formacao("Desenvolvimento de software com Java", Nivel.BASICO, listOf(conteudo1))
    
    formacao1.matricular(usuario1)
    
    val usuario2 = Usuario()
    val conteudo2 = ConteudoEducacional("Programacao em Javascript")
    val formacao2 = Formacao("Desenvolvimento em Javascript", Nivel.INTERMEDIARIO, listOf(conteudo2))
    
    formacao2.matricular(usuario2)
    
    val usuario3 = Usuario()
    val conteudo3 = ConteudoEducacional("Programação em Kotlin")
    val formacao3 = Formacao("Desenvolvimento em Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo3))
    
    formacao3.matricular(usuario3)
    
    
}