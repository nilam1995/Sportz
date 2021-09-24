package com.example.sportz.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.sportz.db.daos.AppDao
import com.example.sportz.model.DataResponse
import com.example.sportz.model._4
import com.example.sportz.model._5
import com.example.sportz.ui.dashboard.model.PlayerModel

@Database(entities = arrayOf( PlayerModel::class), version = 1, exportSchema = false)
@TypeConverters(DataConverter::class)
abstract class AppDatabase:RoomDatabase() {

    abstract fun appDao(): AppDao

}