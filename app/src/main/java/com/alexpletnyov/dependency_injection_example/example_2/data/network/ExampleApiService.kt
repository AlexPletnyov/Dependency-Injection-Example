package com.alexpletnyov.dependency_injection_example.example_2.data.network

import android.content.Context
import android.util.Log
import com.alexpletnyov.dependency_injection_example.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
	private val context: Context
) {

	fun method() {
		Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)}")
	}

	companion object {

		private const val LOG_TAG = "EXAMPLE_TEST"
	}
}