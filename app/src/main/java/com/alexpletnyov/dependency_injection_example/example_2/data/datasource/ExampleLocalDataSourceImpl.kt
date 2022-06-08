package com.alexpletnyov.dependency_injection_example.example_2.data.datasource

import com.alexpletnyov.dependency_injection_example.example_2.data.database.ExampleDataBase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
	private val database: ExampleDataBase
) : ExampleLocalDataSource {

	override fun method() {
		database.method()
	}
}