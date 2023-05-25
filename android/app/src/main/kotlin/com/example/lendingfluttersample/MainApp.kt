package com.example.lendingfluttersample

import `in`.lending.finbox_lending_plugin.FinBoxLendingPlugin
import io.flutter.app.FlutterApplication

class MainApp: FlutterApplication() {

    override fun onCreate() {
        super.onCreate()
        FinBoxLendingPlugin.initLibrary(this)
    }
}