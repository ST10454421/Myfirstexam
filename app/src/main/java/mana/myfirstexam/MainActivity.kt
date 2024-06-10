package mana.myfirstexam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//MainActivity
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openMainActivity2Button = findViewById<Button>(R.id.buttonCheckWeather)
        openMainActivity2Button.setOnClickListener {
            val MainActivity2 = Unit
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val exitButton = findViewById<Button>(R.id.buttonExit)
        exitButton.setOnClickListener {
            finish()
        }
    }
}
