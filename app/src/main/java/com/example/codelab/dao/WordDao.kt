package com.example.codelab.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.codelab.entities.Word

@Dao
interface WordDao {
    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): MutableLiveData<List<Word>>

     //Se a tabela tiver mais de uma coluna, você poderá usar
    //@Insert(onConflict = OnConflictStrategy.REPLACE)
}