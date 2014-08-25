package com.mustcsie.babygame;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Nursery extends Activity implements OnClickListener{
	
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nursery_layout);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		Button btn1 = (Button)findViewById(R.id.button1);
		Button btn2 = (Button)findViewById(R.id.button2);
		ImageButton ibtn = (ImageButton)findViewById(R.id.imageButton1);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		ibtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			intent = new Intent(this,Nursery_Center.class);
			startActivity(intent);
			break;
			
		case R.id.button2:
			intent = new Intent(this,Nursery_People.class);
			startActivity(intent);
			break;
		case R.id.imageButton1:
			finish();
			break;
		}
		
	}
}
