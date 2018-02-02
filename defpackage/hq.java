package defpackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.net.URL;

public final class hq {
    static int[] ad;
    final int aa;
    int ab;
    final int ac;
    byte ae;
    int af;
    int ag;
    byte[] ah;
    int ai;
    final int aj;
    byte[] ak;
    int al;
    int am;
    final int an;
    final int ao;
    int ap;
    final int aq;
    int[] ar;
    int as;
    int at;
    int au;
    int av;
    int aw;
    int ax;
    int[] ay;
    int az;
    byte[] bb;
    byte[][] bd;
    byte[] bh;
    int[][] bi;
    boolean[] bm;
    int bo;
    boolean[] bp;
    int[] br;
    int[] bs;
    byte[] bt;
    byte[] bu;
    int[][] bx;
    int[][] by;

    public static void aj(String str, Throwable th, byte b) {
        try {
            String str2 = "";
            if (th != null) {
                Throwable th2;
                if (th instanceof li) {
                    li liVar = (li) th;
                    String str3 = liVar.aq + " | ";
                    th2 = liVar.ao;
                    str2 = str3;
                } else {
                    str2 = "";
                    th2 = th;
                }
                Writer stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th2.printStackTrace(printWriter);
                printWriter.close();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
                String readLine = bufferedReader.readLine();
                String str4 = str2;
                while (true) {
                    str2 = bufferedReader.readLine();
                    if (str2 == null) {
                        break;
                    }
                    int indexOf = str2.indexOf(40);
                    int indexOf2 = str2.indexOf(41, indexOf + 1);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str2.substring(indexOf + 1, indexOf2);
                        int indexOf3 = substring.indexOf(".java:");
                        if (indexOf3 >= 0) {
                            str4 = str4 + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                        } else {
                            str2 = str2.substring(0, indexOf);
                        }
                    }
                    str2 = str2.trim();
                    str2 = str2.substring(str2.lastIndexOf(32) + 1);
                    str4 = str4 + str2.substring(str2.lastIndexOf(9) + 1) + ' ';
                }
                str2 = str4 + "| " + readLine;
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (li.aj != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(li.aj, "clienterror.ws?c=" + (1556688723 * bb.an) + "&u=" + ab.ac + "&v1=" + hw.aj + "&v2=" + ls.ac + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "hq.aj(" + ')');
        }
    }

    hq() {
        try {
            this.aj = bg.aw;
            this.ac = 16;
            this.an = 258;
            this.aq = 6;
            this.ao = 50;
            this.aa = 18002;
            this.ap = 0;
            this.ai = 0;
            this.ay = new int[bq.ah];
            this.ar = new int[257];
            this.bp = new boolean[bq.ah];
            this.bm = new boolean[16];
            this.bh = new byte[bq.ah];
            this.bt = new byte[bg.aw];
            this.br = new int[16];
            this.bb = new byte[18002];
            this.bu = new byte[18002];
            this.bd = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{6, 258});
            this.by = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bx = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bi = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bs = new int[6];
        } catch (Throwable e) {
            throw ei.ac(e, "hq.<init>(" + ')');
        }
    }

    static void af(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -(i4 >> 2);
        int i10 = -(i4 & 3);
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14;
            int i15 = i9;
            while (i15 < 0) {
                int i16 = i13 + 1;
                try {
                    i14 = iArr2[i13];
                    if (i14 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i14;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i14 = i16 + 1;
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    int i17 = i14 + 1;
                    i16 = iArr2[i14];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i16 = i17 + 1;
                    i14 = iArr2[i17];
                    if (i14 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i14;
                    } else {
                        i13 = i12 + 1;
                    }
                    i15++;
                    i12 = i13;
                    i13 = i16;
                } catch (Throwable e) {
                    throw ei.ac(e, "hq.af(" + ')');
                }
            }
            i15 = i12;
            i12 = i10;
            while (i12 < 0) {
                i16 = i13 + 1;
                i14 = iArr2[i13];
                if (i14 != 0) {
                    i13 = i15 + 1;
                    iArr[i15] = i14;
                } else {
                    i13 = i15 + 1;
                }
                i12++;
                i15 = i13;
                i13 = i16;
            }
            i12 = i15 + i6;
            i11++;
            i13 += i7;
        }
    }
}
