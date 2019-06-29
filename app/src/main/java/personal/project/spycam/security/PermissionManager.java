package personal.project.spycam.security;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import personal.project.spycam.SpyCamApplication;

public class PermissionManager {

    private final static int REQUEST_PERMISSION_CAMERA = 1;

    public static boolean hasPermission(String permission) {
        return ContextCompat.checkSelfPermission(SpyCamApplication.getContext(), permission) == PackageManager.PERMISSION_GRANTED;
    }

    public static void requestPermission(Activity activity, String permission) {
        if (hasPermission(permission)) {
            //Permission has already been granted.
            return;
        }

        ActivityCompat.requestPermissions(activity, new String[]{permission}, REQUEST_PERMISSION_CAMERA);
    }
}
