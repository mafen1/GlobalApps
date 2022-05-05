package com.example.globalapps.ui.mainScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.globalapps.core.updateText
import com.example.globalapps.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvRandomActivity.setOnClickListener {
            initObserver()
            initData()
        }
    }

    private fun initObserver() {
        viewModel.activity.observe(this@MainActivity) {
                updateText(binding.tvRandomActivity, it)
            }
    }

    private fun initData() {
        viewModel.getActivity()
    }
}