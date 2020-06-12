package com.example.avatar.data

import com.example.avatar.Avatar
import retrofit2.Retrofit
import retrofit2.http.GET

interface avatarApi {
    @GET("face/{eyes},{nose},{mouth}")
    fun getAvatarbyName(): avatarResponse
}

data class avatarResponse(
    val avatarList: List<Avatar>
)

object avatarApiFactory{
    fun get(): avatarApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(" https://api.adorable.io/avatars/face/${eyes}/${nose}/${mouth}/EDEDFF/200")
            .addConverterFactory(GsonConverterFactory.create())
    }
}
