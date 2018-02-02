package defpackage;

public class nz {
    public static final int ac = 2;
    public static final int aj = 1;
    public static final int an = 4;

    nz() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "nz.<init>(" + ')');
        }
    }
}
