package com.venu.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recycle.*

class RecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        with(recyclerView){
            this.adapter=ItemsAdapter(this@RecycleActivity)
        }


    }
}