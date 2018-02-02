package com.jagex.oldscape.android;

import defpackage.ei;
import java.io.OutputStream;
import java.io.PrintStream;

/* compiled from: AndroidLauncher */
class aq extends PrintStream {
    final /* synthetic */ AndroidLauncher this$0;

    aq(AndroidLauncher androidLauncher, OutputStream outputStream) {
        this.this$0 = androidLauncher;
        super(outputStream);
    }

    public void aj(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void println(String str) {
        try {
            super.println("com.jagex.oldscape: " + str);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aq.println(" + ')');
        }
    }
}
