package com.jagex.oldscape.android;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import defpackage.ei;

/* compiled from: AndroidLauncher */
class an implements OnFocusChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    an(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void ac(View view, boolean z) {
        if (z) {
            this.this$0.ac(1489219853);
        }
    }

    public void aj(View view, boolean z) {
        if (z) {
            this.this$0.ac(1559754403);
        }
    }

    public void an(View view, boolean z) {
        if (z) {
            this.this$0.ac(2102953046);
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.this$0.ac(547172573);
            } catch (Throwable e) {
                throw ei.ac(e, "com/jagex/oldscape/android/an.onFocusChange(" + ')');
            }
        }
    }
}
