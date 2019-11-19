package com.github.jamesdeperio.viewpagerbuilder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.jamesdeperio.pagebuilder.buildPage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        PageBuilder.build(fragmentManager = supportFragmentManager) {
            this.viewPager = view_pager
            this.tabLayout = tab_layout
            this.pageTransformer = null
            addPage(title = "1", fragment = PageFragment.newInstance("PAGE 1"))
            addPage(title = "2", fragment = PageFragment.newInstance("PAGE 2"))
            addPage(title = "3", fragment = PageFragment.newInstance("PAGE 3"))
            addPage(title = "4", fragment = PageFragment.newInstance("PAGE 4"))
        }
         */

        supportFragmentManager.buildPage {
            this.viewPager = view_pager
            this.tabLayout = tab_layout // optional / null by default
            this.pageTransformer = null // optional / null by default
            addPage(title = "1", fragment = PageFragment.newInstance("PAGE 1"))
            addPage(title = "2", fragment = PageFragment.newInstance("PAGE 2"))
            addPage(title = "3", fragment = PageFragment.newInstance("PAGE 3"))
            addPage(title = "4", fragment = PageFragment.newInstance("PAGE 4"))
        }

    }
}
