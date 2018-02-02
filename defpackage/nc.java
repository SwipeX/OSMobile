package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nc {
    public static Comparator ac = new nj();
    public static Comparator an = new nk();
    public static Comparator ao = new ng();
    public static Comparator aq = new no();
    public final List aj;

    static {
        mx mxVar = new mx();
    }

    public nc(he heVar, boolean z) {
        int i = 0;
        byte b = (byte) 1;
        try {
            byte b2;
            int ay = heVar.ay((byte) 1);
            if (heVar.au(-310118664) == 1) {
                b2 = (byte) 1;
            } else {
                b2 = (byte) 0;
            }
            if (b2 == (byte) 0) {
                b = (byte) 0;
            }
            int ay2 = heVar.ay((byte) 1);
            this.aj = new ArrayList(ay2);
            while (i < ay2) {
                this.aj.add(new ml(heVar, b, ay));
                i++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "nc.<init>(" + ')');
        }
    }

    public void ac(Comparator comparator, boolean z) {
        if (z) {
            Collections.sort(this.aj, comparator);
        } else {
            Collections.sort(this.aj, Collections.reverseOrder(comparator));
        }
    }

    public void aj(Comparator comparator, boolean z, byte b) {
        if (z) {
            try {
                Collections.sort(this.aj, comparator);
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "nc.aj(" + ')');
            }
        }
        Collections.sort(this.aj, Collections.reverseOrder(comparator));
    }

    public void an(Comparator comparator, boolean z) {
        if (z) {
            Collections.sort(this.aj, comparator);
        } else {
            Collections.sort(this.aj, Collections.reverseOrder(comparator));
        }
    }
}
