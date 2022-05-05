package test.map.goldddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import test.map.goldddak.databinding.ActivitySubscribeBinding

class subscribeActivity : AppCompatActivity() {

    private var subscribeBinding : ActivitySubscribeBinding?=null
    private val binding get() = subscribeBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribeBinding = ActivitySubscribeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}