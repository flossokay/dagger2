// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DaggerSimpleApp_Component.java

package m3c.mobi.daggerDecompiled;

import dagger.android.*;
import dagger.internal.*;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

import m3c.mobi.daggerDecompiled.dagger.ActivityUtil;
import m3c.mobi.daggerDecompiled.dagger.modules.ActivityBindingModule_ContributeYourActivityInjector;
import m3c.mobi.daggerDecompiled.dagger.modules.ActivityModule;
import m3c.mobi.daggerDecompiled.dagger.modules.ActivityModule_ProvidesActivityUtilFactory;
import m3c.mobi.daggerDecompiled.dagger.modules.BuildModule_ProvideModelFactory;

// Referenced classes of package m3c.mobi.dagger_example:
//            MainActivity, SimpleApp, MainActivity_MembersInjector

public final class DaggerSimpleApp_Component
    implements SimpleApp.Component
{
    private final class MainActivitySubcomponentImpl
        implements ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent
    {

        private void initialize(MainActivitySubcomponentBuilder builder)
        {
            seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
            providesActivityUtilProvider = SingleCheck.provider(ActivityModule_ProvidesActivityUtilFactory.create(activityModule, seedInstanceProvider));
        }

        public void inject(MainActivity arg0)
        {
            injectMainActivity(arg0);
        }

        private MainActivity injectMainActivity(MainActivity instance)
        {
            MainActivity_MembersInjector.injectModel(instance, BuildModule_ProvideModelFactory.proxyProvideModel());
            MainActivity_MembersInjector.injectActivityUtil(instance, (ActivityUtil)providesActivityUtilProvider.get());
            return instance;
        }

        public void inject(Object obj)
        {
            inject((MainActivity)obj);
        }

        private Provider seedInstanceProvider;
        private Provider providesActivityUtilProvider;
        final DaggerSimpleApp_Component this$0;

        private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder)
        {
            this$0 = DaggerSimpleApp_Component.this;
            initialize(builder);
        }

    }

    private final class MainActivitySubcomponentBuilder extends
           ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent.Builder
    {

        public ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent build()
        {
            if(seedInstance == null)
                throw new IllegalStateException((new StringBuilder()).append(MainActivity.class.getCanonicalName()).append(" must be set").toString());
            else
                return new MainActivitySubcomponentImpl(this);
        }

        public void seedInstance(MainActivity arg0)
        {
            seedInstance = (MainActivity)Preconditions.checkNotNull(arg0);
        }



        public void seedInstance(Object obj)
        {
            seedInstance((MainActivity)obj);
        }

        private MainActivity seedInstance;
        final DaggerSimpleApp_Component this$0;


        private MainActivitySubcomponentBuilder()
        {
            this$0 = DaggerSimpleApp_Component.this;
        }

    }

    private static final class Builder extends SimpleApp.Component.Builder
    {

        public SimpleApp.Component build()
        {
            if(activityModule == null)
                activityModule = new ActivityModule();
            if(seedInstance == null)
                throw new IllegalStateException((new StringBuilder()).append(SimpleApp.class.getCanonicalName()).append(" must be set").toString());
            else
                return new DaggerSimpleApp_Component(this);
        }

        public void seedInstance(SimpleApp arg0)
        {
            seedInstance = (SimpleApp)Preconditions.checkNotNull(arg0);
        }



        public void seedInstance(Object obj)
        {
            seedInstance((SimpleApp)obj);
        }

        private ActivityModule activityModule;
        private SimpleApp seedInstance;


        private Builder()
        {
        }

    }


    private DaggerSimpleApp_Component(Builder builder)
    {
        initialize(builder);
    }

    public static SimpleApp.Component.Builder builder()
    {
        return new Builder();
    }

    private Map getMapOfClassOfAndProviderOfFactoryOf()
    {
        return Collections.singletonMap(MainActivity.class, mainActivitySubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector getDispatchingAndroidInjectorOfActivity()
    {
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(getMapOfClassOfAndProviderOfFactoryOf());
    }


    private void initialize(Builder builder)
    {
        mainActivitySubcomponentBuilderProvider = new Provider() {

            public ActivityBindingModule_ContributeYourActivityInjector.MainActivitySubcomponent.Builder get()
            {
                return new MainActivitySubcomponentBuilder();
            }


            final DaggerSimpleApp_Component this$0;

            
            {
                this.this$0 = DaggerSimpleApp_Component.this;
            }
        }
;
        activityModule = builder.activityModule;
    }

    public void inject(SimpleApp arg0)
    {
        injectSimpleApp(arg0);
    }

    private SimpleApp injectSimpleApp(SimpleApp instance)
    {
        DaggerApplication_MembersInjector.injectActivityInjector(instance, getDispatchingAndroidInjectorOfActivity());
        DaggerApplication_MembersInjector.injectSetInjected(instance);
        return instance;
    }

    public void inject(Object obj)
    {
        inject((SimpleApp)obj);
    }


    private ActivityModule activityModule;
    private Provider mainActivitySubcomponentBuilderProvider;


}
