package com.driuft.sharedlifecycle

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var _sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle: ", "onCreate")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        _sharedPreferences = this.getSharedPreferences(this.packageName, Context.MODE_PRIVATE)

        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onCreate")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log the state
        Log.d("Lifecycle: ", currentState)
        // Toast the state
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onStart")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onResume")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle: ", "onPause")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()

        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onPause")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle: ", "onStop")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onStop")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle: ", "onRestart")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onRestart")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle: ", "onDestroy")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        with(_sharedPreferences.edit()) {
            putString(getString(R.string.current_lifecycle_state), "onDestroy")
            apply()
        }

        val currentState = _sharedPreferences.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", currentState)
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }
}