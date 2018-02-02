package defpackage;

public class im {
    public static final boolean[] ac = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static final int aj = 25;
    public static int[] an = new int[99];

    static {
        int i = 0;
        int i2 = 0;
        while (i < 99) {
            int i3 = i + 1;
            i2 += (int) ((Math.pow(2.0d, ((double) i3) / 7.0d) * 300.0d) + ((double) i3));
            an[i] = i2 / 4;
            i++;
        }
    }

    im() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "im.<init>(" + ')');
        }
    }
}
