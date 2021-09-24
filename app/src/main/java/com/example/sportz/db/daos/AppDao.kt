package com.example.sportz.db.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.sportz.model._4
import com.example.sportz.model._5
import com.example.sportz.ui.dashboard.model.PlayerModel

@Dao
interface AppDao {

    @Transaction
    suspend fun deleteAndInsertTeam1(list: List<PlayerModel>) {
        deleteTeam1()
        insertTeam1(list)
    }

    @Query("DELETE FROM Teams")
    suspend fun deleteTeam1()

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTeam1(characters: List<PlayerModel>)

    @Query("SELECT * FROM Teams WHERE team LIKE :search || '%'")
    fun searchByTeam(search: String) : List<PlayerModel>

}