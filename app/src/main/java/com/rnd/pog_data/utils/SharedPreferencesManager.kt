package com.rnd.pog_data.utils

import com.rnd.pog_data.ApplicationClass.Companion.X_ACCESS_TOKEN
import com.rnd.pog_data.ApplicationClass.Companion.mSharedPreferences


fun saveJwt(jwtToken: String) {
    val editor = mSharedPreferences.edit()
    editor.putString(X_ACCESS_TOKEN, jwtToken)

    editor.apply()
}

fun getJwt(): String? = mSharedPreferences.getString(X_ACCESS_TOKEN, null)
