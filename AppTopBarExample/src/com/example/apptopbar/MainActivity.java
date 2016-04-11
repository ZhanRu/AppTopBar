package com.example.apptopbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.apptopbar.example.LeftImageTitleActivity;
import com.example.apptopbar.example.LeftImageTitleRightImageActivity;
import com.example.apptopbar.example.LeftImageTitleRightTextActivity;
import com.example.apptopbar.example.LeftTextTitleRightTextActivity;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mAppTopBar.titleText.setText("MainActivity");

		findViewById(R.id.leftimage_title).setOnClickListener(mOnClickListener);
		findViewById(R.id.leftimage_title_rightimage).setOnClickListener(mOnClickListener);
		findViewById(R.id.leftimage_title_righttext).setOnClickListener(mOnClickListener);
		findViewById(R.id.lefttext_title_righttext).setOnClickListener(mOnClickListener);

	}

	private OnClickListener mOnClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.leftimage_title:
				// ���ؼ� + ������
				startActivity(new Intent(MainActivity.this, LeftImageTitleActivity.class));
				break;
			case R.id.leftimage_title_rightimage:
				// ���ؼ� + ������ + �ұ�ͼƬ
				startActivity(new Intent(MainActivity.this, LeftImageTitleRightImageActivity.class));
				break;
			case R.id.leftimage_title_righttext:
				// ���ؼ� + ������ + �ұ�����
				startActivity(new Intent(MainActivity.this, LeftImageTitleRightTextActivity.class));
				break;
			case R.id.lefttext_title_righttext:
				// ������� + ������ + �ұ�����
				startActivity(new Intent(MainActivity.this, LeftTextTitleRightTextActivity.class));
				break;

			default:
				break;
			}
		}
	};

}
