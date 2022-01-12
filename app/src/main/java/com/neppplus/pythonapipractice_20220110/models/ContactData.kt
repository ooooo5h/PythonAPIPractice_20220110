package com.neppplus.pythonapipractice_20220110.models

import com.google.gson.annotations.SerializedName

class ContactData(
    val id : Int,
    val memo : String,
    val name : String,
    @SerializedName("phone_num")
    val phoneNum : String,
) {
}