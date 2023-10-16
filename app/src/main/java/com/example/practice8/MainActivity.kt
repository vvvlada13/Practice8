package com.example.practice8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.view.View
import android.widget.Toast
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var num1:String = " "
    var num2: String = ""
    var symbol = " "
    fun btn00(view: View)
    {
        val btn = view as Button
        val text:TextView = findViewById(R.id.resultTextView)
        when (btn.id)
        {
            R.id.zero -> output("0")
            R.id.one -> output("1")
            R.id.two -> output("2")
            R.id.three -> output("3")
            R.id.four -> output("4")
            R.id.five -> output("5")
            R.id.six -> output("6")
            R.id.seven -> output("7")
            R.id.eight -> output("8")
            R.id.nine -> output("9")

            R.id.multiply -> {
                symbol = "*"
                num1 = text.text.toString()
                text.setText("").toString()
            }

            R.id.subtract->{
                symbol = "-"
                num1 = text.text.toString()
                text.setText("").toString()

            }

            R.id.add ->{
                symbol = "+"
                num1 = text.text.toString()
                text.setText("").toString()


            }

            R.id.divide-> {
                symbol = "/"
                num1 = text.text.toString()
                text.setText("").toString()

            }

            R.id.clear -> text.text = ""
            R.id.equal -> btnEquals(num1)

        }
    }
    fun output(str:String){
        val text:TextView = findViewById(R.id.resultTextView)
        text.append(str)
    }
    fun btnEquals(num1:String)
    {
        val text: TextView = findViewById(R.id.resultTextView)
        var num1= num1
        num2 = text.text.toString()
        when(symbol){
            "+" -> text.text ="${(num1.toDouble() + num2.toDouble())}"
            "-" -> text.text ="${(num1.toDouble() - num2.toDouble())}"
            "*" -> text.text ="${(num1.toDouble() * num2.toDouble())}"
            "/" -> {
                if(num1.toInt()!=0){
                    text.text = "${(num1.toDouble() / num2.toDouble())}"
                }
                else {
                    val checkDataToast = Toast.makeText(this, "Ошибка:деление на ноль!", Toast.LENGTH_SHORT)
                    checkDataToast.show()
                }

            }
        }
    }

}