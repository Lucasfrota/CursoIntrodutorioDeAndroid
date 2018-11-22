package com.oceanbrasil.book

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val livros: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adicionarLivros.setOnClickListener {
            abrirAdicionarLivro()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        try{

            TODO("Pegar o nome que a activity devolveu, adiciona-lo a lista de livros e atualizar o ListView")

        }catch (e: Exception){
            e.printStackTrace()
        }

    }

    private fun atualizarLista(livros: ArrayList<String>) {
        TODO("Atualizar o ListView que mostra a lista de livros")
    }

    private fun abrirAdicionarLivro() {
        TODO("Abrir Activity que adiciona livros")
    }
}
