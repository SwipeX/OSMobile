package defpackage;

public class is implements Runnable {
    volatile in[] aj;

    is() {
        try {
            this.aj = new in[2];
        } catch (Throwable e) {
            throw ei.ac(e, "is.<init>(" + ')');
        }
    }

    public void cs() {
        int i = 0;
        while (i < 2) {
            try {
                in inVar = this.aj[i];
                if (inVar != null) {
                    inVar.ao(-205449285);
                }
                i++;
            } catch (Throwable e) {
                hq.aj(null, e, (byte) 20);
                return;
            }
        }
    }

    public void run() {
        int i = 0;
        while (i < 2) {
            try {
                in inVar = this.aj[i];
                if (inVar != null) {
                    inVar.ao(-205449285);
                }
                i++;
            } catch (Throwable e) {
                try {
                    hq.aj(null, e, (byte) 82);
                    return;
                } catch (Throwable e2) {
                    throw ei.ac(e2, "is.run(" + ')');
                }
            }
        }
    }
}
