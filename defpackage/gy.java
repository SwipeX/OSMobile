package defpackage;

public abstract class gy {
    static boolean aj = false;
    public static final int au = 16;

    abstract byte[] ae();

    abstract void ah(byte[] bArr);

    abstract byte[] ai();

    abstract byte[] am();

    abstract byte[] an(byte b);

    abstract void aq(byte[] bArr, byte b);

    abstract byte[] aw();

    gy() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "gy.<init>(" + ')');
        }
    }

    public static Object aa(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 136 && !aj) {
            try {
                gy hrVar = new hr();
                hrVar.aq(bArr, (byte) -53);
                return hrVar;
            } catch (Throwable th) {
                aj = true;
            }
        }
        if (!z) {
            return bArr;
        }
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }

    public static Object ak(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 136 && !aj) {
            try {
                gy hrVar = new hr();
                hrVar.aq(bArr, (byte) -78);
                return hrVar;
            } catch (Throwable th) {
                aj = true;
            }
        }
        if (!z) {
            return bArr;
        }
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }

    public static Object ao(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > -2009682385 && !aj) {
            try {
                gy hrVar = new hr();
                hrVar.aq(bArr, (byte) -65);
                return hrVar;
            } catch (Throwable th) {
                aj = true;
            }
        }
        if (!z) {
            return bArr;
        }
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }

    public static ih[] aj(byte b) {
        try {
            return new ih[]{ih.ao, ih.ap, ih.aj, ih.an, ih.ac, ih.aq, ih.ak, ih.aa};
        } catch (Throwable e) {
            throw ei.ac(e, "gy.aj(" + ')');
        }
    }

    public static byte[] ap(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (!z) {
                return bArr;
            }
            int length = bArr.length;
            Object obj2 = new byte[length];
            System.arraycopy(bArr, 0, obj2, 0, length);
            return obj2;
        } else if (obj instanceof gy) {
            return ((gy) obj).an((byte) 27);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] at(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (!z) {
                return bArr;
            }
            int length = bArr.length;
            Object obj2 = new byte[length];
            System.arraycopy(bArr, 0, obj2, 0, length);
            return obj2;
        } else if (obj instanceof gy) {
            return ((gy) obj).an((byte) -118);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
