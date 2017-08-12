package app.githubdemo.com.logutil;

import android.app.Activity;
import android.util.Log;

/**
 * Created by admin on 12-08-2017.
 */

public class DebugUtil {
    Activity activity;
    DebugUtil(Activity activity)
    {
        this.activity=activity;
    }


    public static void e(String message){
        Log.e("LOG",message);
    }
}
