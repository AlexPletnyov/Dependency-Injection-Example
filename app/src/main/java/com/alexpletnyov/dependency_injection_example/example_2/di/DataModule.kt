package com.alexpletnyov.dependency_injection_example.example_2.di

import android.content.Context
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleLocalDataSource
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleLocalDataSourceImpl
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleRemoteDataSource
import com.alexpletnyov.dependency_injection_example.example_2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule(private val context: Context) {

	@Provides
	fun provideContext(): Context {
		return context
	}

//	@Binds
//	fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
//
//	@Binds
//	fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

	@Provides
	fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
		return impl
	}

	@Provides
	fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
		return impl
	}
}