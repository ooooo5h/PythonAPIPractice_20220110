package com.neppplus.pythonapipractice_20220110

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.neppplus.apipractice_20220106.api.APIList
import com.neppplus.apipractice_20220106.api.ServerAPI
import retrofit2.Retrofit

abstract class BaseActivity : AppCompatActivity() {

    lateinit var retrofit : Retrofit
    lateinit var apiList : APIList

    lateinit var mContext : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        이 내부의 코드는 모든 화면들의 시작지점에서 같이 공통적으로 실행되는 코드

//        this를 미리 mContext에 담아두자
        mContext = this
//        앞으로 this를 써야 할 일이 있다면 그 대신 mContext를 사용하면 됨


//        레트로핏 관련 설정들을 여기서 진행한다(모든 화면들이 자동으로 실행되도록)
        retrofit = ServerAPI.getRetrofit(mContext)
        apiList = retrofit.create(APIList::class.java)


    }
}