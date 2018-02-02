package defpackage;

public class lq {
    public static final lq aa = new lq("VERDANA15", "verdana_15pt_regular");
    public static final lq ac = new lq("PLAIN12", "p12_full");
    public static final lq aj = new lq("PLAIN11", "p11_full");
    public static final lq an = new lq("BOLD12", "b12_full");
    public static final lq ao = new lq("VERDANA13", "verdana_13pt_regular");
    public static final lq aq = new lq("VERDANA11", "verdana_11pt_regular");
    static final int bo = 0;
    static ev lb = null;
    static final int mq = 2;
    final String ak;
    String ap;

    public static Object aj(byte[] bArr, boolean z, int i) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 136 && !gy.aj) {
                try {
                    gy hrVar = new hr();
                    hrVar.aq(bArr, (byte) -6);
                    return hrVar;
                } catch (Throwable th) {
                    gy.aj = true;
                }
            }
            if (!z) {
                return bArr;
            }
            int length = bArr.length;
            Object obj = new byte[length];
            System.arraycopy(bArr, 0, obj, 0, length);
            return obj;
        } catch (Throwable e) {
            throw ei.ac(e, "lq.aj(" + ')');
        }
    }

    lq(String str, String str2) {
        try {
            this.ak = str;
            this.ap = str2;
        } catch (Throwable e) {
            throw ei.ac(e, "lq.<init>(" + ')');
        }
    }

    static final int bq(int i, int i2, int i3) {
        int i4 = 126;
        int i5 = ((i & 127) * i2) >> 7;
        if (i5 < 2) {
            i4 = 2;
        } else if (i5 <= 126) {
            i4 = i5;
        }
        return i4 + (65408 & i);
    }
}
