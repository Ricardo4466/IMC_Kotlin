package br.senai.sp.jandira.imcb.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.senai.sp.jandira.imcb.R
import br.senai.sp.jandira.imcb.utils.calcularImc
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textViewResultado : TextView
    private lateinit var textViewStatus: TextView
    private lateinit var textViewFrase: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (supportActionBar != null)
        {
            supportActionBar!!.hide()
        }

         textViewResultado = findViewById<TextView>(R.id.text_view_resultado)
         textViewStatus = findViewById<TextView>(R.id.text_view_status)
        textViewFrase = findViewById<TextView>(R.id.text_view_frase)
        exibirResultado()
    }

    private fun exibirResultado(){
        val resultado = calcularImc(intent.getDoubleExtra("peso", 0.0), intent.getDoubleExtra("altura", 0.0))

        textViewResultado.text = resultado[0]
        textViewStatus.text = resultado [1]
        textViewFrase.text = resultado[2]
    }
}