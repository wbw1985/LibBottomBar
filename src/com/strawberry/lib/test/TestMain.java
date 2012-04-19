package com.strawberry.lib.test;

import android.app.Activity;
import android.os.Bundle;

import com.strawberry.lib.tab.R;
import com.strawberry.lib.tab.TabBottomBarLib;

public class TestMain extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	        setContentView(R.layout.demo1);
	        TabBottomBarLib tb = new TabBottomBarLib();
			tb.setCurrentTab(1);
	}

}