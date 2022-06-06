package com.alexpletnyov.dependency_injection_example.example_2.presentation

import com.alexpletnyov.dependency_injection_example.example_2.domain.ExampleUseCase

class ExampleViewModel(
	private val useCase: ExampleUseCase
) {

	fun method() {
		useCase()
	}
}