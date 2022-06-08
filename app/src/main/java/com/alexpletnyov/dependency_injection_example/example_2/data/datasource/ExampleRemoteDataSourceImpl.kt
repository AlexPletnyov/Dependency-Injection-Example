package com.alexpletnyov.dependency_injection_example.example_2.data.datasource

import com.alexpletnyov.dependency_injection_example.example_2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
	private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

	override fun method() {
		apiService.method()
	}
}