package com.example.avatar

import android.view.View
import com.example.avatar.data.avatarApiFactory

class AvatarListPresenter(private val view: View) {

    val avatarApi = avatarApiFactory.get()

    fun init(){
        val avatarResponse = avatarApi.getAvatarbyName("face/{eyes},{nose},{mouth}")
        val avatarResponse = avatarApi.getAvatarbyName()

        view.showAvatarList(avatarResponse.avatarList)
    }

}

interface View{
    fun showAvatarList(avatarList: List<Avatar>)
}