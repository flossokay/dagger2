// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityUtil.java

package m3c.mobi.daggerDecompiled.dagger;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ActivityUtil
{

    public ActivityUtil(Activity activity)
    {
        this.activity = activity;
    }

    public Integer[] getRealMetrics()
    {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(dm);
        return (new Integer[] {
            Integer.valueOf(dm.widthPixels), Integer.valueOf(dm.heightPixels)
        });
    }

    private final Activity activity;
}
