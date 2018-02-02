package defpackage;

public class iz {
    public static final int aa = 37;
    public static int ai;
    static jn cb;
    ju ac;
    ju aj;
    jb an;
    jb aq;

    public static String aj(CharSequence[] charSequenceArr, int i, int i2, int i3) {
        if (i2 == 0) {
            try {
                return "";
            } catch (Throwable e) {
                throw ei.ac(e, "iz.aj(" + ')');
            }
        } else if (i2 == 1) {
            r0 = charSequenceArr[i];
            if (r0 == null) {
                return "null";
            }
            return r0.toString();
        } else {
            int i4 = i + i2;
            int i5 = 0;
            for (int i6 = i; i6 < i4; i6++) {
                CharSequence charSequence = charSequenceArr[i6];
                if (charSequence == null) {
                    i5 += 4;
                } else {
                    i5 += charSequence.length();
                }
            }
            StringBuilder stringBuilder = new StringBuilder(i5);
            while (i < i4) {
                r0 = charSequenceArr[i];
                if (r0 == null) {
                    stringBuilder.append("null");
                } else {
                    stringBuilder.append(r0);
                }
                i++;
            }
            return stringBuilder.toString();
        }
    }

    public iz(ju juVar, ju juVar2) {
        try {
            this.an = new jb(bq.ah);
            this.aq = new jb(bq.ah);
            this.aj = juVar;
            this.ac = juVar2;
        } catch (Throwable e) {
            throw ei.ac(e, "iz.<init>(" + ')');
        }
    }

    ij aa(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        ij ijVar = (ij) this.aq.aj(j);
        if (ijVar != null) {
            return ijVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        ii aj = ii.aj(this.aj, i, i2);
        if (aj == null) {
            return null;
        }
        ijVar = aj.ac();
        this.aq.ac(ijVar, j);
        if (iArr == null) {
            return ijVar;
        }
        iArr[0] = iArr[0] - ijVar.an.length;
        return ijVar;
    }

    ij aj(int i, int i2, int[] iArr, byte b) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        try {
            ij ijVar = (ij) this.aq.aj(j);
            if (ijVar != null) {
                return ijVar;
            }
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            ii aj = ii.aj(this.aj, i, i2);
            if (aj == null) {
                return null;
            }
            ijVar = aj.ac();
            this.aq.ac(ijVar, j);
            if (iArr == null) {
                return ijVar;
            }
            iArr[0] = iArr[0] - ijVar.an.length;
            return ijVar;
        } catch (Throwable e) {
            throw ei.ac(e, "iz.aj(" + ')');
        }
    }

    ij ao(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        ij ijVar = (ij) this.aq.aj(j);
        if (ijVar != null) {
            return ijVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        ii aj = ii.aj(this.aj, i, i2);
        if (aj == null) {
            return null;
        }
        ijVar = aj.ac();
        this.aq.ac(ijVar, j);
        if (iArr == null) {
            return ijVar;
        }
        iArr[0] = iArr[0] - ijVar.an.length;
        return ijVar;
    }

    ij ac(int i, int i2, int[] iArr, byte b) {
        long j = 4294967296L ^ ((long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16)));
        try {
            ij ijVar = (ij) this.aq.aj(j);
            if (ijVar != null) {
                return ijVar;
            }
            if (iArr != null) {
                if (iArr[0] <= 0) {
                    return null;
                }
            }
            iv ivVar = (iv) this.an.aj(j);
            if (ivVar == null) {
                ivVar = iv.at(this.ac, i, i2);
                if (ivVar == null) {
                    return null;
                }
                this.an.ac(ivVar, j);
            }
            iv ivVar2 = ivVar;
            ijVar = ivVar2.ah(iArr);
            if (ijVar == null) {
                return null;
            }
            ivVar2.kn();
            this.aq.ac(ijVar, j);
            return ijVar;
        } catch (Throwable e) {
            throw ei.ac(e, "iz.ac(" + ')');
        }
    }

    ij ak(int i, int i2, int[] iArr) {
        long j = 4294967296L ^ ((long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16)));
        ij ijVar = (ij) this.aq.aj(j);
        if (ijVar != null) {
            return ijVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        iv ivVar = (iv) this.an.aj(j);
        if (ivVar == null) {
            ivVar = iv.at(this.ac, i, i2);
            if (ivVar == null) {
                return null;
            }
            this.an.ac(ivVar, j);
        }
        jt ah = ivVar.ah(iArr);
        if (ah == null) {
            return null;
        }
        ivVar.kn();
        this.aq.ac(ah, j);
        return ah;
    }

    ij ap(int i, int i2, int[] iArr) {
        long j = 4294967296L ^ ((long) (((((i << 4) & -1420446787) | (i >>> 12)) ^ i2) | (i << 16)));
        ij ijVar = (ij) this.aq.aj(j);
        if (ijVar != null) {
            return ijVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        iv ivVar = (iv) this.an.aj(j);
        if (ivVar == null) {
            ivVar = iv.at(this.ac, i, i2);
            if (ivVar == null) {
                return null;
            }
            this.an.ac(ivVar, j);
        }
        jt ah = ivVar.ah(iArr);
        if (ah == null) {
            return null;
        }
        ivVar.kn();
        this.aq.ac(ah, j);
        return ah;
    }

    public ij ah(int i, int[] iArr) {
        if (this.aj.al(1899330581) == 1) {
            return aj(0, i, iArr, (byte) 100);
        }
        if (this.aj.as(i, 415667447) == 1) {
            return aj(i, 0, iArr, (byte) 15);
        }
        throw new RuntimeException();
    }

    public ij an(int i, int[] iArr, int i2) {
        try {
            if (this.aj.al(2115447655) == 1) {
                return aj(0, i, iArr, (byte) 50);
            }
            if (this.aj.as(i, 415667447) == 1) {
                return aj(i, 0, iArr, (byte) 111);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ei.ac(e, "iz.an(" + ')');
        }
    }

    public ij at(int i, int[] iArr) {
        if (this.aj.al(2021901683) == 1) {
            return aj(0, i, iArr, (byte) 54);
        }
        if (this.aj.as(i, 415667447) == 1) {
            return aj(i, 0, iArr, (byte) 120);
        }
        throw new RuntimeException();
    }

    public ij ai(int i, int[] iArr) {
        if (this.ac.al(1709386513) == 1) {
            return ac(0, i, iArr, (byte) 0);
        }
        if (this.ac.as(i, 415667447) == 1) {
            return ac(i, 0, iArr, (byte) 0);
        }
        throw new RuntimeException();
    }

    public ij aq(int i, int[] iArr, int i2) {
        try {
            if (this.ac.al(1818838527) == 1) {
                return ac(0, i, iArr, (byte) 0);
            }
            if (this.ac.as(i, 415667447) == 1) {
                return ac(i, 0, iArr, (byte) 0);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ei.ac(e, "iz.aq(" + ')');
        }
    }

    public ij aw(int i, int[] iArr) {
        if (this.ac.al(1894925119) == 1) {
            return ac(0, i, iArr, (byte) 0);
        }
        if (this.ac.as(i, 415667447) == 1) {
            return ac(i, 0, iArr, (byte) 0);
        }
        throw new RuntimeException();
    }
}
