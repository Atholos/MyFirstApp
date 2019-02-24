package example.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView).apply{
            text = message
        }
    }
}
