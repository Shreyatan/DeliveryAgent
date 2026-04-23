package com.source1.deliveryagent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Directly start DeliveryAgentActivity as the main entry point for now
        val intent = Intent(this, DeliveryAgentActivity::class.java)
        startActivity(intent)
        finish()
    }
}
