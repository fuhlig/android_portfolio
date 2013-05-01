package de.hsb.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ContactForm extends Activity {

	Spinner mSpinner_phone, mSpinner_email = null;
	EditText mInput_name; 
	EditText mInput_phone;
	EditText mInput_email;
	EditText mInput_address_street;
	EditText mInput_address_number;
	EditText mInput_address_city;
	EditText mInput_address_zip;
	
	String name = "";
	String phone;
	String email;
	String address_street;
	String address_number;
	String address_city;
	String address_zip;
	String option_phone;
	String option_email;
		
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactform);

		mInput_name = (EditText) findViewById(R.id.txt_name);
		mInput_phone = (EditText) findViewById(R.id.txt_phone);
		mInput_email = (EditText) findViewById(R.id.txt_email);
		mInput_address_street = (EditText) findViewById(R.id.txt_address_street);
		mInput_address_number = (EditText) findViewById(R.id.txt_address_number);
		mInput_address_city = (EditText) findViewById(R.id.txt_address_city);
		mInput_address_zip = (EditText) findViewById(R.id.txt_address_zip);
		
		
		// fill spinners with data
		mSpinner_phone= (Spinner) findViewById(R.id.spinnerPhone);
		ArrayAdapter<String> spinnerPhoneAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.contact_phone));
		spinnerPhoneAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner_phone.setAdapter(spinnerPhoneAdapter);

		mSpinner_email = (Spinner) findViewById(R.id.spinnerEmail);
		ArrayAdapter<String> spinnerEmailAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.contact_email));
		spinnerPhoneAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner_email.setAdapter(spinnerEmailAdapter);
		
		mInput_name.setOnFocusChangeListener(inputFocus);
	}
	
	public void addContact(View view) {
		// get input data
		name = mInput_name.getText().toString();
		phone = mInput_phone.getText().toString();
		email = mInput_phone.getText().toString();
		address_street = mInput_address_street.getText().toString();
		address_number = mInput_address_number.getText().toString();
		address_city = mInput_address_city.getText().toString();
		address_zip = mInput_address_zip.getText().toString();
		

		option_phone = mSpinner_phone.getSelectedItem().toString();
		option_email = mSpinner_phone.getSelectedItem().toString();		
		
		// start result intent when input data is validated
		if (validateInput()) {
			Intent intent = new Intent(this, ContactFormResult.class);
			intent.putExtra(ContactFormResult.EXTRA_NAME, name);
			intent.putExtra(ContactFormResult.EXTRA_PHONE, phone);
			intent.putExtra(ContactFormResult.EXTRA_PHONE_OPTION, option_phone);
			startActivity(intent);
		}
		
	}
	
	private boolean validateInput() {
		// TODO validate with parameter 	
		// check if name is entered
		if (name.matches("")) {
			// set error message
			
			Log.d("**debug info**", "invalid");
			mInput_name.setError(getString(R.string.error_input_required));
			return false;
		} else {
			// TODO remove error message
			Log.d("**debug info**", "valid");
			mInput_name.setError(null);
			return true;
		}
	}
	
	private OnFocusChangeListener inputFocus = new OnFocusChangeListener() {
		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			validateInput();
		}
	};
	
}
