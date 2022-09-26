package com.app.recipeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * Created by Lobna Babker on 9/25/2022.
 */
@Entity(tableName = "Recipes")
data class Recipes(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "dishName")
    var dishName:String
) : Serializable