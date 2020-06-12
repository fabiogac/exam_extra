package com.example.avatar

import android.view.View
import com.example.avatar.data.avatarApiFactory

class AvatarListPresenter(private val view: View) {

    val avatarApi = avatarApiFactory.get()

    fun init(){
        val avatarResponse = avatarApi.getAvatarbyName("Avatar/{name}")
        val avatarResponse = avatarApi.getAvatarbyName()
    }

}

interface View{
    fun showAvatarList(avatarList: List<Avatar>)
}