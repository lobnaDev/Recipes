package com.app.recipeapp.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.recipeapp.model.CategoryItems

/**
 * Created by Lobna Babker on 9/26/2022.
 */
interface RecipeDao {
    @Query("SELECT * FROM categoryitems ORDER BY id DESC")
    suspend fun getAllCategory() : List<CategoryItems>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(categoryItems: CategoryItems?)


    @Query("DELETE FROM categoryitems")
    suspend fun clearDb()

}