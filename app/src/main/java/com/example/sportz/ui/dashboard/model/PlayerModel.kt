package com.example.sportz.ui.dashboard.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Teams")
data class PlayerModel(
        @PrimaryKey(autoGenerate = true)
        val primaryId:Int?= null,
        val playerName: String?,
        val Iscaptain: Boolean,
        val Iskeeper: Boolean,
        val team: String?
):Serializable {

}