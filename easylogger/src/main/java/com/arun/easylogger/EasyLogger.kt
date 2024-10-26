package com.arun.easylogger

import android.util.Log


/**
 * Created by Arun Aditya on 26-10-2024.
 * LinkedIn: https://www.linkedin.com/in/arun-aditya-82a94914a/
 */
object EasyLogger {
    const val TAG = "EASY LOGGER"

    fun d(message: String) {
        Log.d(TAG, message)
    }

    fun e(message: String) {
        Log.e(TAG, message)
    }

    fun i(message: String) {
        Log.i(TAG, message)
    }

    fun v(message: String) {
        Log.v(TAG, message)
    }

    fun w(message: String) {
        Log.w(TAG, message)
    }

    fun e(message: String, error: Throwable) {
        Log.e(TAG, message, error)
    }
}