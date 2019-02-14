package com.example.codelab.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.codelab.entities.Word
import com.example.codelab.dao.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords: MutableLiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}