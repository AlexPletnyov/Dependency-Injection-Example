package com.alexpletnyov.dependency_injection_example.example_2.di

import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleLocalDataSource
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleLocalDataSourceImpl
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleRemoteDataSource
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

	@Binds
	fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

	@Binds
	fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

//	@Provides
//	abstract fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
//		return impl
//	}
}