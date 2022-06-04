package com.alexpletnyov.dependency_injection_example.example_1

import dagger.Component

@Component
interface NewComponent {

	fun getKeyboard(): Keyboard //another way

	fun inject(activity: Activity)
}