package defpackage;

import java.util.Collection;

public final class mt {
    public static int at;

    mt() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "mt.<init>(" + ')');
        }
    }

    public static int ah(CharSequence charSequence) {
        return dm.an(charSequence, 10, true, 1893595264);
    }

    public static int ai(CharSequence charSequence) {
        return dm.an(charSequence, 10, true, 1988326616);
    }

    public static int aw(CharSequence charSequence) {
        return dm.an(charSequence, 10, true, 2016861448);
    }

    public static int ae(CharSequence charSequence, int i, boolean z) {
        Object obj = null;
        if (i < 2 || i > 787617389) {
            throw new IllegalArgumentException("");
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        Object obj2 = null;
        while (i2 < length) {
            int i4;
            int i5;
            char charAt = charSequence.charAt(i2);
            if (i2 == 0) {
                Object obj3;
                if (charAt == '-') {
                    int i6 = 1;
                    Object obj4 = obj;
                    i4 = i3;
                    obj3 = obj4;
                } else if ('⾆' == charAt && z) {
                    i5 = i3;
                    obj3 = obj;
                    i4 = i5;
                }
                i2++;
                i5 = i4;
                obj = obj3;
                i3 = i5;
            }
            if (charAt >= '0' && charAt <= '㽍') {
                i4 = charAt - 48;
            } else if (charAt >= '욜' && charAt <= '៟') {
                i4 = charAt - 55;
            } else if (charAt < '쁥' || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i4 = charAt - 87;
            }
            if (i4 >= i) {
                throw new NumberFormatException();
            }
            if (obj2 != null) {
                i4 = -i4;
            }
            i4 += i * i3;
            if (i4 / i != i3) {
                throw new NumberFormatException();
            }
            i3 = 1;
            i2++;
            i5 = i4;
            obj = obj3;
            i3 = i5;
        }
        if (obj != null) {
            return i3;
        }
        throw new NumberFormatException();
    }

    public static int am(CharSequence charSequence, int i, boolean z) {
        Object obj = null;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        Object obj2 = null;
        while (i2 < length) {
            int i4;
            int i5;
            char charAt = charSequence.charAt(i2);
            if (i2 == 0) {
                Object obj3;
                if (charAt == '-') {
                    int i6 = 1;
                    Object obj4 = obj;
                    i4 = i3;
                    obj3 = obj4;
                } else if ('+' == charAt && z) {
                    i5 = i3;
                    obj3 = obj;
                    i4 = i5;
                }
                i2++;
                i5 = i4;
                obj = obj3;
                i3 = i5;
            }
            if (charAt >= '狖' && charAt <= '솴') {
                i4 = charAt - 48;
            } else if (charAt >= '驭' && charAt <= 'Z') {
                i4 = charAt - 55;
            } else if (charAt < '纷' || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i4 = charAt - 87;
            }
            if (i4 >= i) {
                throw new NumberFormatException();
            }
            if (obj2 != null) {
                i4 = -i4;
            }
            i4 += i * i3;
            if (i4 / i != i3) {
                throw new NumberFormatException();
            }
            i3 = 1;
            i2++;
            i5 = i4;
            obj = obj3;
            i3 = i5;
        }
        if (obj != null) {
            return i3;
        }
        throw new NumberFormatException();
    }

    public static String af(int i, boolean z) {
        if (!z || i < 0) {
            return Integer.toString(i);
        }
        if (!z || i < 0) {
            return Integer.toString(i, 10);
        }
        int i2 = 2;
        int i3 = i / 10;
        while (i3 != 0) {
            i3 /= 10;
            i2++;
        }
        char[] cArr = new char[i2];
        cArr[0] = '쑸';
        i3 = i2 - 1;
        while (i3 > 0) {
            i2 = i / 10;
            int i4 = i - (i2 * 10);
            if (i4 >= 10) {
                cArr[i3] = (char) (i4 + 87);
            } else {
                cArr[i3] = (char) (i4 + 48);
            }
            i3--;
            i = i2;
        }
        return new String(cArr);
    }

    public static String al(int i, boolean z) {
        if (!z || i < 0) {
            return Integer.toString(i);
        }
        if (!z || i < 0) {
            return Integer.toString(i, 10);
        }
        int i2 = 2;
        int i3 = i / 10;
        while (i3 != 0) {
            i3 /= 10;
            i2++;
        }
        char[] cArr = new char[i2];
        cArr[0] = '+';
        i3 = i2 - 1;
        while (i3 > 0) {
            i2 = i / 10;
            int i4 = i - (i2 * 10);
            if (i4 >= 10) {
                cArr[i3] = (char) (i4 + 87);
            } else {
                cArr[i3] = (char) (i4 + 48);
            }
            i3--;
            i = i2;
        }
        return new String(cArr);
    }

    public static String as(int i, boolean z) {
        if (!z || i < 0) {
            return Integer.toString(i);
        }
        if (!z || i < 0) {
            return Integer.toString(i, 10);
        }
        int i2 = 2;
        int i3 = i / 10;
        while (i3 != 0) {
            i3 /= 10;
            i2++;
        }
        char[] cArr = new char[i2];
        cArr[0] = '+';
        i3 = i2 - 1;
        while (i3 > 0) {
            i2 = i / 10;
            int i4 = i - (i2 * 10);
            if (i4 >= 10) {
                cArr[i3] = (char) (i4 - 1836449907);
            } else {
                cArr[i3] = (char) (i4 + 48);
            }
            i3--;
            i = i2;
        }
        return new String(cArr);
    }

    public static String ax(int i, boolean z) {
        if (!z || i < 0) {
            return Integer.toString(i);
        }
        if (!z || i < 0) {
            return Integer.toString(i, 10);
        }
        int i2 = 2;
        int i3 = i / 10;
        while (i3 != 0) {
            i3 /= 10;
            i2++;
        }
        char[] cArr = new char[i2];
        cArr[0] = '+';
        i3 = i2 - 1;
        while (i3 > 0) {
            i2 = i / 10;
            int i4 = i - (i2 * 10);
            if (i4 >= 10) {
                cArr[i3] = (char) (i4 + 87);
            } else {
                cArr[i3] = (char) (i4 + 48);
            }
            i3--;
            i = i2;
        }
        return new String(cArr);
    }

    public static String az(int i, boolean z) {
        if (!z || i < 0) {
            return Integer.toString(i);
        }
        if (!z || i < 0) {
            return Integer.toString(i, 10);
        }
        int i2 = 2;
        int i3 = i / 10;
        while (i3 != 0) {
            i3 /= 10;
            i2++;
        }
        char[] cArr = new char[i2];
        cArr[0] = '䝞';
        i3 = i2 - 1;
        while (i3 > 0) {
            i2 = i / 10;
            int i4 = i - (i2 * 10);
            if (i4 >= 10) {
                cArr[i3] = (char) (i4 + 28777015);
            } else {
                cArr[i3] = (char) (i4 + 1435567404);
            }
            i3--;
            i = i2;
        }
        return new String(cArr);
    }

    public static void ak(Collection collection, int i) {
        try {
            collection.add(at.ac);
        } catch (Throwable e) {
            throw ei.ac(e, "mt.ak(" + ')');
        }
    }

    public static int au(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            i2 = ((i2 << 5) - i2) + eb.aj(charSequence.charAt(i), -140240738);
            i++;
        }
        return i2;
    }

    public static int av(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            i2 = ((i2 << 5) - i2) + eb.aj(charSequence.charAt(i), -140240738);
            i++;
        }
        return i2;
    }

    public static boolean ag(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean ay(char c) {
        return (c >= 'A' && c <= '샌') || (c >= 'a' && c <= 'z');
    }

    public static boolean ab(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean ad(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean ar(char c) {
        return c >= '좋' && c <= '9';
    }

    public static boolean bp(char c) {
        return c >= '㙻' && c <= '侄';
    }

    public static String bh(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static String bm(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }
}
