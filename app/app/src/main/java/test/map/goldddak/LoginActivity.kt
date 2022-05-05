package test.map.goldddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import test.map.goldddak.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var loginBinding : ActivityLoginBinding?=null
    private val binding get() = loginBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}