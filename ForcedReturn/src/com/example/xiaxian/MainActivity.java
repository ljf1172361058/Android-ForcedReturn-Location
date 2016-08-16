package com.example.xiaxian;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void xiaxian(View view) {
//		if(getPackageManager().getLaunchIntentForPackage("com.taobao.taobao") == null){
//			   Toast.makeText(getApplicationContext(),"您还没有安装淘宝客户端",Toast.LENGTH_LONG).show();
//			   return;
//		}
		try {
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			String url = "taobao://shop118514617.taobao.com";
			Uri uri = Uri.parse(url);
			intent.setData(uri);
			startActivity(intent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Toast.makeText(getApplicationContext(),"您还没有安装淘宝客户端",Toast.LENGTH_LONG).show();
		}
	}
	
	public void xx(View view) {
		Intent intent = new Intent("com.lzh.FORCE_OFFLINE");
		sendBroadcast(intent);
	}	
}
