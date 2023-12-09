package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set initial text from ViewModel to TextView
        binding.textView.text = viewModel.textToShow

        // Set action for the button to update text on click
        binding.button.setOnClickListener {
            viewModel.textToShow = "Text updated!"
            binding.textView.text = viewModel.textToShow
        }
    }
}
