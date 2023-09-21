package com.alexannu.webhelper

import android.content.Context
import android.widget.Toast

class TestClass {
    fun toastHello(context: Context) {
        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT)
    }
}