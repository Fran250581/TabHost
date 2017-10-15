package com.example.fran.com.tabhost

import android.app.TabActivity
import android.os.Bundle
import android.view.View
import android.widget.TabHost

class MainActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val res = resources
        val tabHost = findViewById<View>(android.R.id.tabhost) as TabHost

        /* pest1 es una tag que nos sirve para identificar la pestaña.
           No se muestra. Idem pest2 y pest3 */

        val tab1 = tabHost.newTabSpec("pest1")
        val tab2 = tabHost.newTabSpec("pest2")
        val tab3 = tabHost.newTabSpec("pest3")

        tab1.setIndicator(res.getString(R.string.eti_tab1), null)
        tab2.setIndicator(res.getString(R.string.eti_tab2), null)
        tab3.setIndicator(res.getString(R.string.eti_tab3), null)

        tab1.setContent(R.id.tab1Layout)
        tab2.setContent(R.id.tab2Layout)
        tab3.setContent(R.id.tab3Layout)

        tabHost.addTab(tab1)
        tabHost.addTab(tab2)
        tabHost.addTab(tab3)
    }

}


