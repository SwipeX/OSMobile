package defpackage;

public class cn {
    static final int bx = 37;
    static fl[] cd;

    cn() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "cn.<init>(" + ')');
        }
    }

    public static int aj(int i, int i2, int i3) {
        int i4 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i4 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (1 == i2) {
            return i4 * i;
        }
        return i4;
    }

    public static long aj(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            long j = 0;
            for (int i2 = 0; i2 < length; i2++) {
                j *= 37;
                char charAt = charSequence.charAt(i2);
                if (charAt >= 'A' && charAt <= 'Z') {
                    j += (long) ((charAt + 1) - 65);
                } else if (charAt >= 'a' && charAt <= 'z') {
                    j += (long) ((charAt + 1) - 97);
                } else if (charAt >= '0' && charAt <= '9') {
                    j += (long) ((charAt + 27) - 48);
                }
                if (j >= 177917621779460413L) {
                    break;
                }
            }
            while (j % 37 == 0 && j != 0) {
                j /= 37;
            }
            return j;
        } catch (Throwable e) {
            throw ei.ac(e, "cn.aj(" + ')');
        }
    }
}
