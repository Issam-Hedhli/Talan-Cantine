package com.example.talancantine

import android.content.Intent
import android.os.Bundle
import android.view.SurfaceControl
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_admin_interface.*

class AdminInterface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_interface)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        view_pager.adapter = adapter

        TabLayoutMediator(tabLayout, view_pager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Création de plat"

                }
                1 -> {
                    tab.text = "Création du menu"
                }
                2 -> {
                    tab.text = "Gestion du menu"
                }
                3 -> {
                    tab.text = "Modification du menu"
                }

            }
        }.attach()



    }

            }







