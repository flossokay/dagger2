package m3c.mobi.daggerExample.dagger;

import android.app.Activity;
import android.util.DisplayMetrics;

import javax.inject.Inject;

public class ActivityUtil {

    private final Activity activity;

    @Inject
    public ActivityUtil(Activity activity){
        this.activity = activity;
    }

    /**
     * Gets the real window's height and width in px.
     * <a href="https://developer.android.com/reference/android/view/Display#getRealMetrics(android.util.DisplayMetrics)">doc</a>
     * @return Integer[width, height]
     */
    public Integer[] getRealMetrics(){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(dm);
        return new Integer[]{dm.widthPixels, dm.heightPixels};
    }

}
