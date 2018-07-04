// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SimpleApp.java

package m3c.mobi.daggerDecompiled;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

// Referenced classes of package m3c.mobi.dagger_example:
//            DaggerSimpleApp_Component

public class SimpleApp extends DaggerApplication
{
    static interface Component
        extends AndroidInjector
    {
    }


    public SimpleApp()
    {
    }

    public void onCreate()
    {
        super.onCreate();
    }

    protected AndroidInjector applicationInjector()
    {
        return DaggerSimpleApp_Component.builder().create(this);
    }


}
