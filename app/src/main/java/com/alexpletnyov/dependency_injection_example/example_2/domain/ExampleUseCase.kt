package com.alexpletnyov.dependency_injection_example.example_2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
	private val repository: ExampleRepository
) {

	operator fun invoke() {
		repository.method()
	}
}