// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainActivity.java

package m3c.mobi.daggerDecompiled;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import m3c.mobi.dagger_example.R;
import m3c.mobi.daggerDecompiled.dagger.ActivityUtil;

// Referenced classes of package m3c.mobi.dagger_example:
//            R

public class MainActivity extends DaggerAppCompatActivity
{

    public MainActivity()
    {
    }

    protected void onCreate(Bundle savedInstanceState)
    {
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

    String model;
    ActivityUtil activityUtil;

}
