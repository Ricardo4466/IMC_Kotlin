package br.senai.sp.jandira.imcb.gui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import br.senai.sp.jandira.imcb.R

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var IMC: CardView
    private lateinit var NCD: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        IMC = findViewById(R.id.Card_IMC)

        NCD = findViewById(R.id.Card_NCD)

        IMC.setOnClickListener(this)
        NCD.setOnClickListener(this)

        if (supportActionBar != null)
        {
            supportActionBar!!.hide()
        }

    }

    override fun onClick(v: View) {

        if (v.id == R.id.Card_NCD) {

            val intentNCD= Intent(this, ncdActivity::class.java)
            startActivity(intentNCD)

        } else if (v.id == R.id.Card_IMC) {
            val intentIMC = Intent(this, ImcActivity::class.java)
            startActivity(intentIMC)
        }else{
            Toast.makeText(this,"nada Foi Clicado!!", Toast.LENGTH_SHORT).show()
        }




    }
}

