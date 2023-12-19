package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class GuruKelasBerlangsungActivity : AppCompatActivity(),  View.OnClickListener  {
    private lateinit var live : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_kelas_berlangsung)
        live = findViewById(R.id.live)
        live.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.live -> {
                val intent = Intent(this@GuruKelasBerlangsungActivity, GuruKelasBerlangsungKonfirmasiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}