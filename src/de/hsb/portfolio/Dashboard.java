// replaced with list (overview)  

package de.hsb.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class Dashboard extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}
	
	public void onButtonClick(View view) {
		switch (view.getId()) {
		case R.id.btn_helloworld:
			startActivity(new Intent(this, HelloWorld.class));
			break;
		case R.id.btn_ui:
			startActivity(new Intent(this, ContactForm.class));
			break;
//		case R.id.btn_overview:
//			startActivity(new Intent(this, Overview.class));
//			break;
		case R.id.btn_lifecycle:
			startActivity(new Intent(this, LifeCycleActivity.class));
		}
	}

}
