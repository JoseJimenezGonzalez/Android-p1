package com.example.myapplication

import android.content.Context
import android.widget.Toast

class ToastInvoke {
    companion object{
        val texto = "Cambio de activity"
        fun mostrarToast(context: Context){
            Toast.makeText(context, texto, Toast.LENGTH_SHORT).show()
        }
    }
}