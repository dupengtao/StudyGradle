package com.example.dpt.gradle.detail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.dpt.gradle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dupengtao on 15/9/10.
 */
public class DetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ListView lv = (ListView) findViewById(R.id.lv);
        List<String> data = new ArrayList<String>(100);
        for (int i =1 ;i<101;i++){
            data.add("功能 "+i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.item,R.id.tv,data);
        lv.setAdapter(arrayAdapter);

    }
}
