package com.strawberry.lib.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.strawberry.lib.tab.R;
import com.strawberry.lib.tab.TabBottomBarLib;
import com.strawberry.lib.tab.views.TabLibObject;

public class TabDemo extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initIntentListData();
	}
	
	private void initIntentListData() {
		TabLibObject tlo = new TabLibObject();
		tlo.tabId = 1;
		tlo.tabText = "第一个bar";
		tlo.tabIntent = new Intent(this, Demo1.class);
		tlo.tabBitmapResourceNormal = R.drawable.tab_weixin_normal;
		tlo.tabBitmapResourcePressed = R.drawable.tab_weixin_pressed;
		TabBottomBarLib.addTabIntentObject(this, tlo );
		
		TabLibObject tlo1 = new TabLibObject();
		tlo1.tabId = 2;
		tlo1.tabText = "第二个bar";
		tlo1.tabIntent = new Intent(this, Demo2.class);
		tlo1.tabBitmapResourceNormal = R.drawable.tab_weixin_normal;
		tlo1.tabBitmapResourcePressed = R.drawable.tab_weixin_pressed;
		TabBottomBarLib.addTabIntentObject(this, tlo1 );
		
		TabLibObject tlo2 = new TabLibObject();
		tlo2.tabId = 3;
		tlo2.tabText = "第三个bar";
		tlo2.tabIntent = new Intent(this, Demo3.class);//MyRiddleActivity
		tlo2.tabBitmapResourceNormal = R.drawable.tab_weixin_normal;
		tlo2.tabBitmapResourcePressed = R.drawable.tab_weixin_pressed;
		TabBottomBarLib.addTabIntentObject(this, tlo2 );
		
		TabLibObject tlo3 = new TabLibObject();
		tlo3.tabId = 4;
		tlo3.tabText = "第四个bar";
		tlo3.tabIntent = new Intent(this, Demo1.class);
		tlo3.tabBitmapResourceNormal = R.drawable.tab_weixin_normal;
		tlo3.tabBitmapResourcePressed = R.drawable.tab_weixin_pressed;
		TabBottomBarLib.addTabIntentObject(this, tlo3 );
		
		TabLibObject tlo4 = new TabLibObject();
		tlo4.tabId = 5;
		tlo4.tabText = "第五个bar";
		tlo4.tabIntent = new Intent(this, Demo2.class);
		tlo4.tabBitmapResourceNormal = R.drawable.tab_weixin_normal;
		tlo4.tabBitmapResourcePressed = R.drawable.tab_weixin_pressed;
		TabBottomBarLib.addTabIntentObject(this, tlo4 );
		
		Intent in = new Intent();
		in.setClass(this, TabBottomBarLib.class);
		Bundle bu = new Bundle();
		bu.putInt(TabBottomBarLib.bundlePositionKey, 2);
		in.putExtras(bu);
		startActivity(in);
		this.finish();
	}
}