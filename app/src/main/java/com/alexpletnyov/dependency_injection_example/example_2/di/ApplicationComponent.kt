package com.alexpletnyov.dependency_injection_example.example_2.di

import com.alexpletnyov.dependency_injection_example.example_2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

	fun inject(activity: MainActivity)
}