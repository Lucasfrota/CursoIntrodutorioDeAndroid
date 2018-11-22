package com.oceanbrasil.book

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adicionar_livros.*

class AdicionarLivrosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_livros)

        cancelar.setOnClickListener {
            fecharActivity()
        }

        salvar.setOnClickListener {
            salvarLivro()
        }

    }

    private fun fecharActivity() {
        TODO("Fechar activity retornando um intent vazio")
    }

    private fun salvarLivro() {
        TODO("Fechar activity retornando um intent contendo as informações coletadas nesta tela")
    }
}
