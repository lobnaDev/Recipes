package com.app.recipeapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.recipeapp.R
import com.app.recipeapp.model.Recipes
import kotlinx.android.synthetic.main.item_rv_main_category.view.*

/**
 * Created by Lobna Babker on 9/30/2022.
 */
class SubCategoryAdapter :  RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {
    var arrSubCategory = ArrayList<Recipes>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_rv_sub_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arrSubCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }

    fun setData(arrData: List<Recipes>) {
        arrSubCategory = arrData as ArrayList<Recipes>
    }
}