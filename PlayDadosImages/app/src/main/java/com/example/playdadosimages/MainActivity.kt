package com.example.playdadosimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybotao : Button = findViewById(R.id.id_btn_play)

        mybotao.setOnClickListener { chamarJogo() }

        chamarJogo()

        }
    private fun chamarJogo(){
        val dadosImage : ImageView = findViewById(R.id.imageView2)



        val escolhaDados = Dados(6)


        when (escolhaDados.jogarDados()) {
            1 -> dadosImage.setImageResource(R.drawable.dice_1)
            2 -> dadosImage.setImageResource(R.drawable.dice_2)
            3 -> dadosImage.setImageResource(R.drawable.dice_3)
            4 -> dadosImage.setImageResource(R.drawable.dice_4)
            5 -> dadosImage.setImageResource(R.drawable.dice_5)
            6 -> dadosImage.setImageResource(R.drawable.dice_6)
        }
        dadosImage.contentDescription = escolhaDados.jogarDados().toString()
    }



    }


class Dados(val lados : Int) {
    fun jogarDados(): Int{
        return (1..lados).random()
    }

//val toast = Toast.makeText(this, "Você é Foda!", Toast.LENGTH_LONG).show()


}