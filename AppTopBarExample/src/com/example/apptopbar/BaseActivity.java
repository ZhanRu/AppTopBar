package com.example.apptopbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * �̳�BaseActivity��Activity����ֱ����ʾ������AppTopBar
 * <p>
 * 
 * 2016-04-05
 * </p>
 * 
 * @author WuMeng
 * @version 1.0
 * 
 */
public class BaseActivity extends Activity {

	/** ������ */
	public AppTopBar mAppTopBar;
	/** ���ظ����е�AppTopBar�������XML���������� */
	private LinearLayout parentLinearLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initContentView(R.layout.layout_app_top_bar);
	}

	/**
	 * ��ʼ��ContentView
	 */
	private void initContentView(int layoutResID) {
		ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
		viewGroup.removeAllViews();
		parentLinearLayout = new LinearLayout(this);
		parentLinearLayout.setOrientation(LinearLayout.VERTICAL);
		viewGroup.addView(parentLinearLayout);
		LayoutInflater.from(this).inflate(layoutResID, parentLinearLayout, true);
		// INIT AppTopBar
		mAppTopBar = (AppTopBar) findViewById(R.id.mAppTopBar);
	}

	@Override
	public void setContentView(int layoutResID) {
		LayoutInflater.from(this).inflate(layoutResID, parentLinearLayout, true);
	}

	@Override
	public void setContentView(View view) {
		parentLinearLayout.addView(view);
	}

	@Override
	public void setContentView(View view, ViewGroup.LayoutParams params) {
		parentLinearLayout.addView(view, params);
	}

}
