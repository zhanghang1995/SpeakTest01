package com.example.king.speaktest01.utils;

import android.widget.Toast;
import android.content.Context;

/**
 * 用于用户自定义toast对话形式
 *
 * Created by king on 18/3/8.
 */

public class ToastUtils {
    public static void ShowToast(String data,Context context){
        Toast.makeText(context,data,Toast.LENGTH_SHORT).show();
    }
}
