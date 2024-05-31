package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)
    @Update
    suspend fun update(item: Item)
    @Delete
    suspend fun delete(item: Item)
    @Query("SELECT * from items WHERE id = :id")
}