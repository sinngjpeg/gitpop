package com.sinngjpeg.gitpop.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sinngjpeg.gitpop.databinding.RepositoryActivityBinding

class RepositoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = RepositoryActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarRepository)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}