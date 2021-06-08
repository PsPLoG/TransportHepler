package com.psplog.transporthelpersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.psplog.transporthelpersample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = TransportAdapter().apply {
            items = listOf(
                TransportBusItem(1, "100", 0),
                TransportBusItem(2, "200", 0),
                TransportBusItem(3, "300", 0),
                TransportBusItem(4, "400", 1),
                TransportBusItem(5, "500", 1),
                TransportBusItem(6, "600", 1),
            )
        }
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}