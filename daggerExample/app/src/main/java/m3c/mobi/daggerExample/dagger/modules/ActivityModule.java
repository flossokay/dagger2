package m3c.mobi.daggerExample.dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import m3c.mobi.daggerExample.MainActivity;
import m3c.mobi.daggerExample.dagger.ActivityUtil;
import m3c.mobi.daggerExample.dagger.scopes.ActivityScope;

@Module
public final class ActivityModule {

    @Provides
    @Reusable
    @ActivityScope
    public ActivityUtil providesActivityUtil(MainActivity activity) {
        return new ActivityUtil(activity);
    }



}