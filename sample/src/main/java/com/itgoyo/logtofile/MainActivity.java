package com.itgoyo.logtofile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itgoyo.logtofilelibrary.LogToFileUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogToFileUtils.init(this);

        LogToFileUtils.write("sample text");
    }
}
