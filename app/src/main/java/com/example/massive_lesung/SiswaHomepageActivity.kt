package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SiswaHomepageActivity : AppCompatActivity(),  View.OnClickListener  {
    private lateinit var puspita: TextView
    private lateinit var pus: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siswa_homepage)
        puspita = findViewById(R.id.puspita)
        puspita.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.puspita -> {
                val intent = Intent(this@SiswaHomepageActivity, SiswaHomepageInformasiGuruActivity::class.java)
                startActivity(intent)
            }
        }
    }
}