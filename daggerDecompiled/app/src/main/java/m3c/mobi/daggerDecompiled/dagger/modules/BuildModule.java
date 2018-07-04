// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BuildModule.java

package m3c.mobi.daggerDecompiled.dagger.modules;

import android.os.Build;

public final class BuildModule
{

    public BuildModule()
    {
    }

    static String provideModel()
    {
        return Build.MODEL;
    }
}
