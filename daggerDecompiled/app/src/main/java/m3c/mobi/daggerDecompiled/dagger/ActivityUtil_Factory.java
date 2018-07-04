// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityUtil_Factory.java

package m3c.mobi.daggerDecompiled.dagger;

import android.app.Activity;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package m3c.mobi.dagger_example.dagger:
//            ActivityUtil

public final class ActivityUtil_Factory
    implements Factory
{

    public ActivityUtil_Factory(Provider activityProvider)
    {
        this.activityProvider = activityProvider;
    }

    public ActivityUtil get()
    {
        return provideInstance(activityProvider);
    }

    public static ActivityUtil provideInstance(Provider activityProvider)
    {
        return new ActivityUtil((Activity)activityProvider.get());
    }

    public static ActivityUtil_Factory create(Provider activityProvider)
    {
        return new ActivityUtil_Factory(activityProvider);
    }

    public static ActivityUtil newActivityUtil(Activity activity)
    {
        return new ActivityUtil(activity);
    }


    private final Provider activityProvider;
}
