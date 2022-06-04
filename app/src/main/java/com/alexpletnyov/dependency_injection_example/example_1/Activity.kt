package com.alexpletnyov.dependency_injection_example.example_1

class Activity {

	lateinit var keyboard: Keyboard

	init {
		Component().inject(this)
	}
}