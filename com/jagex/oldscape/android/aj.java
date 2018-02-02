package com.jagex.oldscape.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import com.jagex.android.AndroidKeyboard;
import defpackage.aq;
import defpackage.dv;
import defpackage.ei;
import defpackage.em;
import defpackage.ez;
import defpackage.fi;
import defpackage.gn;
import defpackage.kh;
import defpackage.lr;
import defpackage.lt;
import defpackage.nb;
import java.io.DataInputStream;
import java.io.IOException;

public class aj extends lr {
    static int[] aj = new int[]{-1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 71, 72, 86, -1, 81, -1, 80, 83, -1, -1, -1, 84, 85, -1, 26, 27, -1, -1, 74, 57, 58, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ez.cz, nb.cj, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, aq.cn, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, 90, 89, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    final AndroidLauncher ac;
    final Rect an;

    aj(AndroidLauncher androidLauncher) {
        try {
            this.an = new Rect();
            this.ac = androidLauncher;
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.<init>(" + ')');
        }
    }

    public String aj(int i) {
        try {
            if (VERSION.SDK_INT >= 21) {
                return this.ac.getNoBackupFilesDir().getAbsolutePath();
            }
            return this.ac.getFilesDir().getAbsolutePath();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.aj(" + ')');
        }
    }

    public String aw() {
        if (VERSION.SDK_INT >= 21) {
            return this.ac.getNoBackupFilesDir().getAbsolutePath();
        }
        return this.ac.getFilesDir().getAbsolutePath();
    }

    public int ac(int i, byte b) {
        if (i < 0) {
            return i;
        }
        try {
            if (i < aj.length) {
                return aj[i];
            }
            return i;
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.ac(" + ')');
        }
    }

    public int ae(int i) {
        if (i < 0 || i >= aj.length) {
            return i;
        }
        return aj[i];
    }

    public int am(int i) {
        if (i < 0 || i >= aj.length) {
            return i;
        }
        return aj[i];
    }

    public int as(int i) {
        if (i < 0 || i >= aj.length) {
            return i;
        }
        return aj[i];
    }

    public float af() {
        if (this.ac == null) {
            return -1.0f;
        }
        this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
    }

    public float al() {
        if (this.ac == null) {
            return -1.0f;
        }
        this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
    }

    public float an(int i) {
        try {
            if (this.ac == null) {
                return -1.0f;
            }
            this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
            return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.an(" + ')');
        }
    }

    public float au() {
        if (this.ac == null) {
            return -1.0f;
        }
        this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
    }

    public float ax() {
        if (this.ac == null) {
            return -1.0f;
        }
        this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
    }

    public float az() {
        if (this.ac == null) {
            return -1.0f;
        }
        this.ac.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ac.getWindow().getDecorView().getHeight());
    }

    public void ag() {
        AndroidKeyboard.Show();
    }

    public void aq(int i) {
        try {
            AndroidKeyboard.Show();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.aq(" + ')');
        }
    }

    public void av() {
        AndroidKeyboard.Show();
    }

    public void ay() {
        AndroidKeyboard.Show();
    }

    public void ab() {
        AndroidKeyboard.Hide();
    }

    public void ad() {
        AndroidKeyboard.Hide();
    }

    public void ao(int i) {
        try {
            AndroidKeyboard.Hide();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.ao(" + ')');
        }
    }

    public void ar() {
        AndroidKeyboard.Hide();
    }

    public void bp() {
        AndroidKeyboard.Hide();
    }

    public em aa(byte[] bArr, byte b) {
        try {
            return at(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -366921500);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.aa(" + ')');
        }
    }

    public em bh(byte[] bArr) {
        return at(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 796238675);
    }

    public em bm(byte[] bArr) {
        return at(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 1600258778);
    }

    public em br(byte[] bArr) {
        return at(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -1547001782);
    }

    public em bt(byte[] bArr) {
        return at(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -1705630336);
    }

    public Object ak(lt ltVar, int i) {
        try {
            switch (-478119969 * ltVar.an) {
                case 0:
                    return ah((byte) -11);
                case 1:
                    return ap(-1599245351);
                default:
                    return null;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.ak(" + ')');
        }
    }

    public Object bb(lt ltVar) {
        switch (-478119969 * ltVar.an) {
            case 0:
                return ah((byte) -54);
            case 1:
                return ap(-1386557991);
            default:
                return null;
        }
    }

    public Object bu(lt ltVar) {
        switch (-478119969 * ltVar.an) {
            case 0:
                return ah((byte) 36);
            case 1:
                return ap(1732268117);
            default:
                return null;
        }
    }

    em ap(int i) {
        try {
            return at(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ac.getResources(), R.drawable.jagex_logo), 377, 377, true), 964643452);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.ap(" + ')');
        }
    }

    em bd() {
        return at(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ac.getResources(), R.drawable.jagex_logo), 377, 377, true), -897299491);
    }

    em bi() {
        return at(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ac.getResources(), 1484446736), 461452391, 461452391, true), -1137720553);
    }

    em bx() {
        return at(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ac.getResources(), R.drawable.jagex_logo), -1691513449, -1691513449, true), -2136772044);
    }

    em by() {
        return at(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ac.getResources(), -1824479420), 1878189010, 1878189010, true), 143563032);
    }

    em at(Bitmap bitmap, int i) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(height * width)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return new em(iArr, width, height);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.at(" + ')');
        }
    }

    em bo(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(height * width)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new em(iArr, width, height);
    }

    em bs(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(height * width)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new em(iArr, width, height);
    }

    kh ah(byte b) {
        kh khVar = null;
        try {
            byte[] bArr = new byte[((int) this.ac.getAssets().openFd("font.font").getLength())];
            byte[] bArr2 = new byte[((int) this.ac.getAssets().openFd("fontmetrics.font").getLength())];
            DataInputStream dataInputStream = new DataInputStream(this.ac.getAssets().open("font.font"));
            DataInputStream dataInputStream2 = new DataInputStream(this.ac.getAssets().open("fontmetrics.font"));
            dataInputStream.readFully(bArr);
            dataInputStream2.readFully(bArr2);
            try {
                dv.ae(bArr, 482683265);
                if (bArr2 != null) {
                    khVar = new kh(bArr2, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                    gn.as((byte) -104);
                }
            } catch (Throwable e) {
                throw ei.ac(e, "com/jagex/oldscape/android/aj.ah(" + ')');
            }
        } catch (IOException e2) {
        }
        return khVar;
    }

    kh bz() {
        try {
            byte[] bArr = new byte[((int) this.ac.getAssets().openFd("font.font").getLength())];
            byte[] bArr2 = new byte[((int) this.ac.getAssets().openFd("fontmetrics.font").getLength())];
            DataInputStream dataInputStream = new DataInputStream(this.ac.getAssets().open("font.font"));
            DataInputStream dataInputStream2 = new DataInputStream(this.ac.getAssets().open("fontmetrics.font"));
            dataInputStream.readFully(bArr);
            dataInputStream2.readFully(bArr2);
            dv.ae(bArr, 1208551973);
            if (bArr2 == null) {
                return null;
            }
            kh khVar = new kh(bArr2, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
            gn.as(Byte.MIN_VALUE);
            return khVar;
        } catch (IOException e) {
            return null;
        }
    }

    public float ai(int i) {
        try {
            Display defaultDisplay = this.ac.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return ((float) point.x) / ((float) point.y);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/android/aj.ai(" + ')');
        }
    }

    public float ba() {
        Display defaultDisplay = this.ac.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / ((float) point.y);
    }

    public float bj() {
        Display defaultDisplay = this.ac.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / ((float) point.y);
    }

    public float bq() {
        Display defaultDisplay = this.ac.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / ((float) point.y);
    }
}
