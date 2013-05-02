package de.hsb.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleActivity extends Activity {

	private static final String TAG = "*** First Activity ***";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		setContentView(R.layout.activity_life_cycle);
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
	
	// start second activity
	public void onButtonClick(View view) {
		startActivity(new Intent(this, SecondLifeCycle.class));
	}
}