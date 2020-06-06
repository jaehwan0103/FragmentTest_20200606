package kr.ptus.fragmenttest_20200606.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.ptus.fragmenttest_20200606.fragments.MyProfileFragment
import kr.ptus.fragmenttest_20200606.fragments.StudentListFragment

class MyViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        if (position == 0){
            return  "내 프로필"
        }
        else {
            return "수강생 목록"
        }
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return MyProfileFragment()
        }

        else {
            return StudentListFragment()
        }

    }

    override fun getCount(): Int {


        return 2

    }


}