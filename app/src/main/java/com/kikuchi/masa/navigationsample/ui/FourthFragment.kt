package com.kikuchi.masa.navigationsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kikuchi.masa.navigationsample.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FourthFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FourthFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FourthFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = FourthFragment()
    }
}
