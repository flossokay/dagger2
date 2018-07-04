package m3c.mobi.daggerExample;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import m3c.mobi.daggerExample.dagger.ActivityUtil;
import m3c.mobi.daggerExample.dagger.scopes.ActivityScope;
import m3c.mobi.daggerExample.dagger.scopes.Model;


public class MainActivity extends DaggerAppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject @Model String model;
    @Inject @ActivityScope ActivityUtil activityUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.greeting);
        String text = getResources().getString(R.string.welcome, model);
        greeting.setText(text);


        Integer[] wharr = activityUtil.getRealMetrics();
        TextView screenMetrics = findViewById(R.id.metrics);
        String text1 = getResources().getString(R.string.display_metrics, wharr[0], wharr[1]);
        screenMetrics.setText(text1);
    }
}
