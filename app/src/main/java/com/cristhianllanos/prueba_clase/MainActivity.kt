package com.cristhianllanos.prueba_clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var estadoApp: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //estadoApp = savedInstanceState?.getString(GAME_STATE_KEY)
        //TODO https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es
        Log.d(TAG,"Ciclo de vida - onCreate")
        setContentView(R.layout.activity_main)
    }
    companion object {
        private const val TAG = "MainActivity"
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }



}

