package com.oceanbrasil.book

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val livros: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adicionarLivros.setOnClickListener {
            abrirAdicionarLivro()
        }

        listaDeLivros.setOnItemClickListener { parent, view, position, id ->
            mostrarInformacao(livros[position])
        }
    }

    private fun mostrarInformacao(nomeDoLivro: String) {
        Toast.makeText(this, nomeDoLivro, Toast.LENGTH_LONG).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        try{

            val nomeDoLivro: String = data!!.getStringExtra("nome")
            livros.add(nomeDoLivro)
            atualizarLista(livros)

        }catch (e: Exception){
            e.printStackTrace()
        }

    }

    private fun atualizarLista(livros: ArrayList<String>) {
        val itensAdapter = ArrayAdapter<String>(this,
                                                android.R.layout.simple_list_item_1,
                                                livros)
        listaDeLivros.adapter = itensAdapter
    }

    private fun abrirAdicionarLivro() {
        val adicionarLivroIntent = Intent(this, AdicionarLivrosActivity::class.java)
        startActivityForResult(adicionarLivroIntent, 0)
    }
}



