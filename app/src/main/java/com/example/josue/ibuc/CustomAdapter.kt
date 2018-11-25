package com.example.josue.ibuc

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class CustomAdapter(var context: Context, var libro: ArrayList<Libro>): BaseAdapter() {

    private class ViewHolder(row: View?){

        //item list
        var libro1: TextView
        var book1: ImageView

        //row_layout
        var img: IntArray
        var con: Context
        var name: Array<String>

        constructor(img: IntArray, con: Context, name: Array<String>): super(){

            this.img = img
            this.con = con
            this.name = name
        }



        init {
            this.libro1 = row?.findViewById(R.id.libro1) as TextView
            this.book1 =  row?.findViewById(R.id.book1) as ImageView

        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View?
        var viewHolder: ViewHolder
            if(convertView == null){
                var layout = LayoutInflater.from(context)
                view = layout.inflate(R.layout.libros_item_list, parent, false)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            } else {
                view = convertView
                viewHolder = view.tag as ViewHolder

            }

        var libro: Libro = getItem(position) as Libro
        viewHolder.libro1.text = libro.nombre
        viewHolder.book1.setImageResource(libro.image)


        return view as View
    }

    override fun getItem(position: Int): Any {
        return libro.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return libro.count()
    }
}