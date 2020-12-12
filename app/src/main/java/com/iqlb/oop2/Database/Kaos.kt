package com.satria.opp.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kaos")
data class Kaos(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "merk") val merk: String,
    @ColumnInfo(name = "jumlah") val jumlah: Int,
    @ColumnInfo(name = "harga") val harga: Int
)