package com.example.chatbot.firebase

import android.content.Context
import android.widget.Toast

class AndroidUtil {

    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }


    }
}