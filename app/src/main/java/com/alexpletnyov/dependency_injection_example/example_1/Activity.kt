package com.alexpletnyov.dependency_injection_example.example_1

class Activity {

//	val computer: Computer = Component().getComputer() //another way
	lateinit var computer: Computer
	lateinit var keyboard: Keyboard

	init {
		Component().inject(this)
	}
}