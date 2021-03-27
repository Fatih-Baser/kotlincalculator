package com.selahattinbaser.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int?=null
    var number2 : Int?=null
    var result : Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun mysum(view : View){

        number1=sayi2.text.toString().toIntOrNull()
        number2=sayi1.text.toString().toIntOrNull()


        if(number1 ==null || number2 == null ){
            resultText.text="Error!"
        }
        else{

            result=number1!!+number2!!
            resultText.text="Result:  $result"
        }


    }
    fun mysub(view:View){

        number1=sayi2.text.toString().toIntOrNull()
        number2=sayi1.text.toString().toIntOrNull()


        if(number1 ==null || number2 == null ){
            resultText.text="Error!"
        }
        else{

            result=number1!!-number2!!
            resultText.text="Result:  $result"
        }


    }
    fun myMultiple(view:View){

        number1=sayi2.text.toString().toIntOrNull()
        number2=sayi1.text.toString().toIntOrNull()


        if(number1 ==null || number2 == null ){
            resultText.text="Error!"
        }
        else{

            result=number1!!*number2!!
            resultText.text="Result:  $result"
        }


    }
    fun  myDiv(view :View){

        number1=sayi2.text.toString().toIntOrNull()
        number2=sayi1.text.toString().toIntOrNull()


        if(number1 ==null || number2 == null ){
            resultText.text="Error!"
        }
        else{

            result=number1!!/number2!!
            resultText.text="Result:  $result"
        }


    }
}