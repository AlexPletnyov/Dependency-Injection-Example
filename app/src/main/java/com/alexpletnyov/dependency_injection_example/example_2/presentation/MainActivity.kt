package com.alexpletnyov.dependency_injection_example.example_2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexpletnyov.dependency_injection_example.R
import com.alexpletnyov.dependency_injection_example.example_1.Activity
import com.alexpletnyov.dependency_injection_example.example_2.di.ApplicationComponent
import com.alexpletnyov.dependency_injection_example.example_2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

	@Inject
	lateinit var viewModel: ExampleViewModel

	private val component = DaggerApplicationComponent.create()

	override fun onCreate(savedInstanceState: Bundle?) {
		component.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		viewModel.method()
	}
}