// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BuildModule_ProvideModelFactory.java

package m3c.mobi.daggerDecompiled.dagger.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

// Referenced classes of package m3c.mobi.dagger_example.dagger.modules:
//            BuildModule

public final class BuildModule_ProvideModelFactory
    implements Factory
{

    public BuildModule_ProvideModelFactory()
    {
    }

    public String get()
    {
        return provideInstance();
    }

    public static String provideInstance()
    {
        return proxyProvideModel();
    }

    public static BuildModule_ProvideModelFactory create()
    {
        return INSTANCE;
    }

    public static String proxyProvideModel()
    {
        return (String)Preconditions.checkNotNull(BuildModule.provideModel(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private static final BuildModule_ProvideModelFactory INSTANCE = new BuildModule_ProvideModelFactory();

}
