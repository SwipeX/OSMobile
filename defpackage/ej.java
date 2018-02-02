package defpackage;

public abstract class ej {
    public int ac;
    public int aj;
    public int an;
    public int aq;

    protected abstract boolean ac(int i, int i2, int i3, eh ehVar);

    protected abstract boolean aj(int i, int i2, int i3, eh ehVar, int i4);

    protected abstract boolean an(int i, int i2, int i3, eh ehVar);

    protected abstract boolean aq(int i, int i2, int i3, eh ehVar);

    protected ej() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ej.<init>(" + ')');
        }
    }

    public static final em aj(byte[] bArr, int i) {
        try {
            return dy.tu(bArr, 1275695705);
        } catch (Throwable e) {
            throw ei.ac(e, "ej.aj(" + ')');
        }
    }

    public static mg aj(int i) {
        try {
            if (mg.aa * -1299499201 == 0) {
                return new mg();
            }
            mg[] mgVarArr = mg.ao;
            int i2 = mg.aa - -755746625;
            mg.aa = i2;
            return mgVarArr[i2 * -1299499201];
        } catch (Throwable e) {
            throw ei.ac(e, "ej.aj(" + ')');
        }
    }

    public static byte[] ac(Object obj, boolean z, int i) {
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
            return ((gy) obj).an((byte) -17);
        } else {
            try {
                throw new IllegalArgumentException();
            } catch (Throwable e) {
                throw ei.ac(e, "ej.ac(" + ')');
            }
        }
    }
}
