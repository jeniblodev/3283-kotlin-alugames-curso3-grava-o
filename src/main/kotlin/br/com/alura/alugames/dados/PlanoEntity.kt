package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.PlanoAvulso

sealed class PlanoEntity(val tipo: String)

class PlanoAvulsoEntity(tipo: String): PlanoEntity(tipo)

class PlanoAssinaturaEntity(
    tipo: String,
    val mensalidade: Double,
    val jogosIncluidos: Int,
    val percentualDescontoReputacao: Double): PlanoEntity(tipo)