package com.jagex.oldscape.android;

import android.app.NativeActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.jagex.android.AndroidKeyboard;
import defpackage.cj;
import defpackage.client;
import defpackage.di;
import defpackage.ei;
import defpackage.la;

public class AndroidLauncher extends NativeActivity {
    static client aj;
    aj ac;

    public static void init() {
        try {
            aj.td(1859662989);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.init(" + ')');
        }
    }

    public void onCreate(Bundle bundle) {
        try {
            System.setOut(new aq(this, System.out));
            AndroidKeyboard.SetupMainActivity(this);
            getWindow().setFormat(3);
            super.onCreate(bundle);
            Intent intent = getIntent();
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            String string = getString(R.string.jav_config_url);
            if (intent != null) {
                Uri data = intent.getData();
                String action = intent.getAction();
                if (!(data == null || action == null || !action.equals("android.intent.action.VIEW"))) {
                    string = "http://" + data.toString().split("//")[1];
                }
            }
            aj(string, (byte) 0);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.onCreate(" + ')');
        }
    }

    void aj(String str, byte b) {
        try {
            aj = new client();
            aj.al = true;
            aj.as = 2051459370;
            aj.ah("http://oldschool.runescape.com/slr.ws?order=LPWM", (byte) 81);
            this.ac = new aj(this);
            aj.tg(this.ac, -1758037187);
            aj.uq(new la(str), (byte) -95);
            aj.ak((byte) -61);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.aj(" + ')');
        }
    }

    void an(String str) {
        aj = new client();
        aj.al = true;
        aj.as = 2051459370;
        aj.ah("http://oldschool.runescape.com/slr.ws?order=LPWM", (byte) 51);
        this.ac = new aj(this);
        aj.tg(this.ac, -1758037187);
        aj.uq(new la(str), (byte) -113);
        aj.ak((byte) -17);
    }

    void aq(String str) {
        aj = new client();
        aj.al = true;
        aj.as = 2051459370;
        aj.ah("http://oldschool.runescape.com/slr.ws?order=LPWM", (byte) -35);
        this.ac = new aj(this);
        aj.tg(this.ac, -1758037187);
        aj.uq(new la(str), (byte) -16);
        aj.ak((byte) 16);
    }

    public void onResume() {
        try {
            View decorView = getWindow().getDecorView();
            decorView.setFocusableInTouchMode(true);
            getWindow().addFlags(cj.ak);
            ac(-73307512);
            aj.ul(true, 1634053275);
            decorView.setOnSystemUiVisibilityChangeListener(new ac(this));
            decorView.setOnFocusChangeListener(new an(this));
            super.onResume();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.onResume(" + ')');
        }
    }

    public void onPause() {
        try {
            aj.ul(false, -787551882);
            if (di.jm != null && di.jm.ah(-2029558164)) {
                di.jm.ak(1905375874);
            }
            super.onPause();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.onPause(" + ')');
        }
    }

    void aa() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    void ac(int i) {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5895);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/AndroidLauncher.ac(" + ')');
        }
    }

    void ak() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    void ao() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }
}
