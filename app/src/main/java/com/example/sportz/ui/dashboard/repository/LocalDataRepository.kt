package com.example.sportz.ui.dashboard.repository

import com.example.sportz.db.daos.AppDao
import com.example.sportz.model.Players
import com.example.sportz.model._4
import com.example.sportz.model._5
import com.example.sportz.ui.dashboard.model.PlayerModel
import javax.inject.Inject

class LocalDataRepository @Inject constructor(
        private val appDao: AppDao
) {

    suspend fun Teams(list: List<PlayerModel>) = appDao.deleteAndInsertTeam1(list)

    fun getSearchedTeams(searchQuery : String) = appDao.searchByTeam(searchQuery)
}