package br.senai.sp.jandira.imcb.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.senai.sp.jandira.imcb.R
import kotlinx.android.synthetic.main.activity_imc.*
import kotlinx.android.synthetic.main.activity_imc.button_Calcular
import kotlinx.android.synthetic.main.activity_ncd.*

class ncdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        supportActionBar!!.hide()

        button_Calcular.setOnClickListener {
           CalculoNCD("F",
                        spinner_idade.selectedItemId +1)

        }
    }
}