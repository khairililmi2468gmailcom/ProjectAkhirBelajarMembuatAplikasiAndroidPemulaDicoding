package com.example.projectakhirandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectakhirandroid.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileBinding : ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileBinding = ActivityProfileBinding.inflate(layoutInflater)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        setContentView(profileBinding.root)

        supportActionBar?.title = "Profile"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        profileBinding.button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/khairililmi2468gmailcom")
            startActivity(intent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}




