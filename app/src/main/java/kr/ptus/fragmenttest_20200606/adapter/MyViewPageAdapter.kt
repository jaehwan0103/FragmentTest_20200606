package kr.ptus.fragmenttest_20200606.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.ptus.fragmenttest_20200606.fragments.MyProfileFragment

class MyViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {

        return MyProfileFragment()
    }

    override fun getCount(): Int {


        return 2

    }


}