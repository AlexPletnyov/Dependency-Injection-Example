package com.alexpletnyov.dependency_injection_example.example_2.data.database

import android.content.Context
import android.util.Log
import com.alexpletnyov.dependency_injection_example.R
import javax.inject.Inject

class ExampleDataBase @Inject constructor(
	private val context: Context
) {

	fun method() {
		Log.d(LOG_TAG, "ExampleDataBase ${context.getString(R.string.app_name)}")
	}

	companion object {

		private const val LOG_TAG = "EXAMPLE_TEST"
	}
}