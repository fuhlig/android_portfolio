package de.hsb.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ContactFormResult extends Activity {
	protected static final String EXTRA_NAME = "name";
	protected static final String EXTRA_PHONE = "phone";
	protected static final String EXTRA_PHONE_OPTION= "phone-option";
	protected static final String EXTRA_EMAIL = "email";
	protected static final String EXTRA_EMAIL_OPTION = "email-option";
	protected static final String EXTRA_ADDRESS_STREET = "address_street";
	protected static final String EXTRA_ADDRESS_NUMBER = "address_number";
	protected static final String EXTRA_ADDRESS_CITY = "address_city";
	protected static final String EXTRA_ADDRESS_ZIP = "address_zip";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_form_result);
		
		Intent intent = getIntent();
		String name = intent.getStringExtra(EXTRA_NAME);
		String phone = intent.getStringExtra(EXTRA_PHONE);
		String phone_option = intent.getStringExtra(EXTRA_PHONE_OPTION);
		
		TextView txt_name = (TextView) findViewById(R.id.txt_name);
		txt_name.setText(name);
		TextView txt_phone = (TextView) findViewById(R.id.txt_phone);
		txt_phone.setText(phone);
		TextView txt_phone_option = (TextView) findViewById(R.id.txt_phone_option);
		txt_phone_option.setText(phone_option);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_form_result, menu);
		return true;
	}

}
