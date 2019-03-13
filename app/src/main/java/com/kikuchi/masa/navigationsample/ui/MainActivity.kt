package com.kikuchi.masa.navigationsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kikuchi.masa.navigationsample.R

/**
 * メインアクティビティ。このアクティビティがNavHostを持っている。
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}
