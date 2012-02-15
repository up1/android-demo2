package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        
        Button newsBtn = (Button) findViewById(R.id.btn_news_feed);
        newsBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {				
				Intent i = new Intent(getApplicationContext(), NewsFeedActivity.class);
				startActivity(i);
			}
		});
        
    }
}