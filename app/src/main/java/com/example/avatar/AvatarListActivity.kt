package com.example.avatar

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AvatarListActivity : AppCompatActivity(), AvatarListPresenter.View {

        val presenter = AvatarListPresenter

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.avatar_list)

                avatarList.layoutManager = LinearLayoutManager(this)
                viewAdapter = AvatarAdapter(myDataset)
                    avatarList.setHasFixedSize(true)

                    // use a linear layout manager
                    layoutManager = viewManager

                    // specify an viewAdapter (see also next example)
                    val adapter = AvatarAdapter

                }
            }
    }
}