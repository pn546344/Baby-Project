package com.mustcsie.babygame;

import java.io.FileOutputStream;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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
		switch (arg0.getId()) {
		case R.id.button1:
			EditText et = (EditText)findViewById(R.id.editText1);
			String name = et.getText()+"";
			FileOutputStream fos;
			try {
				fos = openFileOutput("baby.txt", Context.MODE_APPEND);
				fos.write(name.getBytes());
				fos.write('\n');
				fos.close();
				finish();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			break;
		}
		
	
	}
}
