package com.app.recipeapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.app.recipeapp.R
import com.app.recipeapp.model.CategoryItems
import com.app.recipeapp.model.Recipes
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_rv_main_category.view.*

/**
 * Created by Lobna Babker on 9/29/2022.
 */
class MainCategoryAdapter :  RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {
    var context: Context? = null
    var arrMainCategory = ArrayList<Recipes>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        context = parent.context
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category,parent,false))
    }


    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

  holder.itemView.tv_dish_name.text = arrMainCategory[position].dishName
//    Glide.with(context!!).load(arrMainCategory[position].strcategorythumb).into(holder.itemView.img_dish)
//    holder.itemView.rootView.setOnClickListener {
//        listener!!.onClicked(arrMainCategory[position].strcategory)
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }
    fun setData(arrData : List<Recipes>){
        arrMainCategory = arrData as ArrayList<Recipes>
    }



    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }





}