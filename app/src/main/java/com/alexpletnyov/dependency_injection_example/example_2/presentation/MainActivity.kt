package com.alexpletnyov.dependency_injection_example.example_2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexpletnyov.dependency_injection_example.R
import com.alexpletnyov.dependency_injection_example.example_1.Activity

class MainActivity : AppCompatActivity() {

	lateinit var viewModel: ExampleViewModel

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		viewModel.method()
	}
}