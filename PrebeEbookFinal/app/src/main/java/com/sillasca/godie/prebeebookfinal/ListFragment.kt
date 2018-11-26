package com.sillasca.godie.prebeebookfinal

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ListFragment : Fragment() {

    lateinit var buttonGoToNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val btnOpen = view.findViewById<View>(R.id.leerpsicoanalista) as Button
        btnOpen.setOnClickListener {
            val `in` = Intent(activity, ActividadPsicoanalista::class.java)
            startActivity(`in`)
        }


        val btnOpen2 = view.findViewById<View>(R.id.leerhp) as Button
        btnOpen2.setOnClickListener {
            val `in` = Intent(activity, ActividadHP::class.java)
            startActivity(`in`)
        }

        val btnOpen3 = view.findViewById<View>(R.id.leerbiblia) as Button
        btnOpen3.setOnClickListener {
            val `in` = Intent(activity, ActividadBiblia::class.java)
            startActivity(`in`)
        }

        val btnOpen4 = view.findViewById<View>(R.id.leerorgullo) as Button
        btnOpen4.setOnClickListener {
            val `in` = Intent(activity, ActividadOrgullo::class.java)
            startActivity(`in`)
        }

        val btnOpen5 = view.findViewById<View>(R.id.leerprincipito) as Button
        btnOpen5.setOnClickListener {
            val `in` = Intent(activity, ActividadPrincipito::class.java)
            startActivity(`in`)
        }

        val btnOpen6 = view.findViewById<View>(R.id.leerperegrino) as Button
        btnOpen6.setOnClickListener {
            val `in` = Intent(activity, ActividadPeregrino::class.java)
            startActivity(`in`)
        }

        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()

    }


}
