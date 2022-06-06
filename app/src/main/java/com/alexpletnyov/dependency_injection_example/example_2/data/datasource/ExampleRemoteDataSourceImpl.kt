package com.alexpletnyov.dependency_injection_example.example_2.data.datasource

import com.alexpletnyov.dependency_injection_example.example_2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
	private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

	override fun method() {
		apiService.method()
	}
}