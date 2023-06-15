enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var login: String, val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel : Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val user1 = Usuario("login.mary", "Mary")
    val conteudo1 = ConteudoEducacional("Kotlin - introdução")
    val conteudo2 = ConteudoEducacional("Java - introdução") 
    val formacao1 = Formacao("Trilha Backend", Nivel.BASICO, mutableListOf(conteudo1, conteudo2))
    
    formacao1.matricular(user1)
    
	println(formacao1.inscritos)
    
}