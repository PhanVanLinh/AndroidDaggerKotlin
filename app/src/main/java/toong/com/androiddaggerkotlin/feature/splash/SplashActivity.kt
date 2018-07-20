package toong.com.androiddaggerkotlin.feature.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import dagger.android.support.DaggerAppCompatActivity
import toong.com.androiddaggerkotlin.BaseActivity
import toong.com.androiddaggerkotlin.R
import javax.inject.Inject

class SplashActivity : BaseActivity() {

    @Inject
    lateinit var a: String

    lateinit var textTitle : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        textTitle = findViewById(R.id.text_title)
        textTitle.text = a
    }
}
