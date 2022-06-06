package com.alexpletnyov.dependency_injection_example.example_2.data.network

import android.util.Log

class ExampleApiService {

	fun method() {
		Log.d(LOG_TAG, "ExampleApiService")
	}

	companion object {

		private const val LOG_TAG = "EXAMPLE_TEST"
	}
}