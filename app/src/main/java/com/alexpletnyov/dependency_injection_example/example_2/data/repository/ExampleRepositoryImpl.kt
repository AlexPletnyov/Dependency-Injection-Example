package com.alexpletnyov.dependency_injection_example.example_2.data.repository

import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleLocalDataSourceImpl
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleRemoteDataSourceImpl
import com.alexpletnyov.dependency_injection_example.example_2.data.mapper.ExampleMapper
import com.alexpletnyov.dependency_injection_example.example_2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
	private val localDataSource: ExampleLocalDataSourceImpl,
	private val remoteDataSource: ExampleRemoteDataSourceImpl,
	private val mapper: ExampleMapper
) : ExampleRepository {

	override fun method() {
		mapper.map()
		localDataSource.method()
		remoteDataSource.method()
	}
}