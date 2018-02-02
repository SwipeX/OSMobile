package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;

public abstract class cr {
    static final int[] ah = bl.al;
    static final int[] ak = bl.az;
    static final int am = 4700;
    static final int[] ap = bl.ax;
    static final int aq = 4;
    static final int[] at = bl.am;
    public static boolean bd = true;
    final int[][] ab;
    final int[] ad;
    final boolean[] ae;
    final int[] af;
    final int[] ag;
    final int[] al;
    final int[][] ar;
    final boolean[] as;
    final int[] au;
    final int[] av;
    final int[] ax;
    final int[] az;
    final int[] bb;
    final int[] bh;
    final int[] bm;
    final int[] bp;
    final int[] br;
    final int[] bt;
    final bl bu;

    public abstract void ac(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b);

    abstract void ae(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void ah(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void ai(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void aj(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b);

    public abstract void ak(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void am(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    abstract void an(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public abstract void ap(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void as(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void at(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void aw(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    cr(bl blVar) {
        try {
            this.ae = new boolean[am];
            this.as = new boolean[am];
            this.al = new int[am];
            this.az = new int[am];
            this.ax = new int[am];
            this.af = new int[am];
            this.au = new int[am];
            this.av = new int[am];
            this.ag = new int[1600];
            this.ar = (int[][]) Array.newInstance(Integer.TYPE, new int[]{1600, cj.at});
            this.ad = new int[12];
            this.ab = (int[][]) Array.newInstance(Integer.TYPE, new int[]{12, 2000});
            this.bp = new int[2000];
            this.bm = new int[2000];
            this.bh = new int[12];
            this.bt = new int[10];
            this.br = new int[10];
            this.bb = new int[10];
            this.bu = blVar;
        } catch (Throwable e) {
            throw ei.ac(e, "cr.<init>(" + ')');
        }
    }

    public static void ae(Collection collection, int i) {
        try {
            collection.add(ab.aw);
            collection.add(ab.am);
            collection.add(ab.ae);
            collection.add(ab.as);
        } catch (Throwable e) {
            throw ei.ac(e, "cr.ae(" + ')');
        }
    }

    static void bb(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i6;
        int i12 = i3;
        int i13 = i;
        while (i11 < 0) {
            int i14 = i9 * (i2 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i5;
            while (i12 < 0) {
                try {
                    int i16;
                    byte b = bArr[(i15 >> 16) + i14];
                    if (b != (byte) 0) {
                        i16 = i13 + 1;
                        iArr[i13] = iArr2[b & 255];
                    } else {
                        i16 = i13 + 1;
                    }
                    i12++;
                    i15 += i7;
                    i13 = i16;
                } catch (Throwable e) {
                    throw ei.ac(e, "cr.bb(" + ')');
                }
            }
            i2 += i8;
            i12 = i13 + i4;
            i11++;
            i13 = i;
        }
    }
}
