package com.mustcsie.babygame;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CreateBaby extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Toast toast;
		toast=Toast.makeText(this, "test", Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT, 0, 0);
		toast.show();
	}
}
