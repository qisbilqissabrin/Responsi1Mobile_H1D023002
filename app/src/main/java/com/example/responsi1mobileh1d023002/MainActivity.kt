package com.example.responsi1mobileh1d023002

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.responsi1mobileh1d023002.databinding.ActivityMainBinding
import com.example.responsi1mobileh1d023002.databinding.ActivityHeadCoachBinding
import com.example.responsi1mobileh1d023002.databinding.ActivitySquadBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
        initListener()
    }
    private fun initLayout(){
        binding.layoutBola.let {
            it.imgIcon.setImageResource(R.drawable.ic_history)
            it.tvLayout.setText(R.string.bola)
        }

        binding.layoutCoach.let {
            it.imgIcon.setImageResource(R.drawable.ic_coach)
            it.tvLayout.setText(R.string.coach)
        }

        binding.layoutSquad.let {
            it.imgIcon.setImageResource(R.drawable.ic_squad)
            it.tvLayout.setText(R.string.squad)
        }
    }

    private fun initListener(){
        binding.layoutBola.root.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }

        binding.layoutCoach.root.setOnClickListener {
            startActivity(Intent(this, HeadCoach::class.java))
        }

        binding.layoutSquad.root.setOnClickListener {
            startActivity(Intent(this, ActivitySquad::class.java))
        }
    }
    }

