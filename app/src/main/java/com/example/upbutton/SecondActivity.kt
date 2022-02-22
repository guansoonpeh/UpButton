package com.example.upbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        using XML, set the the parentActivity name in manifest file
//        <activity
//        android:name=".SecondActivity"
//        android:exported="false"
//        android:parentActivityName=".MainActivity"/>


        //using code
        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"
        actionBar!!.setDisplayHomeAsUpEnabled(true)


    }

    //use code
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}