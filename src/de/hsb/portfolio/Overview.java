package de.hsb.portfolio;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Overview extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_overview_list);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.assignments));
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		switch (position) {
		case 0:
			startActivity(new Intent(this, HelloWorld.class));
			break;
		case 1:
			startActivity(new Intent(this, ContactForm.class));
			break;
		case 2:
			startActivity(new Intent(this, LifeCycleActivity.class));
			break;
		case 4:
			startActivity(new Intent(this, SharedPrefActivity.class));
			break;
			
		default:
			startActivity(new Intent(this, HelloWorld.class));
			break;
		}
	}

}
