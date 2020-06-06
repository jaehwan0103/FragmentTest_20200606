package kr.ptus.fragmenttest_20200606.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_student_list.*
import kr.ptus.fragmenttest_20200606.R
import kr.ptus.fragmenttest_20200606.adapter.StudentsAdapter
import kr.ptus.fragmenttest_20200606.data.Students

class StudentListFragment : Fragment() {

    val studentList = ArrayList<Students>()
    lateinit var mStudentAdapter : StudentsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        studentList.add(Students("조경진", 1988, true))
        studentList.add(Students("김광철", 1966, true))
        studentList.add(Students("김재환", 1993, true))
        studentList.add(Students("박수정", 1994, false))
        studentList.add(Students("신용성", 1988, true))
        studentList.add(Students("엄곤지", 1984, false))
        studentList.add(Students("이승원", 1978, true))
        studentList.add(Students("이현호", 1981, true))

        mStudentAdapter = StudentsAdapter(activity as Context, R.layout.student_list_item,studentList)
        listViewTxt.adapter = mStudentAdapter

    }

}