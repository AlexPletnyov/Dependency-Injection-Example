package com.alexpletnyov.dependency_injection_example.example_1

class Activity {

	val monitor = Monitor()
	val keyboard = Keyboard()
	val mouse = Mouse()
	val computerTower = ComputerTower(
		Storage(),
		Memory(),
		Processor()
	)

	val computer = Computer(monitor, computerTower, keyboard, mouse)
}