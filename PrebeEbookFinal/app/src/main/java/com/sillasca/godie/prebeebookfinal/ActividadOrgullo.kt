package com.sillasca.godie.prebeebookfinal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActividadOrgullo : AppCompatActivity() {

    lateinit var buttonGoToNext: Button
    val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_orgullo)

        val Change1 = findViewById<Button>(R.id.cap1)
        val Change2 = findViewById<Button>(R.id.cap2)
        val Change3 = findViewById<Button>(R.id.cap3)

        buttonGoToNext = findViewById(R.id.volver_menu)
        buttonGoToNext.setOnClickListener {
            val intent: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        Change1.setOnClickListener { ShowCap1() }
        Change2.setOnClickListener { ShowCap2() }
        Change3.setOnClickListener { ShowCap3() }
    }

    fun ShowCap1(){
        val transaction = manager.beginTransaction()
        val fragment = OrgulloCp1()
        transaction.replace(R.id.contenedorFragments,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun ShowCap2(){
        val transaction = manager.beginTransaction()
        val fragment = OrgulloCp2()
        transaction.replace(R.id.contenedorFragments,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun ShowCap3(){
        val transaction = manager.beginTransaction()
        val fragment = OrgulloCp3()
        transaction.replace(R.id.contenedorFragments,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
