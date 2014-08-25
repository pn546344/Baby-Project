package com.mustcsie.babygame;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Interactive extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interactive_layout);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		ImageButton ibtn = (ImageButton)findViewById(R.id.imageButton1);
		ibtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imageButton1:
			finish();
			break;

		default:
			break;
		}
		
	}
}
