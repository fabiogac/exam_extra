package com.example.avatar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AvatarAdapter: RecyclerView.Adapter <AvatarAdapter.AvatarViewHolder>(){

    private var avatarList: List<Avatar> = emptyList()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvatarViewHolder {
            return AvatarViewHolder.from(parent)
        }

        override fun getItemCount(): Int {
            return avatarList.size
        }

        override fun onBindViewHolder(holder: AvatarViewHolder, position: Int) {
            val avatar = avatarList[position]
            holder.bind(avatar)
        }

            fun addItems(avatarList: List<Avatar>){
                this.avatarList= avatarList
                notifyDataSetChanged()
            }

    class AvatarViewHolder(view: View): RecyclerView.ViewHolder(view){
        private var avatarUserName=view.findViewById<TextView>(R.id.avatarUserName).toString()
        private var avatarName = view.findViewById<TextView>(R.id.avatarName).toString()
        private var avatarEyes = view.findViewById<Spinner>(R.id.eyes_spinner).toString()
        private var avatarNose = view.findViewById<Spinner>(R.id.nose_spinner).toString()
        private var avatarMouth =view.findViewById<Spinner>(R.id.mouth_spinner).toString()
        private val avatarImg = view.findViewById<ImageView>(R.id.avatarFace)

        fun bind(avatar: Avatar){
            with(avatar){
                avatarUserName=userName
                avatarName=name
                avatarEyes=eyes
                avatarNose=nose
                avatarMouth=mouth
            }
        }


        companion object {
            fun from(parent: ViewGroup): AvatarViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.avatar_list, parent, false)
                return AvatarViewHolder(view)
            }

        }
    }
}