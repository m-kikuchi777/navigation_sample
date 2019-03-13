package com.kikuchi.masa.navigationsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.kikuchi.masa.navigationsample.R
import kotlinx.android.synthetic.main.fragment_first.view.*


/**
 *　最初に表示されるフラグメント。
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // SecondFragmentへ遷移するためのボタン
        view.secondFragmentButton.setOnClickListener {
            // 遷移する。
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        // ThirdFragmentへ遷移するためのボタン
        view.thirdFragmentButton.setOnClickListener {
            // 遷移する。
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        // FourthFragmentへ遷移するためのボタン
        view.fourthFragmentButton.setOnClickListener {
            // 遷移時のアニメーションをセットするためのオプション
            val navOption = navOptions {
                anim {
                    enter = R.anim.nav_default_enter_anim
                    exit = R.anim.nav_default_exit_anim
                    popEnter = R.anim.nav_default_pop_enter_anim
                    popExit = R.anim.nav_default_pop_exit_anim
                }
            }
            // 遷移する。
            findNavController().navigate(R.id.action_firstFragment_to_fourthFragment, null, navOption)
        }
    }
}
