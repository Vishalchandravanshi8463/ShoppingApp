package com.example.shoppingapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context:Activity , val productList:List<Product>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView=LayoutInflater.from(context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {

        val currentItem=productList[position]

        holder.title.text=currentItem.title
        Picasso.get().load(currentItem.thumbnail).into(holder.image);
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val image:ShapeableImageView
        val title: TextView

        init{
            image=itemView.findViewById(R.id.productImage)
            title=itemView.findViewById(R.id.productName)
        }
    }
}