package com.luckyasme.module_publish_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luckyasme.module_publish.TestA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestA.echo()
    }
}