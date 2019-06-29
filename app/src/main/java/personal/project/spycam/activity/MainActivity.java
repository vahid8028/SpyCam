package personal.project.spycam.activity;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import personal.project.spycam.R;
import personal.project.spycam.security.PermissionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRecButton(View view) {
        if (!PermissionManager.hasPermission(Manifest.permission.CAMERA)) {
            PermissionManager.requestPermission(this, Manifest.permission.CAMERA);
        } else {

        }

    }
}
