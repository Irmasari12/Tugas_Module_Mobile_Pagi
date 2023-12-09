  package com.example.hadiah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mViewPager: ViewPager2 = findViewById(R.id.my_view_pager)
        val mTabLayout: TabLayout = findViewById(R.id.my_tab_layout)

        mViewPager.adapter = VPAdapter(this)
        TabLayoutMediator(mTabLayout, mViewPager) {tab, position ->
            when(position) {
                0 -> tab.text = "Schedule"
                1 -> tab.text = "Pengingat"
            }
        }.attach()

    }
}