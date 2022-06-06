package com.alexpletnyov.dependency_injection_example.example_1

import javax.inject.Inject

class Activity {

	@Inject
	lateinit var computer: Computer

	init {
		DaggerNewComponent.create().inject(this)
	}
}