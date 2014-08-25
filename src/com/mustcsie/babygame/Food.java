package com.mustcsie.babygame;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Food extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food_layout);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		ImageButton ibtn = (ImageButton)findViewById(R.id.imageButton1);
		ibtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.imageButton1:
			finish();
			break;

		default:
			break;
		}
		
	}
}
