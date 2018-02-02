package com.jagex.android;

import android.app.NativeActivity;
import android.view.KeyCharacterMap;
import android.view.inputmethod.InputMethodManager;
import defpackage.ei;

public class AndroidKeyboard {
    static KeyCharacterMap ac;
    static NativeActivity aj;
    static int an = 0;

    AndroidKeyboard() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.<init>(" + ')');
        }
    }

    public static void SetupMainActivity(NativeActivity nativeActivity) {
        try {
            aj = nativeActivity;
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.SetupMainActivity(" + ')');
        }
    }

    public static boolean IsVisible() {
        try {
            return ((InputMethodManager) aj.getSystemService("input_method")).isAcceptingText();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.IsVisible(" + ')');
        }
    }

    public static void Show() {
        try {
            ((InputMethodManager) aj.getSystemService("input_method")).showSoftInput(aj.getWindow().getDecorView(), 2);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.Show(" + ')');
        }
    }

    public static void Hide() {
        try {
            ((InputMethodManager) aj.getSystemService("input_method")).hideSoftInputFromWindow(aj.getWindow().getDecorView().getWindowToken(), 0);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.Hide(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2) {
        try {
            return KeyCodeToUnicodeCharacter(i, i2, an * 1381118797);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2, int i3) {
        try {
            if (ac == null || i3 != 1381118797 * an) {
                ac = KeyCharacterMap.load(i3);
                an = 207240581 * i3;
            }
            return ac.get(i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
        }
    }
}
