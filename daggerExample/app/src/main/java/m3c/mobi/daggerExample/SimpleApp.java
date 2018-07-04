package m3c.mobi.daggerExample;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import m3c.mobi.daggerExample.dagger.modules.ActivityBindingModule;
import m3c.mobi.daggerExample.dagger.modules.ActivityModule;
import m3c.mobi.daggerExample.dagger.modules.BuildModule;

public class SimpleApp extends DaggerApplication {
    private static final String TAG = SimpleApp.class.getSimpleName();

    @dagger.Component(
            modules = {
                    AndroidSupportInjectionModule.class,
                    ActivityBindingModule.class,
                    BuildModule.class,
                    ActivityModule.class
            }
    )
            /* @ApplicationScoped and/or @Singleton */
    interface Component extends AndroidInjector<SimpleApp> {
        @dagger.Component.Builder
        abstract class Builder extends AndroidInjector.Builder<SimpleApp> {}
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<SimpleApp> applicationInjector() {
        return DaggerSimpleApp_Component.builder().create(this);
    }
}

