package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            //todo : calculate BMI
            val height:Double = editTextHeight.text.toString().toDouble()
            val weight:Double = editTextWeight.text.toString().toDouble()
            val bmi:Double = weight / (height*height)

            textViewBMI.text = "BMI: %.2f".format(bmi)


            //todo: display image
            if(bmi < 18.5){
                imageViewProfile.setImageResource(R.drawable.under)
            }
            else if (bmi >= 18.5 && bmi <= 24.9){
               imageViewProfile.setImageResource((R.drawable.normal))
            }else
                imageViewProfile.setImageResource(R.drawable.over)

        }

        buttonReset.setOnClickListener {
            //todo: clear inputs
            editTextHeight.text = null
            editTextWeight.text = null
            textViewBMI.text = null

            //todo: clear image
            imageViewProfile.setImageResource(R.drawable.empty)

        }

    }
}
