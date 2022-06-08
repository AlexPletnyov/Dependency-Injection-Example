package com.alexpletnyov.dependency_injection_example.example_2.di

import com.alexpletnyov.dependency_injection_example.example_2.data.repository.ExampleRepositoryImpl
import com.alexpletnyov.dependency_injection_example.example_2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

	@Provides
	fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
		return impl
	}
}