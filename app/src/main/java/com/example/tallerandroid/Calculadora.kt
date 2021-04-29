package com.example.tallerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import java.lang.Exception
import java.util.*
import java.util.ArrayDeque
import java.util.Stack
import kotlin.collections.ArrayList

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btnCero : Button
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
    lateinit var btnCE : Button
    lateinit var btnBorrar : Button
    lateinit var btnIgual : Button
    lateinit var btnPunto : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado=findViewById(R.id.txtResultado)
        txtResultado.text=""

        btnCero=findViewById(R.id.btnCero)
        btnUno=findViewById(R.id.btnUno)
        btnDos=findViewById(R.id.btnDos)
        btnTres=findViewById(R.id.btnTres)
        btnCuadro=findViewById(R.id.btnCuatro)
        btnCinco=findViewById(R.id.btnCinco)
        btnSeis=findViewById(R.id.btnSeis)
        btnSiete=findViewById(R.id.btnSiete)
        btnOcho=findViewById(R.id.btnOcho)
        btnNueve=findViewById(R.id.btnNueve)

        btnPor=findViewById(R.id.btnPor)
        btnDividido=findViewById(R.id.btnDivido)
        btnMas=findViewById(R.id.btnMas)
        btnMenos=findViewById(R.id.btnMenos)
        btnPunto=findViewById(R.id.btnPunto)


        btnCE=findViewById(R.id.btnCE)
        btnBorrar=findViewById(R.id.btnBorar)
        btnIgual=findViewById(R.id.btnIgual)

        btnCero.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "0"
        }

        btnUno.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "1"
        }

        btnDos.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "2"
        }

        btnTres.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "3"
        }

        btnCuadro.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "4"
        }

        btnCinco.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "5"
        }

        btnSeis.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "6"
        }

        btnSiete.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "7"
        }

        btnOcho.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "8"
        }

        btnNueve.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "9"
        }

        btnPor.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "*"
        }

        btnDividido.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "/"
        }

        btnMas.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "+"
        }

        btnMenos.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "-"
        }

        btnMenos.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "-"
        }

        btnPunto.setOnClickListener{
            txtResultado.text=txtResultado.text.toString() + "."
        }

        btnCE.setOnClickListener{
            txtResultado.text=""
        }

        btnBorrar.setOnClickListener{
            txtResultado.text=txtResultado.text.dropLast(1)
        }

        btnIgual.setOnClickListener{
            try
            {
                var result : String
                var exp : String
                var stack : Stack<Char>
                var num : ArrayList<Int>
                var c : Char
                val cont : Int
                result=""
                exp=txtResultado.text.toString()
                cont= txtResultado.length()
                stack= Stack()


                for (i in 0 until cont)
                {
                    c= exp[i]

                    if (c.isLetterOrDigit()|| c.equals('.'))
                    {
                        result+=c
                    }
                    else
                    {
                        result+=" "
                        while (0< stack.count() && (c.equals('+')||c.equals('/')||c.equals('-')||c.equals('*')) && prec(c)<= prec(stack.peek()))
                        {
                            result+=stack.pop()+" "
                        }
                        stack.push(c)
                    }

                }

                while (!stack.isEmpty())
                {
                    result+=" "+stack.pop()+ " "
                }

                System.out.println("|"+result+"|")


                var MyStack:Stack<Double>
                MyStack= Stack()
                var j: Int
                j=result.length-1
                var num1:String
                var nummero1:Double
                var nummero2:Double
                num1=""

                for (h in 0 until j)
                {

                    System.out.println("H es "+h+ " num es:"+num1)
                    c= result[h]
                    System.out.println("C es : "+c+"\n")
                    if(!c.equals(' '))
                    {

                        num1+=c
                    }else if(!(c == '+' || c == '/' || c == '-' || c == '*'))
                    {
                        if (!num1.isEmpty()|| num1.equals(" ")) {
                            MyStack.push(num1.toDouble())
                        }
                        System.out.println("El stack tiene"+MyStack.peek())
                        num1=""
                    }

                    if (c == '+' || c == '/' || c == '-' || c == '*')
                    {
                        nummero1 = MyStack.pop()
                        nummero2 = MyStack.pop()


                        if (c.equals('*'))
                        {
                            MyStack.push(nummero1*nummero2)
                        }
                        if (c.equals('/'))
                        {
                            MyStack.push(nummero2/nummero1)
                        }
                        if (c.equals('+'))
                        {
                            MyStack.push(nummero1+nummero2)
                        }
                        if (c.equals('-'))
                        {
                            MyStack.push(nummero2-nummero1)
                        }
                        num1=""


                    }
                }


                //txtResultado.text=""+result
                System.out.println(result)
                txtResultado.text=""+MyStack.peek()


            }
            catch (e: Exception)
            {
                txtResultado.text="Error"
            }


        }

    }

    private fun  prec(a:Char): Int
    {
        if(a.equals('+')||a.equals("-"))
        {
            return 1
        }

        if(a.equals('*')||a.equals("/"))
        {
            return 2
        }



        return -1
    }


}