package com.github.jamesdeperio.pagebuilder

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager

class PageBuilder {
    lateinit var viewPager: ViewPager
    private val titleList: MutableList<String> = ArrayList()
    private val fragmentList: MutableList<Fragment> = ArrayList()
    var tabLayout: TabLayout? = null
    var pageTransformer: ViewPager.PageTransformer? = null

    fun create(fragmentManager: FragmentManager) {
        viewPager.adapter = ViewPagerAdapter(fragmentManager, fragmentList, titleList)
        tabLayout?.setupWithViewPager(viewPager)
        viewPager.setPageTransformer(true, pageTransformer)
    }

    fun addPage(title: String="", fragment: Fragment) {
        titleList.add(title)
        fragmentList.add(fragment)
    }
    companion object Builder {
        inline fun build(fragmentManager: FragmentManager,properties: PageBuilder.() -> Unit) = PageBuilder().apply(properties).create(fragmentManager)
    }
}

inline fun FragmentManager.buildPage(properties: PageBuilder.() -> Unit) {
    PageBuilder.build(this,properties)
}
