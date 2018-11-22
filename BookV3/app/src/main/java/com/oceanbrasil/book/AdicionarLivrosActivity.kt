package com.oceanbrasil.book

import android.content.Intent
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
        val output: Intent = Intent()
        setResult(RESULT_OK, output)
        finish()
    }

    private fun salvarLivro() {
        val output: Intent = Intent()
        output.putExtra("nome", nomeDoLivro.text.toString())
        setResult(RESULT_OK, output)
        finish()
    }
}


