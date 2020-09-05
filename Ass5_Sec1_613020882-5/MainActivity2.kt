package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var data:Bundle? = intent.extras
        var newEmployee:Employee? = data?.getParcelable<Employee>("empData")

        nameText.text = "Student ID : ${newEmployee?.name}"
        genderText.text = "Gender : ${newEmployee?.gender}"
        emailText.text = " Email : ${newEmployee?.email}"
        salaryText.text = "Salary : ${newEmployee?.salary}"
    }
    fun onClickShowClose (view: View){
        finish()
    }
}