package com.github.jamesdeperio.viewpagerbuilder

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.view.*

private const val ARG_PARAM1 = "param1"

class PageFragment : Fragment() {
    private var page: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            page = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_page, container, false)

        rootView.tv_page.text = page
        return rootView
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}
