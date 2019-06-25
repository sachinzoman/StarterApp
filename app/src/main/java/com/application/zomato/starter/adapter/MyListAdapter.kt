package com.application.zomato.starter.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.application.zomato.starter.R
import com.application.zomato.starter.data.Restaurant
import java.util.ArrayList

class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    /**
     * Change the type of data in list to support your data
     */
    var items : List<Restaurant> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        /**
         * change R.id.layout_item_basic to your layout id
         */
        Log.v("testing","onCreateViewHolder")
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item_basic,p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Log.v("testing","onBindViewHolder")
        holder.bindData(items[position])
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {



        private val nameView : TextView = view.findViewById(R.id.name)
        private val addressView : TextView = view.findViewById(R.id.address)
        private val ratingView : TextView = view.findViewById(R.id.rating)


        init {
            view.setOnClickListener(object: View.OnClickListener{
                override fun onClick(v: View?) {
                    Toast.makeText(v?.context,"Restaurant name is "+restaurant?.restaurantName, Toast.LENGTH_LONG).show()
                }
            })
        }

        var restaurant : Restaurant? = null

        fun bindData(r : Restaurant) {
            /**
             * use data and set on the view
             */
            restaurant = r
            nameView.text = r.restaurantName
            addressView.text = r.restaurantAddress
            ratingView.text = r.rating
        }

    }
}