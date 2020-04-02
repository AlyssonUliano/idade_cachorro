package com.example.idade_cachorro


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun validaCampo(idadeC: String): Boolean {
        var camposValidos: Boolean = true

        if (idadeC == null || idadeC.equals("")) {
            camposValidos = false
        }

        return camposValidos
    }

    fun calculaIdade(idadeC: String) {
        val valorIdade = idadeC.toInt()

        val resultadoIdade = valorIdade * 7

        val intent = Intent(applicationContext, Activity_segunda::class.java)
        intent.putExtra("idade", resultadoIdade )
        startActivity(intent)

    }

    fun bCalcular(view: View) {
        val idadeC = edit_ida_dog.text.toString()

        val validaCampo = validaCampo(idadeC)

        if (validaCampo) {
            calculaIdade(idadeC)
        } else {
            teste_resultado.setText("Preencha a idade")
        }


    }


}
