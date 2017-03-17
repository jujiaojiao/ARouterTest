package com.example.aroutertest.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.aroutertest.R;
@Route(path = "/main/test2")
public class Test2 extends AppCompatActivity {
    @Autowired
    public  String name;
    @Autowired
    protected boolean TF;
    @Autowired
    int age;
    @Autowired
    public double score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ARouter.getInstance().inject(this);
        TextView text2 = (TextView) findViewById(R.id.tx2);
        text2.setText(name+"  "+age+"   "+TF+"   "+score+"  ");
    }
}
