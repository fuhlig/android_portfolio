package de.hsb.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondLifeCycle extends Activity {

	private static final String TAG = "*** Second Activity ***";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_life_cycle);
		Log.d(TAG, "onCreate");
	}
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}
}