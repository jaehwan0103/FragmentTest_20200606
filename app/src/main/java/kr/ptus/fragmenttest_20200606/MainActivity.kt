package kr.ptus.fragmenttest_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.ptus.fragmenttest_20200606.adapter.MyViewPageAdapter

class MainActivity : BaseActivity() {

    lateinit var mainAdapter : MyViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValuse()
    }

    override fun setupEvents() {

    }

    override fun setValuse() {

        mainAdapter = MyViewPageAdapter(supportFragmentManager)
        myViewPager.adapter = mainAdapter

    }
}
