package com.example.progressbarfragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sample.demo.myapplication.ProgressbarFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loading_btn.setOnClickListener {
            supportFragmentManager.let{
                ProgressbarFragment.newInstance("讀取中").show(it, "")
            }
        }
    }
}
