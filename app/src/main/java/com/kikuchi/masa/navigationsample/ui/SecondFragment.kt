package com.kikuchi.masa.navigationsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kikuchi.masa.navigationsample.R
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * 2番目のフラグメント。
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // EditTextに入力されている値をArgumentFragmentにわたすためのボタン
        secondFragmentSubmitButton.setOnClickListener {
            // 入力されている値を取り出す。
            val inputText = secondFragmentEditText.text.toString()
            // SafeArgsを使用して、渡す値をセットする。
            val action = SecondFragmentDirections.actionSecondFragmentToArgumentFragment(inputText)
            // 遷移する。
            findNavController().navigate(action)
        }
    }
}
