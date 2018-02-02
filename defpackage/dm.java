package defpackage;

public class dm {
    static final int aa = 3;
    static final int ab = 4;
    static final int ac = 1;
    static final int aj = 0;
    static final int an = 2;
    static final int ao = 3;
    static final int aq = 4;
    static int[] bd = null;
    public static final int cb = 70;

    dm() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "dm.<init>(" + ')');
        }
    }

    public static int an(CharSequence charSequence, int i, boolean z, int i2) {
        Object obj = null;
        if (i < 2 || i > 36) {
            try {
                throw new IllegalArgumentException("");
            } catch (Throwable e) {
                throw ei.ac(e, "dm.an(" + ')');
            }
        }
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        Object obj2 = null;
        while (i3 < length) {
            int i5;
            int i6;
            char charAt = charSequence.charAt(i3);
            if (i3 == 0) {
                Object obj3;
                if (charAt == '-') {
                    int i7 = 1;
                    Object obj4 = obj;
                    i5 = i4;
                    obj3 = obj4;
                } else if ('+' == charAt && z) {
                    i6 = i4;
                    obj3 = obj;
                    i5 = i6;
                }
                i3++;
                i6 = i5;
                obj = obj3;
                i4 = i6;
            }
            if (charAt >= '0' && charAt <= '9') {
                i5 = charAt - 48;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                i5 = charAt - 55;
            } else if (charAt < 'a' || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i5 = charAt - 87;
            }
            if (i5 >= i) {
                throw new NumberFormatException();
            }
            if (obj2 != null) {
                i5 = -i5;
            }
            i5 += i * i4;
            if (i5 / i != i4) {
                throw new NumberFormatException();
            }
            i4 = 1;
            i3++;
            i6 = i5;
            obj = obj3;
            i4 = i6;
        }
        if (obj != null) {
            return i4;
        }
        throw new NumberFormatException();
    }

    public static final void aj(ir irVar, int i) {
        try {
            hx.at = irVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dm.aj(" + ')');
        }
    }
}
