package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SiswaHomepageInformasiGuruActivity : AppCompatActivity(),  View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siswa_homepage_informasi_guru)
        val btnrekrut: Button = findViewById(R.id.btn_rekrut)
        btnrekrut.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_rekrut -> {
                val intent =
                    Intent(this@SiswaHomepageInformasiGuruActivity, PaymentDetails::class.java)
                startActivity(intent)
            }
        }
    }
}