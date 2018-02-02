package defpackage;

import java.util.HashMap;

public class kj {
    ju ac;
    ju aj;
    HashMap an;

    public kj(ju juVar, ju juVar2) {
        try {
            this.aj = juVar;
            this.ac = juVar2;
            this.an = new HashMap();
        } catch (Throwable e) {
            throw ei.ac(e, "kj.<init>(" + ')');
        }
    }

    public HashMap ac(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (lq lqVar : lqVarArr) {
            if (this.an.containsKey(lqVar)) {
                hashMap.put(lqVar, this.an.get(lqVar));
            } else {
                kh at = av.at(this.aj, this.ac, lqVar.ap, "", -1613017751);
                if (at != null) {
                    this.an.put(lqVar, at);
                    hashMap.put(lqVar, at);
                }
            }
        }
        return hashMap;
    }

    public HashMap aj(lq[] lqVarArr, int i) {
        try {
            HashMap hashMap = new HashMap();
            for (lq lqVar : lqVarArr) {
                if (this.an.containsKey(lqVar)) {
                    hashMap.put(lqVar, this.an.get(lqVar));
                } else {
                    kh at = av.at(this.aj, this.ac, lqVar.ap, "", -1613017751);
                    if (at != null) {
                        this.an.put(lqVar, at);
                        hashMap.put(lqVar, at);
                    }
                }
            }
            return hashMap;
        } catch (Throwable e) {
            throw ei.ac(e, "kj.aj(" + ')');
        }
    }

    public HashMap an(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (lq lqVar : lqVarArr) {
            if (this.an.containsKey(lqVar)) {
                hashMap.put(lqVar, this.an.get(lqVar));
            } else {
                kh at = av.at(this.aj, this.ac, lqVar.ap, "", -1613017751);
                if (at != null) {
                    this.an.put(lqVar, at);
                    hashMap.put(lqVar, at);
                }
            }
        }
        return hashMap;
    }

    public HashMap ao(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (lq lqVar : lqVarArr) {
            if (this.an.containsKey(lqVar)) {
                hashMap.put(lqVar, this.an.get(lqVar));
            } else {
                kh at = av.at(this.aj, this.ac, lqVar.ap, "", -1613017751);
                if (at != null) {
                    this.an.put(lqVar, at);
                    hashMap.put(lqVar, at);
                }
            }
        }
        return hashMap;
    }

    public HashMap aq(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (lq lqVar : lqVarArr) {
            if (this.an.containsKey(lqVar)) {
                hashMap.put(lqVar, this.an.get(lqVar));
            } else {
                kh at = av.at(this.aj, this.ac, lqVar.ap, "", -1613017751);
                if (at != null) {
                    this.an.put(lqVar, at);
                    hashMap.put(lqVar, at);
                }
            }
        }
        return hashMap;
    }
}
