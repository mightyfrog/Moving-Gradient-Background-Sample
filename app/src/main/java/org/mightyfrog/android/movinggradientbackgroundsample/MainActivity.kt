package org.mightyfrog.android.movinggradientbackgroundsample

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout

/**
 * http://thetechnocafe.com/make-a-moving-gradient-background-in-android/
 *
 * @author Shigehiro Soejima
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<FrameLayout>(R.id.content_frame)
        (layout.background as AnimationDrawable).apply {
            setEnterFadeDuration(2500)
            setExitFadeDuration(2500)
            start()
        }
    }
}
