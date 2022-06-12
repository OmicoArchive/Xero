package me.omico.xero

import android.app.Application

class XeroApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {

        lateinit var instance: Application
            private set
    }
}

val applicationContext: Application = XeroApplication.instance
