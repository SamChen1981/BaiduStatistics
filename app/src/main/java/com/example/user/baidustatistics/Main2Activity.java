package com.example.user.baidustatistics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.baidu.mobstat.StatService;

public class Main2Activity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_main2;
    }

    @Override
    protected void initView() {
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatService.onEvent(Main2Activity.this, "1002", "还款", 1);
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
            }
        });
    }
}
