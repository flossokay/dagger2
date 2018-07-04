// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityModule.java

package m3c.mobi.daggerDecompiled.dagger.modules;


import m3c.mobi.daggerDecompiled.MainActivity;
import m3c.mobi.daggerDecompiled.dagger.ActivityUtil;

public final class ActivityModule
{

    public ActivityModule()
    {
    }

    public ActivityUtil providesActivityUtil(MainActivity activity)
    {
        return new ActivityUtil(activity);
    }
}
