package com.example.josue.ibuc

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class LibroActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById(R.id.listView) as ListView
        var arrLibro: ArrayList<Libro> = ArrayList()
        arrLibro.add(Libro("LaBiblia", R.drawable.labiblia))
        arrLibro.add(Libro("CrearMorir", R.drawable.crearmorir))
        arrLibro.add(Libro("ElPrincipito", R.drawable.elprincipito))
        arrLibro.add(Libro("LosAmorosos", R.drawable.losamorosos))
        arrLibro.add(Libro("OrgulloPrejuicio", R.drawable.orgulloprejuicio))

        listView.adapter = CustomAdapter(applicationContext, arrLibro)

    }
}