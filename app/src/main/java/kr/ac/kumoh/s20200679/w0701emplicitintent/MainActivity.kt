package kr.ac.kumoh.s20200679.w0701emplicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import kr.ac.kumoh.s20200679.w0701emplicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("https://yj59.github.io/")
            val intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener{
            //val uri = Uri.parse("geo:36.1441, 128.3918?z=17")
            val uri = Uri.parse("geo:0, 0?z=17&q=경기 안양시 동안구 75")
            val intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }

        binding.btnTelephone.setOnClickListener{
            val uri = Uri.parse("sms:010-8490-9306")
            val intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }
    }
}