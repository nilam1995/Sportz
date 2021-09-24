package com.example.sportz.db

import androidx.room.TypeConverter
import com.example.sportz.model.Players
import com.example.sportz.model.Players__1
import com.example.sportz.model._3852
import com.example.sportz.model._66818
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONObject
import java.lang.reflect.Type
import java.util.*
import kotlin.collections.ArrayList

class DataConverter {
    @TypeConverter
    fun fromString(value: String?): List<Players?>? {
        val listType: Type = object : TypeToken<ArrayList<Players?>?>() {}.getType()
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: List<Players?>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }

    @TypeConverter
    fun fromStringTeamb(value: String?): List<Players__1?>? {
        val listType: Type = object : TypeToken<ArrayList<Players__1?>?>() {}.getType()
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayListTeamb(list: List<Players__1?>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }
}