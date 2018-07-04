// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SimpleApp_MembersInjector.java

package m3c.mobi.daggerDecompiled;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

// Referenced classes of package m3c.mobi.dagger_example:
//            SimpleApp

public final class SimpleApp_MembersInjector
    implements MembersInjector
{

    public SimpleApp_MembersInjector(Provider activityInjectorProvider)
    {
        this.activityInjectorProvider = activityInjectorProvider;
    }

    public static MembersInjector create(Provider activityInjectorProvider)
    {
        return new SimpleApp_MembersInjector(activityInjectorProvider);
    }

    public void injectMembers(SimpleApp instance)
    {
        DaggerApplication_MembersInjector.injectActivityInjector(instance, (DispatchingAndroidInjector)activityInjectorProvider.get());
        DaggerApplication_MembersInjector.injectSetInjected(instance);
    }

    public void injectMembers(Object obj)
    {
        injectMembers((SimpleApp)obj);
    }

    private final Provider activityInjectorProvider;
}
