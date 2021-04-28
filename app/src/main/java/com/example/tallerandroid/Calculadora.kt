package com.example.tallerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btnUno : Button
    lateinit var btnDos : Button
    lateinit var btnTres : Button
    lateinit var btnCuadro : Button
    lateinit var btnCinco : Button
    lateinit var btnSeis : Button
    lateinit var btnSiete : Button
    lateinit var btnOcho : Button
    lateinit var btnNueve : Button
    lateinit var btnMenos : Button
    lateinit var btnMas : Button
    lateinit var btnPor : Button
    lateinit var btnDividido : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado=findViewById(R.id.txtResultado)
        txtResultado.text="Hola mundo"

        btnUno=findViewById(R.id.btnUno)
        btnDos=findViewById(R.id.btnDos)
        btnTres=findViewById(R.id.btnTres)
        btnCuadro=findViewById(R.id.btnCuatro)
        btnCinco=findViewById(R.id.btnCinco)
        btnSeis=findViewById(R.id.btnSeis)
        btnSiete=findViewById(R.id.btnSiete)
        btnOcho=findViewById(R.id.btnOcho)
        btnNueve=findViewById(R.id.btnNueve)


        btnUno.setOnClickListener{
            txtResultado.text="1"+txtResultado.text
        }

        btnDos.setOnClickListener{
            txtResultado.text="2"+txtResultado.text
        }

        btnTres.setOnClickListener{
            txtResultado.text="3"+txtResultado.text
        }

        btnCuadro.setOnClickListener{
            txtResultado.text="4"+txtResultado.text
        }

        btnCinco.setOnClickListener{
            txtResultado.text="5"+txtResultado.text
        }

        btnSeis.setOnClickListener{
            txtResultado.text="6"+txtResultado.text
        }

        btnSiete.setOnClickListener{
            txtResultado.text="7"+txtResultado.text
        }

        btnOcho.setOnClickListener{
            txtResultado.text="8"+txtResultado.text
        }

        btnNueve.setOnClickListener{
            txtResultado.text="9"+txtResultado.text
        }

        btnPor.setOnClickListener{
            txtResultado.text="*"+txtResultado.text
        }

        btnDividido.setOnClickListener{
            txtResultado.text="/"+txtResultado.text
        }

        btnMas.setOnClickListener{
            txtResultado.text="+"+txtResultado.text
        }

        btnMenos.setOnClickListener{
            txtResultado.text="-"+txtResultado.text
        }




    }
}