package br.senai.sp.jandira.imcb.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.senai.sp.jandira.imcb.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (supportActionBar != null)
        {
            supportActionBar!!.hide()
        }

        Handler(Looper.getMainLooper()).postDelayed({

            val abrirActivityMain = Intent(this, MenuActivity::class.java)
            startActivity(abrirActivityMain)
            finish()

        }, 3000 )




    }
}