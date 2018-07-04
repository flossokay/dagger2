// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainActivity_MembersInjector.java

package m3c.mobi.daggerDecompiled;

import javax.inject.Provider;

import dagger.MembersInjector;
import m3c.mobi.daggerDecompiled.dagger.ActivityUtil;

// Referenced classes of package m3c.mobi.dagger_example:
//            MainActivity

public final class MainActivity_MembersInjector
    implements MembersInjector
{

    public MainActivity_MembersInjector(Provider modelProvider, Provider activityUtilProvider)
    {
        this.modelProvider = modelProvider;
        this.activityUtilProvider = activityUtilProvider;
    }

    public static MembersInjector create(Provider modelProvider, Provider activityUtilProvider)
    {
        return new MainActivity_MembersInjector(modelProvider, activityUtilProvider);
    }

    public void injectMembers(MainActivity instance)
    {
        injectModel(instance, (String)modelProvider.get());
        injectActivityUtil(instance, (ActivityUtil)activityUtilProvider.get());
    }

    public static void injectModel(MainActivity instance, String model)
    {
        instance.model = model;
    }

    public static void injectActivityUtil(MainActivity instance, ActivityUtil activityUtil)
    {
        instance.activityUtil = activityUtil;
    }

    public void injectMembers(Object obj)
    {
        injectMembers((MainActivity)obj);
    }

    private final Provider modelProvider;
    private final Provider activityUtilProvider;
}
