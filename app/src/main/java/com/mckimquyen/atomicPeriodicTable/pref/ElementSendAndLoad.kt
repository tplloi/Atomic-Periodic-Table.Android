package com.mckimquyen.atomicPeriodicTable.pref

import android.content.Context
import android.content.SharedPreferences

class ElementSendAndLoad(context: Context) {

    private val prefName = "ElementSendAndLoad"
    private val prefValue = "ElementSendAndLoadValue"

    private val preference: SharedPreferences =
        context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

    fun getValue(): String? {
        return preference.getString(prefValue, "hydrogen")
    }

    fun setValue(string: String) {
        val editor = preference.edit()
        editor.putString(prefValue, string)
        editor.apply()
    }
}
