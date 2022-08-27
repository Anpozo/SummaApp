package com.example.sumaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var calculo:Button=findViewById(R.id.button)
        var valor1:EditText=findViewById(R.id.editTextNumber)
        var valor2:EditText=findViewById(R.id.editTextNumber2)
        var resultado:TextView=findViewById(R.id.textView2)
        var limpiar:Button=findViewById(R.id.button2)
    //val numero1:Int = valor1.text.toString().toInt()
    //val numero2:Int = valor2.text.toString().toInt()


        calculo.setOnClickListener {
            var result:Int

          if (valor1.text.toString().isEmpty() || valor2.text.toString().isEmpty()){

              Toast.makeText(this,"Intrduce un sumando",Toast.LENGTH_SHORT).show()
          }else{

           result= valor1.text.toString().toInt() + valor2.text.toString().toInt()
            resultado.setText(result.toString())}
        }

        limpiar.setOnClickListener {
            when(valor1.text.toString().isEmpty()){
                true->Toast.makeText(this, "Field cleared",Toast.LENGTH_SHORT).show()
                false-> valor1.text.clear()
            }
            when(valor2.text.toString().isEmpty()){
                true->Toast.makeText(this, "Field cleared",Toast.LENGTH_SHORT).show()
                false-> valor2.text.clear()
            }
            when(resultado.text.toString().isEmpty()){
                true->Toast.makeText(this, "Field cleared", Toast.LENGTH_SHORT).show()
                false->resultado.setText("")
            }
        }
    }



}