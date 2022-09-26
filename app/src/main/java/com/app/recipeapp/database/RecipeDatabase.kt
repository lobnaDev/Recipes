package com.app.recipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.recipeapp.model.Recipes

/**
 * Created by Lobna Babker on 9/26/2022.
 */
@Database(entities = [Recipes::class],version = 1,exportSchema = false)
abstract class RecipeDatabase :  RoomDatabase(){
    abstract fun recipeDao():RecipeDao
    companion object{

        var recipesDatabase:RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if (recipesDatabase == null){
                recipesDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipesDatabase!!
        }
    }
}