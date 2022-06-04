package com.alexpletnyov.dependency_injection_example.example_1

import javax.inject.Inject

class Activity {

	@Inject
	lateinit var mouse: Mouse
	@Inject
	lateinit var monitor: Monitor

	var component = DaggerNewComponent.create()
	val keyboard: Keyboard = component.getKeyboard() //another way

	init {
		component.inject(this)
	}
}