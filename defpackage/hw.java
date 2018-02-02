package defpackage;

public class hw {
    static String aj = null;
    static final int ao = 100;

    hw() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "hw.<init>(" + ')');
        }
    }

    public static void ac(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i2 + i) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            i3 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    int i5 = i3 + 1;
                    sArr[i3] = s2;
                    i3 = i5;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ee.aj(strArr, sArr, i, i3 - 1, (byte) 24);
            ee.aj(strArr, sArr, i3 + 1, i2, (byte) -69);
        }
    }

    public static void an(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i2 + i) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            i3 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    int i5 = i3 + 1;
                    sArr[i3] = s2;
                    i3 = i5;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ee.aj(strArr, sArr, i, i3 - 1, (byte) -39);
            ee.aj(strArr, sArr, i3 + 1, i2, (byte) 8);
        }
    }

    public static void aq(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i2 + i) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            int i4 = i;
            i3 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    int i5 = i3 + 1;
                    sArr[i3] = s2;
                    i3 = i5;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ee.aj(strArr, sArr, i, i3 - 1, (byte) -48);
            ee.aj(strArr, sArr, i3 + 1, i2, (byte) 21);
        }
    }

    public static void aj(ju juVar, int i) {
        try {
            al.aj = juVar;
        } catch (Throwable e) {
            throw ei.ac(e, "hw.aj(" + ')');
        }
    }
}
