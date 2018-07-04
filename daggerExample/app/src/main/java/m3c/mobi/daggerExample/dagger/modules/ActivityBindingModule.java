package m3c.mobi.daggerExample.dagger.modules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import m3c.mobi.daggerExample.MainActivity;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = { ActivityModule.class })
    abstract MainActivity contributeYourActivityInjector();

}
