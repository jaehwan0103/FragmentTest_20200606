package kr.ptus.fragmenttest_20200606.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.ptus.fragmenttest_20200606.R
import kr.ptus.fragmenttest_20200606.data.Students

class StudentsAdapter (context: Context, resId : Int , list: List<Students> ) : ArrayAdapter<Students>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null){

         tempRow = inf.inflate(R.layout.student_list_item,null)

        }

        val row = tempRow!!

        val stdprofile = row.findViewById<TextView>(R.id.studentProfile)

        val data = mList.get(position)
        val age = 2020 - data.age +1

        var gender = "남성"

        if (!data.gender){

            gender = "여성"

        }

        stdprofile.text = "${data.name} (${age}세, ${gender})"

        return row

    }




}