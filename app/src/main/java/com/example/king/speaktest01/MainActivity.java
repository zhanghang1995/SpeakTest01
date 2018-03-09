package com.example.king.speaktest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.example.king.speaktest01.speak.speakmodel;
import com.example.king.speaktest01.speak.textconvery;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edit_input;
    private Button speak;
    private Button text;
    private HashMap<String,String> speekResult = new HashMap<String, String>();
    private speakmodel speak_model = new speakmodel();
    private textconvery text_convery = new textconvery();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initview();
        initspeech();
    }
    private void initview(){
        setContentView(R.layout.activity_main);
        edit_input = findViewById(R.id.input_text);
        speak = findViewById(R.id.speak_text);
        text = findViewById(R.id.text_speech);
        speak.setOnClickListener(this);
        text.setOnClickListener(this);

    }

    private void initspeech(){
        SpeechUtility.createUtility(this, SpeechConstant.APPID+"=57bc2bb9");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.speak_text:
                //startSpeechDialog();
                speak_model.startSpeech(getApplicationContext());
                break;
            case R.id.text_speech:
                text_convery.speakText(edit_input.getText().toString(),getApplicationContext());
                break;
        }
    }

}
