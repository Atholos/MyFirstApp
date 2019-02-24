package example.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var TAG ="Debug"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun sendMessage(textView: View){
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this,DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
        //Log.d(TAG,message)
    }
}