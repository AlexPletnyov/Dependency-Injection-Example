package com.alexpletnyov.dependency_injection_example.example_2.di

import com.alexpletnyov.dependency_injection_example.example_2.data.repository.ExampleRepositoryImpl
import com.alexpletnyov.dependency_injection_example.example_2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

	@Binds
	fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}