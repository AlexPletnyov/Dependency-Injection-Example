package com.alexpletnyov.dependency_injection_example.example_2.presentation

import com.alexpletnyov.dependency_injection_example.example_2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
	private val useCase: ExampleUseCase
) {

	fun method() {
		useCase()
	}
}