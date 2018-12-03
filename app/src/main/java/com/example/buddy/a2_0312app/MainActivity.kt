package com.example.buddy.a2_0312app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private var intA: Int = 0
    private var intB: Int = 0
    private var strA: String = ""
    private var strB: String = ""
    private var intNotDivResult: Int = 1
    private var bigdecDivResult: BigDecimal = BigDecimal("1.0")
    private var strResult: String = ""

    fun Plus(view: View)
    {
        //Toast.makeText( this,"Plus",Toast.LENGTH_SHORT).show()

        strA = editText_A.text.toString()
        intA = Integer.parseInt(strA)
        //Toast.makeText( this,"A",Toast.LENGTH_SHORT).show()

        strB = editText_B.text.toString()
        intB = Integer.parseInt(strB)
        //Toast.makeText( this,"B", Toast.LENGTH_SHORT).show()

        intNotDivResult = intA+intB
        strResult = intNotDivResult.toString()
        textView_Result.text = strResult
        //Toast.makeText( this,"Res",Toast.LENGTH_SHORT).show()
    }

    fun Minus(view: View)
    {
        strA = editText_A.text.toString()
        intA = Integer.parseInt(strA)
        strB = editText_B.text.toString()
        intB = Integer.parseInt(strB)
        intNotDivResult = intA-intB
        strResult = intNotDivResult.toString()
        textView_Result.text = strResult
    }
    fun Multiple(view: View)
    {
        strA = editText_A.text.toString()
        intA = Integer.parseInt(strA)
        strB = editText_B.text.toString()
        intB = Integer.parseInt(strB)
        intNotDivResult = intA*intB
        strResult = intNotDivResult.toString()
        textView_Result.text = strResult
    }

    fun Divide(view: View)
    {
        //check B is not Null
        strB = editText_B.text.toString()
        intB = Integer.parseInt(strB)
        if (intB == 0)
        {
            Toast.makeText( this,"Division By Zero will destroy the Universe",Toast.LENGTH_SHORT).show()
            return
        }

        strA = editText_A.text.toString()
        intA = Integer.parseInt(strA)

        bigdecDivResult = (intA.toBigDecimal()).divide(intB.toBigDecimal(), 10, RoundingMode.DOWN)
        strResult = bigdecDivResult.toPlainString()
        textView_Result.text = strResult
    }

}
