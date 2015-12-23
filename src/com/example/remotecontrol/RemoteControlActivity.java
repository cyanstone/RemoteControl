package com.example.remotecontrol;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class RemoteControlActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {

		return new RemoteControlFragment();
	}
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(arg0);
	}
}
