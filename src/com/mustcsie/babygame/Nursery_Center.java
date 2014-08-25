package com.mustcsie.babygame;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;

public class Nursery_Center extends	Activity implements OnClickListener {
	
	NumberPicker np1;
	NumberPicker np2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nursery_center_layout);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		ImageButton ibtn = (ImageButton)findViewById(R.id.imageButton1);
		ibtn.setOnClickListener(this);
		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
		np1 = (NumberPicker)findViewById(R.id.numberPicker1);
		np2 = (NumberPicker)findViewById(R.id.numberPicker2);
		NumberPicker.Formatter Two_Digit = new NumberPicker.Formatter() {
			
			@Override
			public String format(int value) {
				// TODO Auto-generated method stub
				return String.format("%02d", value);
			}
		};
		np1.setMaxValue(8);
		np1.setMinValue(0);
		np1.setWrapSelectorWheel(true);
		np2.setMaxValue(59);
		np2.setMinValue(0);
		np2.setFormatter(Two_Digit);
		np2.setWrapSelectorWheel(true);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			int time = 0;
			time = np1.getValue()*60+np2.getValue();
			Log.i("ttt", "time="+time);
			break;

		case R.id.imageButton1:
			finish();
			break;
		}
		
	}
}
