package com.neppplus.pythonapipractice_20220110

import android.os.Bundle
import com.neppplus.pythonapipractice_20220110.models.BasicResponse
import com.neppplus.pythonapipractice_20220110.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_edit_contact.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EditContactActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_contact)

        btnSave.setOnClickListener { 
            
            val inputName = edtName.text.toString()
            val inputPhoneNum = edtPhoneNum.text.toString()
            val inputMemo = edtMemo.text.toString()
            
//            API 호출 날릴 기능이 없네? API주소도 없네. 파이썬으로 이동
            apiList.getRequestAddContact(ContextUtil.getUserId(mContext), inputName, inputPhoneNum, inputMemo).enqueue(object : Callback<BasicResponse>{
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {


                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

                }

            })
        }
    }
}