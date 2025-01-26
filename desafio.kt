data class ConteudoEducacional(val nome: String, val duraçao: Int)

class Aluno(val nome: String) {
    override fun toString(): String {
        return nome
    }
}

data class Formacao(val nome: String, var nivel: String, val conteudos: List<ConteudoEducacional>) {
    
    private val alunosMatriculados = mutableListOf<Aluno>()
    private val formaçaokotlin: String = "Formação Kotlin"
    
    fun matricular(vararg alunos: Aluno) {
        alunosMatriculados.addAll(alunos)
     
    }
    
    fun mostrarAlunosMatriculados() {
        if (alunosMatriculados.isEmpty()) {
            println("Não há alunos matriculados na formação $formaçaokotlin")
        } else {
            println("Os alunos $alunosMatriculados foram matriculados com sucesso no curso $formaçaokotlin, eles já podem dar o seu primeiro passo para sua formação")
        }
    }
}

fun main() {
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 10)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 20)
    
    val formacaoKotlin = Formacao("Formação Kotlin", "Intermediário", listOf(kotlinBasico, kotlinAvancado))
    
    val aluno1 = Aluno("Alice")
    val aluno2 = Aluno("Bob")
    
    formacaoKotlin.matricular(aluno1, aluno2)
    formacaoKotlin.mostrarAlunosMatriculados()
}
    