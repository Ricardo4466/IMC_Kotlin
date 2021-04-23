package br.senai.sp.jandira.imcb.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import br.senai.sp.jandira.imcb.R

class ImcActivity() : AppCompatActivity(), View.OnClickListener {


    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var buttonCalcular: Button

    private lateinit var editPeso : EditText
    private lateinit var editAltura : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        buttonCalcular = findViewById(R.id.button_Calcular)

        editPeso = findViewById(R.id.editpeso)
        editAltura = findViewById(R.id.editaltura)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        buttonCalcular.setOnClickListener(this)

        if (supportActionBar != null)
        {
            supportActionBar!!.hide()
        }

    }

    override fun onClick(v: View)
    {
       when (v.id)
       {
           R.id.button1 ->
           {
               btn1.background=getDrawable(R.drawable.button_style_active)
               btn2.background=getDrawable(R.drawable.button_style2)
           }
           R.id.button2 ->
           {
               btn2.background=getDrawable(R.drawable.button_style2_active)
               btn1.background=getDrawable(R.drawable.button_style)
           }
           R.id.button_Calcular ->
           {
               val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)
               abrirActivityResultado.putExtra("peso", editPeso.text.toString().toDouble())
               abrirActivityResultado.putExtra("altura", editAltura.text.toString().toDouble())
               startActivity(abrirActivityResultado)
           }
       }
    }

}