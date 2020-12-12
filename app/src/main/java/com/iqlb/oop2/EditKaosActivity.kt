package com.rizkihanip.oop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satria.oop.Database.AppRoomDB
import com.satria.opp.Database.Kaos
import kotlinx.android.synthetic.main.activity_edit_kaos.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EditKaosActivity : AppCompatActivity() {

    val db by lazy { AppRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_kaos)
        setupListener()
    }

    fun setupListener(){
        btn_savekaos.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                db.KaosDao().addKaos(
                    Kaos(0, txt_merk.text.toString(), Integer.parseInt(txt_stok.text.toString()), Integer.parseInt(txt_harga.text.toString()) )
                )
                finish()
            }
        }
    }
}