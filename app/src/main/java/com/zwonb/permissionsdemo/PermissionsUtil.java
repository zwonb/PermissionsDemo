//package com.zwonb.permissionsdemo;
//
//import android.app.Activity;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.net.Uri;
//import android.support.v7.app.AlertDialog;
//import android.util.Log;
//
//import com.tbruyelle.rxpermissions2.Permission;
//import com.tbruyelle.rxpermissions2.RxPermissions;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import io.reactivex.Observer;
//import io.reactivex.annotations.NonNull;
//import io.reactivex.disposables.Disposable;
//
///**
// * 动态申请权限(基于RxPermissions)
// * Created by zyb on 2017/5/26.
// */
//
//public class PermissionsUtil {
//
//    private static final String TAG = "binbin";
//    private Activity activity;
//    private AlertDialog.Builder dialog;
//    private List<String> name = new ArrayList<>();
//    private AcceptAllPermissions acceptAllPermissions;
//    private boolean dialogIsShow = false;
//    private AlertDialog show;
//    private boolean isStartSetting = false;
//    private String permissionStr;
//    private boolean permissionS = false;
//
//    public PermissionsUtil(Activity activity, AcceptAllPermissions acceptAllPermissions, String... permissions) {
//        this.activity = activity;
//        this.acceptAllPermissions = acceptAllPermissions;
//        checkPermissions(activity, permissions);
//    }
//
//    private void checkPermissions(final Activity activity, final String... permissions) {
//        this.activity = activity;
//        RxPermissions rxPermissions = new RxPermissions(activity);
//        rxPermissions.requestEach(permissions).subscribe(new Observer<Permission>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(@NonNull Permission permission) {
//                if (permission.granted) {
////                    Toast.makeText(MainActivity.this, "通过授权", Toast.LENGTH_SHORT).show();
////                    Log.e(TAG, "onNext: " + permission.name);
////                    if (name.size() > 0 && !name.contains(permission.name)) {
////                        name.add(permission.name);
////                    }
////                    if (name.size() > 0 && name.size() == permissions.length) {
//                    if (permissions.length > 1) {
//
//                    }
//                    acceptAllPermissions.onClick();
////                    }
////                } else if (permission.shouldShowRequestPermissionRationale) {
//////                    Toast.makeText(MainActivity.this, "拒绝授权", Toast.LENGTH_SHORT).show();
////                    if (!dialogIsShow) {
////                        showDialog(activity, permissions);
////                        dialogIsShow = !dialogIsShow;
////                    }
//                } else {
//                    if (!dialogIsShow) {
//                        showDialog(activity, permissions);
//                        dialogIsShow = !dialogIsShow;
//                    }
////                    if (show != null && !show.isShowing() && !isStartSetting) {
////
////                        isStartSetting = true;
////
////                        getAppDetailSettingIntent();
////
////                    }
//                }
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//                Log.e(TAG, "onComplete: " );
//            }
//        });
//    }
//
//    private void showDialog(final Activity activity, final String... permissions) {
//        if (dialog == null) {
//            dialog = new AlertDialog.Builder(activity);
//            dialog.setCancelable(false);
//            dialog.setTitle("请授权相关权限，否则无法正常使用");
//            dialog.setNegativeButton("取消", null);
//            dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
////                    checkPermissions(activity, permissions);
//                    getAppDetailSettingIntent();
//                    dialog.cancel();
//                    dialogIsShow = false;
//                }
//            });
//        }
//        show = dialog.show();
//    }
//
//    //打开程序设置
//    private void getAppDetailSettingIntent() {
//        if (show != null) {
//            show.cancel();
//        }
//        Intent localIntent = new Intent();
////        localIntent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
//        localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
//        localIntent.setData(Uri.fromParts("package", activity.getPackageName(), null));
//        activity.startActivity(localIntent);
//    }
//
//    public interface AcceptAllPermissions {
//        void onClick();
//    }
//}
