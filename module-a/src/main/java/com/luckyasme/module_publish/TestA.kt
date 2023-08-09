package com.luckyasme.module_publish

import android.util.Log

object TestA {

    fun echo() {
        TestB.echo()
        Log.d("TAG", "echo: a")
    }

}