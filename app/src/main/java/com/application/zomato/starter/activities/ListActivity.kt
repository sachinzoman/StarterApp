package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.Restaurant
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */

        adapter.items = listOf(Restaurant("Rajinder Da Dhaba","Safdarjang","4.0"),
                                Restaurant("Dominos","Dwarka Mor","3.7"),
                                Restaurant("McDonalds","Paharganj","3.2"),
                                Restaurant("Prem Dhaba","Karol Bagh","4.1"),
                                Restaurant("Madira","Satiye Niketan","3.7"),
                                Restaurant("Sita Ram Chhole","Chuna Mandi","4.5"),
                                Restaurant(),
                                Restaurant(),
                                Restaurant(),
                                Restaurant())
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}