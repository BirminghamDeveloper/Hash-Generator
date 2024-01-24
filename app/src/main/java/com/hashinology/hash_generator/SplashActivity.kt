package com.hashinology.hash_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.hashinology.hash_generator.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        startSplash()
    }

    private fun startSplash() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HashingActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}