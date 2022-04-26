package com.plcoding.streamchatapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.getstream.chat.android.livedata.ChatDomain

@HiltAndroidApp
class ChatApplication : Application()  {

    override fun onCreate() {
        super.onCreate()
        ChatDomain.Builder(client,applicationContext).build()
    }

}