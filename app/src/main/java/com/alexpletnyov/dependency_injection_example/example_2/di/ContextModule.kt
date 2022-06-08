package com.alexpletnyov.dependency_injection_example.example_2.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val application: Application) {

	@Provides
	fun provideContext(): Context {
		return application
	}
}