package com.alexpletnyov.dependency_injection_example.example_1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

	fun inject(activity: Activity)
}