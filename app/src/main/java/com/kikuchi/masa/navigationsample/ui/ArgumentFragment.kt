package com.kikuchi.masa.navigationsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kikuchi.masa.navigationsample.R
import kotlinx.android.synthetic.main.fragment_argument.*

/**
 * 値を受け取るフラグメント。
 */
class ArgumentFragment : Fragment() {

    // 渡された値を扱うためのクラス。
    val args: ArgumentFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_argument, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 渡された値を取り出して、TextViewにセットする。
        argumentFragmentTextView.text = args.inputText

    }
}
