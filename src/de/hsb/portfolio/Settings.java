package de.hsb.portfolio;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		SharedPreferences sharedPref = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);

		// get time of last change
		Editor editor = sharedPref.edit();
		editor.putString("lastchange", Calendar.getInstance().getTime().toString());
		editor.commit();
		
		
		// get data from shared preferences
		String username = sharedPref.getString("username", "noname");
		String email = sharedPref.getString("email", "name@example.com");
		String job = sharedPref.getString("job", "unemployed");
		String lastChange = sharedPref.getString("lastChange", "just now");

		
		// populate data into UI
		TextView txt_username = (TextView) findViewById(R.id.txt_username);
		TextView txt_email = (TextView) findViewById(R.id.txt_email);
		TextView txt_job = (TextView) findViewById(R.id.txt_job);
//		TextView txt_lastChange = (TextView) findViewById(R.id.txt_lastChange);
		txt_username.setText(username);
		txt_email.setText(email);
		txt_job.setText(job);
//		txt_lastChange.setText(lastChange);
		
	}
	
	public void editSettings(View view) {
		Toast.makeText(this, "open preferences", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this, Preference.class));
	}

}
