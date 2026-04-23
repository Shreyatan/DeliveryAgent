package com.source1.deliveryagent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DeliveryAgentActivity : AppCompatActivity() {

    private lateinit var tvEarnings: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_agent)

        tvEarnings = findViewById(R.id.tvEarnings)

        findViewById<CardView>(R.id.cardAssignedOrders).setOnClickListener {
            startActivity(Intent(this, AssignedOrderActivity::class.java))
        }

        findViewById<CardView>(R.id.cardMapsRoute).setOnClickListener {
            startActivity(Intent(this, MapsRoutesActivity::class.java))
        }

        findViewById<CardView>(R.id.cardCallCustomer).setOnClickListener {
            startActivity(Intent(this, CallCustomerActivity::class.java))
        }

        findViewById<CardView>(R.id.cardCodPayment).setOnClickListener {
            startActivity(Intent(this, CodPaymentActivity::class.java))
        }

        findViewById<CardView>(R.id.cardMyProfile).setOnClickListener {
            startActivity(Intent(this, MyProfileActivity::class.java))
        }
        
        updateEarningsDisplay()
    }

    override fun onResume() {
        super.onResume()
        updateEarningsDisplay()
    }

    private fun updateEarningsDisplay() {
        val sharedPref = getSharedPreferences("DeliveryAgentPrefs", Context.MODE_PRIVATE)
        val currentEarnings = sharedPref.getInt("earnings", 960)
        tvEarnings.text = "Rs $currentEarnings"
    }
}
