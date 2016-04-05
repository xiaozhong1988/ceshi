package com.zyxroid.xutilslibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author 小钟 E-mail:308711822@qq.com
 * @version V1.0.0
 * @类说明：XToast 显示工具
 */
public class XToast
{

	/**
	 * 显示 Toast提示---------显示在中间
	 * 
	 * @param activity
	 * @param msg
	 */
	public static void showToast(Context activity, String msg)
	{
		Toast localToast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
		localToast.setGravity(17, 0, 0);
		localToast.show();
	}

	/**
	 * 显示 Toast提示---------显示在中间
	 * 
	 * @param activity
	 * @param msg
	 */
	public static void showToast(Context activity, String msg, int time)
	{
		Toast localToast = Toast.makeText(activity, msg, time);
		localToast.setGravity(17, 0, 0);
		localToast.show();
	}

}
