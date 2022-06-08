package com.alexpletnyov.dependency_injection_example.example_2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDataBase @Inject constructor() {

	fun method() {
		Log.d(LOG_TAG, "ExampleDataBase")
	}

	companion object {

		private const val LOG_TAG = "EXAMPLE_TEST"
	}
}