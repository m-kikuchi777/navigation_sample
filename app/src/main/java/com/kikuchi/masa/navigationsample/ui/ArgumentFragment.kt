package com.kikuchi.masa.navigationsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kikuchi.masa.navigationsample.R
import kotlinx.android.synthetic.main.fragment_argument.*

class ArgumentFragment : Fragment() {

    val args: ArgumentFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_argument, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = ArgumentFragmentArgs.fromBundle(arguments!!)
        argumentFragmentTextView.text = args.inputText

    }

    companion object {
        @JvmStatic
        fun newInstance() = ArgumentFragment()
    }
}
