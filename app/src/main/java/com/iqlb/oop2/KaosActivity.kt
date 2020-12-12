package com.rizkihanip.oop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.satria.oop.Database.AppRoomDB
import kotlinx.android.synthetic.main.activity_kaos.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KaosActivity : AppCompatActivity() {

    val db by lazy { AppRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kaos)
        setupListener()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val allKaos = db.KaosDao().getAllkaos()
            Log.d("Laptopctivity", "dbResponse: $allKaos")
        }
    }

    fun setupListener() {
        btn_createkaos.setOnClickListener {
            startActivity(Intent(this, EditKaosActivity::class.java))
        }
    }
}