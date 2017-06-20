//package com.zwonb.permissionsdemo;
//
//import android.Manifest;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//
//import com.tbruyelle.rxpermissions2.RxPermissions;
//
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String TAG = "binbin";
//    private RxPermissions permissions;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        permissions = new RxPermissions(this);
//    }
//
//    public void requestPermission(View view) {
////        checkPermissions();
//        new PermissionsUtil(this,
//                new PermissionsUtil.AcceptAllPermissions() {
//                    @Override
//                    public void onClick() {
//                        startActivity(new Intent(MainActivity.this, Main2Activity.class));
//                    }
//                },
//                Manifest.permission.CAMERA,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE);
//    }
//
//}
