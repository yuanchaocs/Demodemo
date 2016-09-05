package com.feicuiedu.newsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 这是当前应用入口页面
 */
public class MainActivity extends AppCompatActivity{

    @BindString(R.string.app_name) String appName;

    private Unbinder unbinder;


    @BindView(R.id.button) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @OnClick(R.id.button)
    public void clickButton() {
        Toast.makeText(MainActivity.this, "button", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.textview)
    public void clickTextView() {
        Toast.makeText(MainActivity.this, appName, Toast.LENGTH_SHORT).show();
    }
}