package com.example.user.baidustatistics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.baidu.mobstat.StatService;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatService.setUserId(MainActivity.this,"88888888");
                Map<String, String> attributes = new HashMap<String, String>();
                attributes.put("name", "隐莲花开");
                attributes.put("phone", "18538712527");
                attributes.put("platform", "1");
                attributes.put("time", "2018-04-0314:38");
                attributes.put("type", "事件类型");
                StatService.onEvent(MainActivity.this, "00001", "login", 1, attributes);
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

    }
}
