package kr.ptus.fragmenttest_20200606.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.myprofile_pragment.*
import kr.ptus.fragmenttest_20200606.R

class MyProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.myprofile_pragment,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        dialBtn.setOnClickListener {
            val inputPhoneNum = phonNumtxt.text.toString()

            val myUri = Uri.parse("tel:$inputPhoneNum")
            val myIntent = Intent(Intent.ACTION_DIAL,myUri)
            startActivity(myIntent)

        }

    }

}