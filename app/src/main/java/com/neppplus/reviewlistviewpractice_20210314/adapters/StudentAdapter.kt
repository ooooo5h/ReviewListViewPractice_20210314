package com.neppplus.reviewlistviewpractice_20210314.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.reviewlistviewpractice_20210314.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}