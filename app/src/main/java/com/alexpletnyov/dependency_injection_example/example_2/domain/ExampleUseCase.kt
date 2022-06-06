package com.alexpletnyov.dependency_injection_example.example_2.domain

class ExampleUseCase(
	private val repository: ExampleRepository
) {

	operator fun invoke() {
		repository.method()
	}
}