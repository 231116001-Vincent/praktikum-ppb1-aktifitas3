package com.vharya.aktifitas3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val users = arrayListOf(
        Users("Dodi Kurniawan", "Jl Kewangi No. 5", "Pria"),
        Users("Kevin Prasetyo", "Perum Jatibadi Blok F No. 12", "Pria"),
        Users("Susie Setiawati", "Jl Primadi Gg. 4, No. 11", "Wanita"),
        Users("Budi Pratama", "Perumahan Tribudi Blok C No. 10", "Pria"),
        Users("Enik Kurniawan", "Perum Kepuh Blok E No. 5", "Wanita"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)
    }
}