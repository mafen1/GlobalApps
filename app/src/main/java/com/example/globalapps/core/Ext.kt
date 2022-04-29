package com.example.globalapps.core

import android.widget.TextView

fun updateText(view: TextView, message: Any){
    view.text = message.toString()
}