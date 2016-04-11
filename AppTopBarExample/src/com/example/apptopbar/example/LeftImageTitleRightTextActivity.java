package com.example.apptopbar.example;

import android.os.Bundle;

import com.example.apptopbar.AppTopBar.Mode;
import com.example.apptopbar.BaseActivity;
import com.example.apptopbar.R;

public class LeftImageTitleRightTextActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mAppTopBar.titleText.setText("LeftImageTitleRightText");

		// ���ؼ� + ������ + �ұ�����
		mAppTopBar.setMode(Mode.LEFTIMAGE_TITLE_RIGHTTEXT);
	}

}
