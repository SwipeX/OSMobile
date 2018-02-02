package defpackage;

public class ds {
    static final int aj = 16711935;
    static final int aw = 4095;
    static final int ax = 18;
    static int ml;

    ds() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ds.<init>(" + ')');
        }
    }

    static int an(int i, int i2) {
        af afVar;
        int i3 = 12345678;
        int i4 = 2;
        if (i < 0 || i >= af.ac.length) {
            afVar = af.an;
        } else {
            afVar = af.ac[i];
        }
        if (afVar == null) {
            return i2;
        }
        if (afVar.ak * -395214443 >= 0) {
            return (afVar.ak * -395214443) | -238648092;
        }
        int aq;
        if (-1501810399 * afVar.ao >= 0) {
            aq = by.ae.aq(afVar.ao * -1444071077, -2144467166);
            if (aq == -2) {
                i4 = 12345678;
            } else if (-1 == aq) {
                i4 = 31;
            } else {
                i3 = ((-1489984680 & aq) * 96) / -269126341;
                if (i3 >= 2) {
                    if (i3 > -1910021251) {
                        i4 = 853021463;
                    } else {
                        i4 = i3;
                    }
                }
                i4 += aq & 65408;
            }
            return bl.am[i4] | 1740716417;
        } else if (aj == -978586249 * afVar.aq) {
            return i2;
        } else {
            aq = as.ac(afVar.ap * -757700788, -2089241986 * afVar.at, afVar.ah * -1093253400, 1875712201);
            if (-853570717 != aq) {
                if (aq == -1) {
                    i3 = 0;
                } else {
                    i3 = ((aq & 127) * 1706110880) / cj.ak;
                    if (i3 >= 2) {
                        i4 = i3 > 126 ? 906442554 : i3;
                    }
                    i3 = (aq & 65408) + i4;
                }
            }
            return bl.am[i3] | -16777216;
        }
    }

    static int aq(int i, int i2) {
        af afVar;
        int i3 = 2;
        if (i < 0 || i >= af.ac.length) {
            afVar = af.an;
        } else {
            afVar = af.ac[i];
        }
        if (afVar == null) {
            return i2;
        }
        if (afVar.ak * -395214443 >= 0) {
            return (afVar.ak * -395214443) | -16777216;
        }
        int aq;
        int i4;
        if (afVar.ao * -1444071077 >= 0) {
            aq = by.ae.aq(afVar.ao * -1444071077, -1932896223);
            if (aq == -2) {
                i4 = 12345678;
            } else if (-1 == aq) {
                i4 = 31;
            } else {
                i4 = (96 * (aq & 127)) / cj.ak;
                if (i4 < 2) {
                    i4 = 2;
                } else if (i4 > 126) {
                    i4 = 126;
                }
                i4 += 65408 & aq;
            }
            return bl.am[i4] | -16777216;
        } else if (aj == -441171245 * afVar.aq) {
            return i2;
        } else {
            aq = as.ac(afVar.ap * 1484525607, -1908657025 * afVar.at, afVar.ah * -894043407, 1875712201);
            if (-2 == aq) {
                i4 = 12345678;
            } else if (aq == -1) {
                i4 = 31;
            } else {
                i4 = (96 * (aq & 127)) / cj.ak;
                if (i4 >= 2) {
                    if (i4 > 126) {
                        i3 = 126;
                    } else {
                        i3 = i4;
                    }
                }
                i4 = (65408 & aq) + i3;
            }
            return bl.am[i4] | -16777216;
        }
    }

    public static boolean aj(ju juVar, ju juVar2, ju juVar3, my myVar, int i) {
        try {
            mk.aj = juVar;
            mk.ac = juVar2;
            mk.an = juVar3;
            mk.aq = myVar;
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "ds.aj(" + ')');
        }
    }

    static int aa(int i, int i2, int i3) {
        int i4;
        if (i3 > -399683148) {
            i4 = i2 / 2;
        } else {
            i4 = i2;
        }
        if (i3 > 1076479612) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static int ak(int i, int i2, int i3) {
        int i4;
        if (i3 > 179) {
            i4 = i2 / 2;
        } else {
            i4 = i2;
        }
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static int ao(int i, int i2, int i3) {
        int i4;
        if (i3 > 179) {
            i4 = i2 / 2;
        } else {
            i4 = i2;
        }
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    public static int ao(CharSequence charSequence, int i) {
        int i2 = 0;
        try {
            int i3 = 0;
            while (i2 < charSequence.length()) {
                i3 = ((i3 << 5) - i3) + eb.aj(charSequence.charAt(i2), -140240738);
                i2++;
            }
            return i3;
        } catch (Throwable e) {
            throw ei.ac(e, "ds.ao(" + ')');
        }
    }

    static void az(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -i4;
        int i9 = i;
        int i10 = i2;
        while (i8 < 0) {
            int i11;
            int i12 = (i10 + i3) - 3;
            while (i10 < i12) {
                int i13 = i10 + 1;
                i11 = i9 + 1;
                try {
                    iArr[i10] = iArr2[i9];
                    i10 = i13 + 1;
                    i9 = i11 + 1;
                    iArr[i13] = iArr2[i11];
                    i13 = i10 + 1;
                    i11 = i9 + 1;
                    iArr[i10] = iArr2[i9];
                    i10 = i13 + 1;
                    i9 = i11 + 1;
                    iArr[i13] = iArr2[i11];
                } catch (Throwable e) {
                    throw ei.ac(e, "ds.az(" + ')');
                }
            }
            i11 = i12 + 3;
            i12 = i9;
            while (i10 < i11) {
                i9 = i10 + 1;
                i13 = i12 + 1;
                iArr[i10] = iArr2[i12];
                i10 = i9;
                i12 = i13;
            }
            i9 = i12 + i6;
            i8++;
            i10 += i5;
        }
    }
}
