package com.satria.oop.Database

import androidx.room.*
import com.satria.opp.Database.Kaos

@Dao
interface KaosDao {
    @Insert
    suspend fun addKaos(kaos: Kaos)

    @Update
    suspend fun updateKaos(kaos: Kaos)

    @Delete
    suspend fun deleteKaos(kaos: Kaos)

    @Query("SELECT * FROM kaos")
    suspend fun getAllkaos(): List<Kaos>
}