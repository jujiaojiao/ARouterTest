package com.example.aroutertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.init(getApplication());
        ARouter.openLog();
        ARouter.openDebug();

    }
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btn1:
                //无参的页面跳转
                ARouter.getInstance().build("/main/test1").navigation();
            break;
            case R.id.btn2:
                ARouter.getInstance().build("/main/test2")
                        .withBoolean("TF",true)
                        .withString("name","xiaoyu")
                        .withInt("age",18)
                        .withDouble("score",99.99)
                        .navigation();
                break;

        }
    }
}
