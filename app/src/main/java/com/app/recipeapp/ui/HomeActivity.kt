package com.app.recipeapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.recipeapp.R
import com.app.recipeapp.model.Recipes
import com.app.recipeapp.ui.adapter.MainCategoryAdapter
import com.app.recipeapp.ui.adapter.SubCategoryAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Temporary Data
        arrMainCategory.add(Recipes(1,"Chicken"))
        arrMainCategory.add(Recipes(2,"Beef"))
        arrMainCategory.add(Recipes(3,"Fish"))
        arrMainCategory.add(Recipes(4,"Dessert"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1,"Chicken and Rice"))
        arrSubCategory.add(Recipes(2,"Beef Burger"))
        arrSubCategory.add(Recipes(3,"Grilled Fish "))
        arrSubCategory.add(Recipes(4,"Cheesecake"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter = subCategoryAdapter

    }
}