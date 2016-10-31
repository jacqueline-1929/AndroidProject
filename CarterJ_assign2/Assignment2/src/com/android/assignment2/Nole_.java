package com.android.assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Nole_ extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nole_);
		
		Button button = (Button)findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				 Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
				 startActivity(nextScreen);		 
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.nole_, menu);
		return true;
	}

}
