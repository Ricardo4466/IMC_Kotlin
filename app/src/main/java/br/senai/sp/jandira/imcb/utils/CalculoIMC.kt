package br.senai.sp.jandira.imcb.utils

import br.senai.sp.jandira.repository.Frases
import java.text.DecimalFormat
import java.util.*

fun calcularImc(peso:Double, altura:Double) : Array<String>{

    val imc = peso / Math.pow(altura, 2.0)
    val status = obterStatus(imc)
    return arrayOf(formatarDouble(imc), status, obterFrase(status))
}

fun obterFrase(status: String): String {
    var tamanho = 0
    if(status == "peso Ideal")
    {
        val tamanho = Frases.frasesIdeal.size
       return Frases.frasesIdeal[Random().nextInt(tamanho)]
    }else{

        val tamanho = Frases.frasesNaoIdeal.size
        return Frases.frasesNaoIdeal[Random().nextInt(tamanho)]
    }
}

fun formatarDouble(valor:Double) : String
{
    val df = DecimalFormat("##,###.#")
    return df.format(valor)
}

    fun obterStatus(imc:Double) : String{
        if(imc < 18.5)
        {
            return "Abaixo do peso"
        }else if(imc >=18.6 && imc < 25.0)
        {
            return "peso Ideal"
        }else if (imc >= 25 && imc < 30)
        {
            return "Levemente acima do Peso"
        }else if (imc >= 30 && imc < 35)
        {
            return "Obesidade grau I"
        }else if (imc >= 35 && imc < 40)
        {
            return "Obesidade grau II"
        }else{
            return "Obesidade grau III"
        }

    }
