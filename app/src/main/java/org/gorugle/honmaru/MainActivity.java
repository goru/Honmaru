package org.gorugle.honmaru;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String packageName = "com.dmm.games.touken";
        String className = "com.unity3d.player.UnityPlayerActivity";

        Intent intent = new Intent();
        intent.setClassName(packageName,className);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), R.string.app_not_found,Toast.LENGTH_SHORT).show();
        } finally {
            finishAndRemoveTask();
        }
    }
}
