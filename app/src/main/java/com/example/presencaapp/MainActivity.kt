package com.example.presencaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.presencaapp.databinding.ActivityMainBinding
import com.example.presencaapp.ui.fragments.FragmentFloatingButton

private lateinit var mAct: ActivityMainBinding
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mAct.root)

        mAct.toolbarIcon.setOnClickListener(this)

        val supportFragment = supportFragmentManager.beginTransaction()
        val fragment = FragmentFloatingButton()
        supportFragment.add(mAct.fragmentFloatingButton.id, fragment)
    }

    override fun onClick(view: View) {
        mAct.drawerLayout.open()
    }
}