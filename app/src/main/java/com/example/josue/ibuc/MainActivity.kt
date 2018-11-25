package com.example.josue.ibuc

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {


    var con: Context = this
    var img: IntArray = intArrayOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six)
    var name: Array<String> = arrayOf("One", "Two", "Three", "Four", "Five", "Six")
    lateinit var gv: GridView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gv = findViewById(R.id.gridView) as GridView
        cl = CustomAdapter(con, name, img)
        gv.adapter = cl
    }
}
