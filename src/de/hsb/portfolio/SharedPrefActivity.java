package de.hsb.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SharedPrefActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shared_pref);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shared_pref, menu);
		return true;
	}

}
