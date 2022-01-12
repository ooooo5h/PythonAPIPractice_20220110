package com.neppplus.pythonapipractice_20220110

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_contact.*

class EditContactActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_contact)

        btnSave.setOnClickListener { 
            
            val inputName = edtName.text.toString()
            val inputPhoneNume = edtPhoneNum.text.toString()
            val inputMemo = edtMemo.text.toString()
            
//            API 호출 날릴 기능이 없네? API주소도 없네. 파이썬으로 이동
            apiList.getRequestAddContact()
        }
    }
}