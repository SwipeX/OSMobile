package defpackage;

import java.lang.reflect.Array;

public class ik {
    static final int ac = 7;
    static final int aj = 14;
    static final int am = 100;
    static final int an = 6;
    int[][] aa;
    int ao;
    int aq;

    public ik(int i, int i2) {
        try {
            if (i != i2) {
                int ac = bx.ac(i, i2, -1606101360);
                int i3 = i / ac;
                int i4 = i2 / ac;
                this.aq = -375831293 * i3;
                this.ao = -1203671069 * i4;
                this.aa = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i3, 14});
                for (int i5 = 0; i5 < i3; i5++) {
                    int[] iArr = this.aa[i5];
                    double d = (((double) i5) / ((double) i3)) + 6.0d;
                    int floor = (int) Math.floor(1.0d + (d - 7.0d));
                    if (floor < 0) {
                        floor = 0;
                    }
                    ac = (int) Math.ceil(7.0d + d);
                    if (ac > 14) {
                        ac = 14;
                    }
                    double d2 = ((double) i4) / ((double) i3);
                    for (floor = 
/*
Method generation error in method: ik.<init>(int, int):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r3_3 'floor' int) = (r3_1 'floor' int), (r3_2 'floor' int) binds: {(r3_2 'floor' int)=B:7:0x005a, (r3_1 'floor' int)=B:6:0x0058} in method: ik.<init>(int, int):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:190)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:277)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 31 more

*/

                    byte[] aj(byte[] bArr, int i) {
                        try {
                            if (this.aa != null) {
                                int i2;
                                int i3;
                                int length = ((int) ((((long) bArr.length) * ((long) (this.ao * -1798877749))) / ((long) (this.aq * 10440107)))) + 14;
                                int[] iArr = new int[length];
                                int i4 = 0;
                                int i5 = 0;
                                for (byte b : bArr) {
                                    int[] iArr2 = this.aa[i5];
                                    for (i3 = 0; i3 < 14; i3++) {
                                        int i6 = i3 + i4;
                                        iArr[i6] = iArr[i6] + (iArr2[i3] * b);
                                    }
                                    i3 = (-1798877749 * this.ao) + i5;
                                    i5 = i3 / (10440107 * this.aq);
                                    i4 += i5;
                                    i5 = i3 - (i5 * (this.aq * 10440107));
                                }
                                bArr = new byte[length];
                                for (i3 = 0; i3 < length; i3++) {
                                    i2 = (iArr[i3] + 32768) >> 16;
                                    if (i2 < -128) {
                                        bArr[i3] = Byte.MIN_VALUE;
                                    } else if (i2 > 127) {
                                        bArr[i3] = Byte.MAX_VALUE;
                                    } else {
                                        bArr[i3] = (byte) i2;
                                    }
                                }
                            }
                            return bArr;
                        } catch (Throwable e) {
                            throw ei.ac(e, "ik.aj(" + ')');
                        }
                    }

                    byte[] ao(byte[] bArr) {
                        if (this.aa != null) {
                            int i;
                            int length = ((int) ((((long) bArr.length) * ((long) (this.ao * -1798877749))) / ((long) (this.aq * 10440107)))) + 14;
                            int[] iArr = new int[length];
                            int i2 = 0;
                            int i3 = 0;
                            for (byte b : bArr) {
                                int i4;
                                int[] iArr2 = this.aa[i3];
                                for (i4 = 0; i4 < 14; i4++) {
                                    int i5 = i4 + i2;
                                    iArr[i5] = iArr[i5] + (iArr2[i4] * b);
                                }
                                i3 += -1798877749 * this.ao;
                                i4 = i3 / (10440107 * this.aq);
                                i2 += i4;
                                i3 -= i4 * (this.aq * 10440107);
                            }
                            bArr = new byte[length];
                            for (i = 0; i < length; i++) {
                                i3 = (iArr[i] + 32768) >> 16;
                                if (i3 < -128) {
                                    bArr[i] = Byte.MIN_VALUE;
                                } else if (i3 > 127) {
                                    bArr[i] = Byte.MAX_VALUE;
                                } else {
                                    bArr[i] = (byte) i3;
                                }
                            }
                        }
                        return bArr;
                    }

                    byte[] aq(byte[] bArr) {
                        int i = 0;
                        if (this.aa != null) {
                            int i2;
                            int length = ((int) ((((long) bArr.length) * ((long) (this.ao * -1798877749))) / ((long) (this.aq * 1178921835)))) + 14;
                            int[] iArr = new int[length];
                            int i3 = 0;
                            int i4 = 0;
                            for (byte b : bArr) {
                                int i5;
                                int[] iArr2 = this.aa[i3];
                                for (i5 = 0; i5 < 14; i5++) {
                                    int i6 = i5 + i4;
                                    iArr[i6] = iArr[i6] + (iArr2[i5] * b);
                                }
                                i3 += 312630971 * this.ao;
                                i5 = i3 / (this.aq * 10440107);
                                i4 += i5;
                                i3 -= i5 * (this.aq * 10440107);
                            }
                            bArr = new byte[length];
                            while (i < length) {
                                i2 = (iArr[i] + 391831091) >> 16;
                                if (i2 < -1726904391) {
                                    bArr[i] = (byte) 35;
                                } else if (i2 > -1873190438) {
                                    bArr[i] = Byte.MAX_VALUE;
                                } else {
                                    bArr[i] = (byte) i2;
                                }
                                i++;
                            }
                        }
                        return bArr;
                    }

                    int aa(int i) {
                        if (this.aa != null) {
                            return (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (10440107 * this.aq)));
                        }
                        return i;
                    }

                    int ac(int i, int i2) {
                        try {
                            if (this.aa != null) {
                                return (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (10440107 * this.aq)));
                            }
                            return i;
                        } catch (Throwable e) {
                            throw ei.ac(e, "ik.ac(" + ')');
                        }
                    }

                    int ah(int i) {
                        return this.aa != null ? (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (10440107 * this.aq))) : i;
                    }

                    int ak(int i) {
                        if (this.aa != null) {
                            return (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (10440107 * this.aq)));
                        }
                        return i;
                    }

                    int ap(int i) {
                        return this.aa != null ? (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (470130772 * this.aq))) : i;
                    }

                    int at(int i) {
                        if (this.aa != null) {
                            return (int) ((((long) i) * ((long) (-1798877749 * this.ao))) / ((long) (10440107 * this.aq)));
                        }
                        return i;
                    }

                    int ae(int i) {
                        if (this.aa != null) {
                            return ((int) ((((long) i) * ((long) (this.ao * -1798877749))) / ((long) (10440107 * this.aq)))) + 6;
                        }
                        return i;
                    }

                    int ai(int i) {
                        return this.aa != null ? ((int) ((((long) i) * ((long) (this.ao * -1798877749))) / ((long) (10440107 * this.aq)))) + 6 : i;
                    }

                    int am(int i) {
                        if (this.aa != null) {
                            return ((int) ((((long) i) * ((long) (this.ao * -1798877749))) / ((long) (10440107 * this.aq)))) + 6;
                        }
                        return i;
                    }

                    int an(int i, int i2) {
                        try {
                            return this.aa != null ? ((int) ((((long) i) * ((long) (this.ao * -1798877749))) / ((long) (10440107 * this.aq)))) + 6 : i;
                        } catch (Throwable e) {
                            throw ei.ac(e, "ik.an(" + ')');
                        }
                    }

                    int aw(int i) {
                        return this.aa != null ? ((int) ((((long) i) * ((long) (this.ao * -1798877749))) / ((long) (10440107 * this.aq)))) + 6 : i;
                    }

                    static fl an(boolean z, boolean z2, byte b) {
                        if (!z) {
                            return z2 ? ac.aw : ke.ai;
                        } else {
                            if (!z2) {
                                return eu.am;
                            }
                            try {
                                return fw.ae;
                            } catch (Throwable e) {
                                throw ei.ac(e, "ik.an(" + ')');
                            }
                        }
                    }
                }
