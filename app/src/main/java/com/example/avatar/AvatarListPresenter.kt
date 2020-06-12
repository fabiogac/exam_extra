package com.example.avatar

import android.view.View
import com.example.avatar.data.avatarApiFactory
import com.example.avatar.data.avatarResponse

class AvatarListPresenter(private val view: View) {

    val avatarApi = avatarApiFactory.get()

    fun init(){

        view.showAvatarList(avatarResponse.avatarList)
    }


}

interface View{
    fun showAvatarList(avatarList: List<Avatar>)
}