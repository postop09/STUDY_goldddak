package test.map.goldddak

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import test.map.goldddak.databinding.ActivityRealMainBinding

class RealMainActivity : AppCompatActivity() {

    private var realMainBinding : ActivityRealMainBinding?=null
    private val binding get() = realMainBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        realMainBinding = ActivityRealMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.LoginTextView.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }

        setTransparent()

        Handler().postDelayed({
            fadeanimation(this)
        },1000)




    }

    fun fadeanimation(activity: Activity) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()

    }

    // Status bar를 투명하게 바꾸기 위한 함수
    private fun setTransparent() {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    // Status bar를 투명하게 바꾸기 위한 함수
    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }
}