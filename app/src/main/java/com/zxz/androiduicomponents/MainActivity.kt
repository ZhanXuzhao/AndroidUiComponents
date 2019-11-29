package com.zxz.androiduicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zxz.ui_components.EasyDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.setOnClickListener {
            val dialog = EasyDialog(this)
            dialog.setTitle(R.string.app_name)
            dialog.show()


        }
    }
}