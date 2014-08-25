package com.mustcsie.babygame;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

	Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
        File file = null;
        try {
        	file = getFileStreamPath("baby.txt");
        	Log.i("ttt", "read baby file");
		} catch (Exception e) {
			// TODO: handle exception
		}
        if(file.isFile() == false)
        {
        	Log.i("ttt", "no baby file");
        	intent = new Intent(this,CreateBaby.class);
            startActivity(intent);
            Log.i("ttt", "startactivity");
        }
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			intent = new Intent(this, Food.class);
			startActivity(intent);
			break;

		case R.id.button2:
			intent = new Intent(this, Interactive.class);
			startActivity(intent);
			break;
		case R.id.button3:
			intent = new Intent(this, Nursery.class);
			startActivity(intent);
			break;
		}
		
	}

}
