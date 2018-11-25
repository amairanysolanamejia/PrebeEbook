package com.sillasca.godie.prebeebookfinal

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.sillasca.godie.prebeebookfinal.R


class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ChangeGrid =  findViewById<Button>(R.id.btn_grid)
        val ChangeList =  findViewById<Button>(R.id.btn_list)

        ShowGrid()
        ChangeGrid.setOnClickListener { ShowGrid() }
        ChangeList.setOnClickListener { ShowList() }

    }


    fun ShowGrid(){
        val transaction = manager.beginTransaction()
        val fragment = GridFragment()
        transaction.replace(R.id.contenedorLibros,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun ShowList(){
        val transaction = manager.beginTransaction()
        val fragment = ListFragment()
        transaction.replace(R.id.contenedorLibros,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
