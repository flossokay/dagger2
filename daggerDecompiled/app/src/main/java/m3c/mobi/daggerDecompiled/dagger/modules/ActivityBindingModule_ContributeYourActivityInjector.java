// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityBindingModule_ContributeYourActivityInjector.java

package m3c.mobi.daggerDecompiled.dagger.modules;

import dagger.android.AndroidInjector;

public abstract class ActivityBindingModule_ContributeYourActivityInjector
{
    public static interface MainActivitySubcomponent
        extends AndroidInjector
    {
    }


    private ActivityBindingModule_ContributeYourActivityInjector()
    {
    }

    abstract dagger.android.AndroidInjector.Factory bindAndroidInjectorFactory(MainActivitySubcomponent.Builder builder);
}
