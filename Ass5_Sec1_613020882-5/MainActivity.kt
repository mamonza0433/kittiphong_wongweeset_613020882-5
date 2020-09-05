package com.example.ass5

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


//import kotlin.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun onClickShowDetail(v: View){
        val intent = Intent(this, MainActivity2::class.java)
        radioGroup.setOnCheckedChangeListener {radioGroup, checkedID ->
            var gen:String? = ""
            if(checkedID == R.id.radioM)  {
                gen = "Male"
                intent.putExtra("empData", Employee(nameEMP.text.toString(),gen.toString(),mailEMP.text.toString(),
                    salaryEMP.text.toString().toInt()))
                startActivity(intent)
            }

            if(checkedID == R.id.radioF){
                gen = "Female"
                intent.putExtra("empData", Employee(nameEMP.text.toString(),gen.toString(),mailEMP.text.toString(),
                    salaryEMP.text.toString().toInt()))
                startActivity(intent)
            }


        }



    }
    fun SelectGender() {

        radioGroup.setOnCheckedChangeListener {radioGroup, checkedID ->
            var gen:String? = ""
            if(checkedID == R.id.radioM)  {
                gen = "Male"

            }

            if(checkedID == R.id.radioF){
                gen = "Female"

            }


        }

    }

    fun onClickSelect(v:View){

}


    fun onClickReset(v: View){

        nameEMP.setText("")
        mailEMP.setText("")
        salaryEMP.setText("")
        radioGroup.clearCheck()
    }
}