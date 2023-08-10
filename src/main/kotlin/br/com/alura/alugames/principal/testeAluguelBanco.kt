package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco
import br.com.alura.alugames.dados.GamersDAO
import br.com.alura.alugames.dados.JogosDAO

fun main() {
    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    val gamerDAO = GamersDAO(manager)


    manager.close()
}