package com.example.sj.act_lifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Life Cylce","OnCreate Invoked");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Life Cycle","Started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Life Cycle","Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Life Cycle","Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Life Cycle","Stopped");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Life Cycle","Restarted");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Life Cycle","Destroyed");
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
