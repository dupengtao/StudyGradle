package com.example.dpt.gradle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getResources().getString(R.string.hello_world));
        sBuilder.append("\n");
        sBuilder.append(getPackageName());
        sBuilder.append("\n");
        sBuilder.append("BuildConfig.AUTO_UPLOAD : "+BuildConfig.AUTO_UPLOAD);
        sBuilder.append("\n");
        sBuilder.append("BuildConfig.SERVER_URI : "+BuildConfig.SERVER_URI);
        tv.setText(sBuilder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
