package com.zaich.dicoding_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    var toHarga: Int = 0
    var minteger:Int = 0
    var MIN_NUMBER = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        

        var intent = intent
        val aIem = intent.getStringExtra("pIem")
        val aDesc = intent.getStringExtra("pDesc")
        val aHarga = intent.getIntExtra("pHarga",0)
        val aImg = intent.getIntExtra("pImg",0)

        iemOrd.text = aIem
        descOrd.text = aDesc
        hargaOrd.text = aHarga.toString()
        imageOrd.setImageResource(aImg)

        fun display(number:Int) {
            val displayInteger = findViewById<View>(
                R.id.jmlord) as TextView
            displayInteger.text = "" + number

            toHarga = hargaOrd.text.toString().toInt() * displayInteger.text.toString().toInt()
            toHardOrd.text = toHarga.toString()
        }

        descreaseOrd.setOnClickListener(){
            if ( minteger == MIN_NUMBER){
                minteger = 0
            }
            else
                minteger = minteger - 1
            display(minteger)
        }
        increaseOrd.setOnClickListener() {
            minteger = minteger + 1
            display(minteger)
        }
        orderLagi.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}