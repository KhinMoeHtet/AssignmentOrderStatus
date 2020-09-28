package com.example.orderstatus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.orderstatus.adapter.UtilitiesAdapter
import com.example.orderstatus.model.Utilities
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var utilitiesList = ArrayList<Utilities>()
        utilitiesList.add(Utilities(R.drawable.ic_notes,"My Wishlist"))
        utilitiesList.add(Utilities(R.drawable.wallet,"My Followed Sellers"))
        utilitiesList.add(Utilities(R.drawable.box,"My Purchased item"))
        utilitiesList.add(Utilities(R.drawable.ic_coupon,"My Coupons"))
        utilitiesList.add(Utilities(R.drawable.wallet,"My Cards Wallet"))
        utilitiesList.add(Utilities(R.drawable.ic_coupon,"Exp Points"))
        utilitiesList.add(Utilities(R.drawable.ic_notes,"My Given Feedbacks"))
        utilitiesList.add(Utilities(R.drawable.ic_serch,"Search History"))
        utilitiesList.add(Utilities(R.drawable.event,"Events & Calandar"))



        var utilitiesAdapter = UtilitiesAdapter(utilitiesList)
        utilitiesRecycler.layoutManager = GridLayoutManager(this,3)
        utilitiesRecycler.adapter= utilitiesAdapter
    }
}