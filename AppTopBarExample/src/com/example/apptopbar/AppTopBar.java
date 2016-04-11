package com.example.apptopbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * �Լ���װ��APP�����Ĳ�����
 * <p>
 * ������ɫ����ͼ�ֱ꣬���޸Ĵ����Դ�룬���ṩset����
 * <p>
 * 
 * 2016-04-05
 * </p>
 * 
 * @author WuMeng
 * @version 1.0
 * 
 */
public class AppTopBar extends RelativeLayout {

	/** ���ұ߾� - DP */
	private final int PADDING_SIZE = 10;
	/** ���ִ�С - Ĭ��SP������ת�� */
	private final int TEXT_SIZE = 18;
	/** ���屳����Ĭ����ɫ */
	private int BACKGROUND_COLOR = Color.parseColor("#F44A4A");
	/** �������ߺ��м�����������ɫ */
	private int TEXT_COLOR = Color.parseColor("#FFFFFF");
	/** ���ϽǷ��ؼ���Ĭ��ͼ�� */
	private int ICON_LEFT = android.R.drawable.ic_menu_revert;
	/** ���Ͻǵ�Ĭ��ͼ�� */
	private int ICON_RIGHT = android.R.drawable.ic_input_add;

	// �����ӿؼ�ȫΪpublic������װΪset/get����������ֱ�Ӳ����ӿؼ�
	/** ���ͼƬ - ���ذ�ť */
	public ImageView leftImage;
	/** �ұ߰�ť */
	public ImageView rightImage;
	/** ������� */
	public TextView leftText;
	/** �ұ����� */
	public TextView rightText;
	/** ������ */
	public TextView titleText;
	/** �����İ�ť�İ�ť�ڲ������ - ������չ�ɵ������ */
	private int padding;
	/** �����Ķ��� */
	private Context mContext;

	public AppTopBar(Context context) {
		super(context);
		initAppTopBar(context);
	}

	public AppTopBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		initAppTopBar(context);
	}

	public AppTopBar(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initAppTopBar(context);
	}

	/**
	 * ��ʼ��AppTopBar
	 * 
	 * @param context
	 */
	private void initAppTopBar(Context context) {
		// ����������Ԫ����ֱ����
		this.setGravity(Gravity.CENTER_VERTICAL);
		// ���ñ�����ɫ
		this.setBackgroundColor(BACKGROUND_COLOR);
		// ����Context
		this.mContext = context;
		// ��ȡ���ұ߾�
		padding = dip2px(PADDING_SIZE);

		// ������
		titleText = new TextView(mContext);
		titleText.setGravity(Gravity.CENTER);
		// ����
		titleText.setSingleLine(true);
		titleText.setText("Title");
		titleText.setTextColor(TEXT_COLOR);
		titleText.setTextSize(TEXT_SIZE);
		// ���ֲ���
		RelativeLayout.LayoutParams titleParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.MATCH_PARENT);
		titleParams.addRule(RelativeLayout.CENTER_IN_PARENT);
		addView(titleText, titleParams);
	}

	/**
	 * ������߰�ť
	 */
	private void addLeftImage() {
		// ��ߵ�ͼƬ - һ��Ϊ���ذ�ť
		leftImage = new ImageView(mContext);
		// ����Padding��Ϊ�����ӿɵ�����
		leftImage.setPadding(padding, padding, padding, padding);
		leftImage.setImageResource(ICON_LEFT);
		// ���õ���¼� - Ĭ��Ϊ���ذ�ť
		// ����ҳ���п���ֱ����AppTopBar.leftImage.setOnClickListener...ִ���Լ����߼������߼��Զ�ʧЧ
		leftImage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				((Activity) getContext()).finish();
			}
		});
		// ���ֲ���
		RelativeLayout.LayoutParams leftParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.MATCH_PARENT);
		leftParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		addView(leftImage, leftParams);
	}

	/**
	 * �����������
	 */
	private void addLeftText() {
		// ��ߵ�����
		leftText = new TextView(mContext);
		// ����Padding��Ϊ�����ӿɵ��������������Ҽ��
		leftText.setPadding(padding, padding, padding, padding);
		leftText.setText("Left");
		leftText.setTextColor(TEXT_COLOR);
		leftText.setTextSize(TEXT_SIZE);
		// ���ֲ���
		RelativeLayout.LayoutParams leftParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.MATCH_PARENT);
		leftParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		addView(leftText, leftParams);
	}

	/**
	 * �����ұ�����
	 */
	private void addRightText() {
		// �ұߵ�����
		rightText = new TextView(mContext);
		// ����Padding��Ϊ�����ӿɵ�����
		rightText.setPadding(padding, padding, padding, padding);
		rightText.setText("Right");
		rightText.setTextColor(TEXT_COLOR);
		rightText.setTextSize(TEXT_SIZE);
		// ���ֲ���
		RelativeLayout.LayoutParams rightParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.MATCH_PARENT);
		rightParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		addView(rightText, rightParams);
	}

	/**
	 * �����ұ߰�ť
	 */
	private void addRightImage() {
		// �ұߵ�ͼƬ
		rightImage = new ImageView(mContext);
		// ����Padding��Ϊ�����ӿɵ�����
		rightImage.setPadding(padding, padding, padding, padding);
		rightImage.setImageResource(ICON_RIGHT);
		// ���ֲ���
		RelativeLayout.LayoutParams rightParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.MATCH_PARENT);
		rightParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		addView(rightImage, rightParams);
	}

	/**
	 * ������ʾģʽ
	 * 
	 * @param mode
	 */
	public void setMode(Mode mode) {
		// �������õ�ģʽ��ʾ��Ӧ���
		switch (mode) {
		case LEFTIMAGE_TITLE:
			// ���ؼ� + ������
			addLeftImage();
			break;
		case LEFTIMAGE_TITLE_RIGHTIMAGE:
			// ���ؼ� + ������ + �ұ�ͼƬ
			addLeftImage();
			addRightImage();
			break;
		case LEFTIMAGE_TITLE_RIGHTTEXT:
			// ���ؼ� + ������ + �ұ�����
			addLeftImage();
			addRightText();
			break;
		case LEFTTEXT_TITLE_RIGHTTEXT:
			// ������� + ������ + �ұ�����
			addLeftText();
			addRightText();
			break;
		default:
			break;
		}

	}

	/**
	 * ģʽ
	 * 
	 * @author WuMeng
	 * 
	 */
	public enum Mode {
		/** ���ؼ� + ������ */
		LEFTIMAGE_TITLE,
		/** ���ؼ� + ������ + �ұ�ͼƬ */
		LEFTIMAGE_TITLE_RIGHTIMAGE,
		/** ���ؼ� + ������ + �ұ����� */
		LEFTIMAGE_TITLE_RIGHTTEXT,
		/** ������� + ������ + �ұ����� */
		LEFTTEXT_TITLE_RIGHTTEXT;
	}

	/**
	 * �����ֻ��ķֱ��ʴ� DP �ĵ�λ ת��Ϊ PX(����)
	 */
	private int dip2px(float dpValue) {
		final float scale = getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

}
