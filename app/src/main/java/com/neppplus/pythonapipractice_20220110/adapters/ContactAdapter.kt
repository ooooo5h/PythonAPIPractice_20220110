package com.neppplus.pythonapipractice_20220110.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.pythonapipractice_20220110.R
import com.neppplus.pythonapipractice_20220110.models.ContactData
import org.w3c.dom.Text


class ContactAdapter(
    val mContext: Context,
    val mList: List<ContactData>,
) : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtPhone = row.findViewById<TextView>(R.id.txtPhone)
        val txtMemo = row.findViewById<TextView>(R.id.txtMemo)

        fun bind(data: ContactData) {

            txtName.text = data.name
            txtPhone.text = data.phoneNum
            txtMemo.text = data.memo
            }

        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.contact_list_item, parent, false)

        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.bind(mList[position])

    }

    override fun getItemCount(): Int {

        return mList.size

    }

}