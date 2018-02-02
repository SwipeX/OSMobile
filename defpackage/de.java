package defpackage;

import java.lang.reflect.Array;

public class de {
    public static final int af = 4;
    static int cu;
    int[][] aa;
    int ac;
    int aj;
    int[][] an;
    int[][] ao;
    int[][] aq;

    de(int i, int i2) {
        try {
            this.aj = -2090973953 * i;
            this.ac = 1657468345 * i2;
            this.an = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.aq = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.ao = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.aa = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
        } catch (Throwable e) {
            throw ei.ac(e, "de.<init>(" + ')');
        }
    }

    void aj(int i, int i2, int i3, aw awVar, int i4) {
        if (awVar == null || i + i3 < 0 || i2 + i3 < 0) {
            return;
        }
        if (i - i3 <= this.aj * -2130134273 && i2 - i3 <= this.ac * 498499721) {
            int max = Math.max(0, i - i3);
            int min = Math.min(this.aj * -2130134273, i + i3);
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.ac * 498499721, i2 + i3);
            for (int i5 = max; i5 < min; i5++) {
                max = max2;
                while (max < min2) {
                    int[] iArr = this.an[i5];
                    iArr[max] = iArr[max] + ((awVar.ao * -1419297024) / (-636037291 * awVar.ap));
                    try {
                        iArr = this.aq[i5];
                        iArr[max] = iArr[max] + (awVar.aa * -1613017751);
                        iArr = this.ao[i5];
                        iArr[max] = iArr[max] + (awVar.ak * 788980181);
                        iArr = this.aa[i5];
                        iArr[max] = iArr[max] + 1;
                        max++;
                    } catch (Throwable e) {
                        throw ei.ac(e, "de.aj(" + ')');
                    }
                }
            }
        }
    }

    void an(int i, int i2, int i3, aw awVar) {
        if (awVar != null && i + i3 >= 0 && i2 + i3 >= 0 && i - i3 <= this.aj * -2130134273 && i2 - i3 <= this.ac * 498499721) {
            int max = Math.max(0, i - i3);
            int min = Math.min(this.aj * -2130134273, i + i3);
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.ac * 498499721, i2 + i3);
            for (int i4 = max; i4 < min; i4++) {
                for (max = max2; max < min2; max++) {
                    int[] iArr = this.an[i4];
                    iArr[max] = iArr[max] + ((awVar.ao * -1419297024) / (-636037291 * awVar.ap));
                    iArr = this.aq[i4];
                    iArr[max] = iArr[max] + (awVar.aa * -1613017751);
                    iArr = this.ao[i4];
                    iArr[max] = iArr[max] + (awVar.ak * 788980181);
                    iArr = this.aa[i4];
                    iArr[max] = iArr[max] + 1;
                }
            }
        }
    }

    int aa(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.aj * -2130134273 || i2 >= this.ac * 498499721) {
            return 0;
        }
        if (this.ao[i][i2] == 0) {
            return 0;
        }
        double d;
        double d2 = ((double) (this.an[i][i2] / this.aa[i][i2])) / 256.0d;
        double d3 = ((double) (this.aq[i][i2] / this.aa[i][i2])) / 256.0d;
        double d4 = ((double) (this.ao[i][i2] / this.aa[i][i2])) / 256.0d;
        if (0.0d != d3) {
            double d5;
            if (d4 < 0.5d) {
                d3 = (d3 + 1.0d) * d4;
            } else {
                d3 = (d3 + d4) - (d3 * d4);
            }
            d4 = (d4 * 2.0d) - d3;
            d = 0.3333333333333333d + d2;
            if (d > 1.0d) {
                d -= 1.0d;
            }
            double d6 = d2 - 0.3333333333333333d;
            if (d6 < 0.0d) {
                d5 = d6 + 1.0d;
            } else {
                d5 = d6;
            }
            d6 = 6.0d * d < 1.0d ? (d * (6.0d * (d3 - d4))) + d4 : 2.0d * d < 1.0d ? d3 : 3.0d * d < 2.0d ? (((0.6666666666666666d - d) * (d3 - d4)) * 6.0d) + d4 : d4;
            d = 6.0d * d2 < 1.0d ? (((d3 - d4) * 6.0d) * d2) + d4 : 2.0d * d2 < 1.0d ? d3 : 3.0d * d2 < 2.0d ? (((d3 - d4) * (0.6666666666666666d - d2)) * 6.0d) + d4 : d4;
            if (6.0d * d5 < 1.0d) {
                d3 = (((d3 - d4) * 6.0d) * d5) + d4;
                d4 = d;
                d = d6;
            } else if (2.0d * d5 < 1.0d) {
                d4 = d;
                d = d6;
            } else if (3.0d * d5 < 2.0d) {
                d3 = (((d3 - d4) * (0.6666666666666666d - d5)) * 6.0d) + d4;
                d4 = d;
                d = d6;
            } else {
                d3 = d4;
                d4 = d;
                d = d6;
            }
        } else {
            d3 = d4;
            d = d4;
        }
        return ((int) (d3 * 256.0d)) + ((((int) (d * 256.0d)) << 16) + (((int) (d4 * 256.0d)) << 8));
    }

    int ac(int i, int i2, byte b) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (i < this.aj * -2130134273 && i2 < this.ac * 498499721) {
                    if (this.ao[i][i2] == 0) {
                        return 0;
                    }
                    double d;
                    double d2 = ((double) (this.an[i][i2] / this.aa[i][i2])) / 256.0d;
                    double d3 = ((double) (this.aq[i][i2] / this.aa[i][i2])) / 256.0d;
                    double d4 = ((double) (this.ao[i][i2] / this.aa[i][i2])) / 256.0d;
                    if (0.0d != d3) {
                        double d5;
                        if (d4 < 0.5d) {
                            d = (1.0d + d3) * d4;
                        } else {
                            d = (d3 + d4) - (d3 * d4);
                        }
                        d4 = (d4 * 2.0d) - d;
                        d3 = 0.3333333333333333d + d2;
                        if (d3 > 1.0d) {
                            d3 -= 1.0d;
                        }
                        double d6 = d2 - 0.3333333333333333d;
                        if (d6 < 0.0d) {
                            d5 = d6 + 1.0d;
                        } else {
                            d5 = d6;
                        }
                        d6 = 6.0d * d3 < 1.0d ? (d3 * (6.0d * (d - d4))) + d4 : 2.0d * d3 < 1.0d ? d : 3.0d * d3 < 2.0d ? (((0.6666666666666666d - d3) * (d - d4)) * 6.0d) + d4 : d4;
                        if (6.0d * d2 < 1.0d) {
                            d3 = (((d - d4) * 6.0d) * d2) + d4;
                        } else if (2.0d * d2 < 1.0d) {
                            d3 = d;
                        } else if (3.0d * d2 < 2.0d) {
                            d3 = (((d - d4) * (0.6666666666666666d - d2)) * 6.0d) + d4;
                        } else {
                            d3 = d4;
                        }
                        if (6.0d * d5 < 1.0d) {
                            d4 += ((d - d4) * 6.0d) * d5;
                            d = d3;
                            d3 = d6;
                        } else if (2.0d * d5 < 1.0d) {
                            d4 = d;
                            d = d3;
                            d3 = d6;
                        } else if (3.0d * d5 < 2.0d) {
                            d4 += ((d - d4) * (0.6666666666666666d - d5)) * 6.0d;
                            d = d3;
                            d3 = d6;
                        } else {
                            d = d3;
                            d3 = d6;
                        }
                    } else {
                        d = d4;
                        d3 = d4;
                    }
                    return ((int) (d4 * 256.0d)) + ((((int) (d3 * 256.0d)) << 16) + (((int) (d * 256.0d)) << 8));
                }
            } catch (Throwable e) {
                throw ei.ac(e, "de.ac(" + ')');
            }
        }
        return 0;
    }

    int ak(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.aj * -2130134273 || i2 >= this.ac * 498499721) {
            return 0;
        }
        if (this.ao[i][i2] == 0) {
            return 0;
        }
        double d;
        double d2 = ((double) (this.an[i][i2] / this.aa[i][i2])) / 256.0d;
        double d3 = ((double) (this.aq[i][i2] / this.aa[i][i2])) / 256.0d;
        double d4 = ((double) (this.ao[i][i2] / this.aa[i][i2])) / 256.0d;
        if (0.0d != d3) {
            double d5;
            double d6;
            if (d4 < 0.5d) {
                d3 = (d3 + 1.0d) * d4;
            } else {
                d3 = (d3 + d4) - (d3 * d4);
            }
            d4 = (d4 * 2.0d) - d3;
            d = 0.3333333333333333d + d2;
            if (d > 1.0d) {
                d5 = d - 1.0d;
            } else {
                d5 = d;
            }
            d = d2 - 0.3333333333333333d;
            if (d < 0.0d) {
                d6 = d + 1.0d;
            } else {
                d6 = d;
            }
            d5 = 6.0d * d5 < 1.0d ? ((6.0d * (d3 - d4)) * d5) + d4 : 2.0d * d5 < 1.0d ? d3 : 3.0d * d5 < 2.0d ? (((0.6666666666666666d - d5) * (d3 - d4)) * 6.0d) + d4 : d4;
            if (6.0d * d2 < 1.0d) {
                d = (((d3 - d4) * 6.0d) * d2) + d4;
            } else if (2.0d * d2 < 1.0d) {
                d = d3;
            } else if (3.0d * d2 < 2.0d) {
                d = (((d3 - d4) * (0.6666666666666666d - d2)) * 6.0d) + d4;
            } else {
                d = d4;
            }
            if (6.0d * d6 < 1.0d) {
                d3 = (((d3 - d4) * 6.0d) * d6) + d4;
                d4 = d;
                d = d5;
            } else if (2.0d * d6 < 1.0d) {
                d4 = d;
                d = d5;
            } else if (3.0d * d6 < 2.0d) {
                d3 = (((d3 - d4) * (0.6666666666666666d - d6)) * 6.0d) + d4;
                d4 = d;
                d = d5;
            } else {
                d3 = d4;
                d4 = d;
                d = d5;
            }
        } else {
            d3 = d4;
            d = d4;
        }
        return ((int) (d3 * 256.0d)) + ((((int) (d * 256.0d)) << 16) + (((int) (d4 * 256.0d)) << 8));
    }

    int ao(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.aj * -2130134273 || i2 >= this.ac * 2036201125) {
            return 0;
        }
        if (this.ao[i][i2] == 0) {
            return 0;
        }
        double d;
        double d2 = ((double) (this.an[i][i2] / this.aa[i][i2])) / 256.0d;
        double d3 = ((double) (this.aq[i][i2] / this.aa[i][i2])) / 256.0d;
        double d4 = ((double) (this.ao[i][i2] / this.aa[i][i2])) / 256.0d;
        if (0.0d != d3) {
            double d5;
            if (d4 < 0.5d) {
                d3 = (d3 + 1.0d) * d4;
            } else {
                d3 = (d3 + d4) - (d3 * d4);
            }
            d = (d4 * 2.0d) - d3;
            d4 = 0.3333333333333333d + d2;
            if (d4 > 1.0d) {
                d4 -= 1.0d;
            }
            double d6 = d2 - 0.3333333333333333d;
            if (d6 < 0.0d) {
                d5 = d6 + 1.0d;
            } else {
                d5 = d6;
            }
            if (6.0d * d4 < 1.0d) {
                d6 = (d4 * (6.0d * (d3 - d))) + d;
            } else if (2.0d * d4 < 1.0d) {
                d6 = d3;
            } else if (3.0d * d4 < 2.0d) {
                d6 = (((0.6666666666666666d - d4) * (d3 - d)) * 6.0d) + d;
            } else {
                d6 = d;
            }
            d4 = 6.0d * d2 < 1.0d ? (((d3 - d) * 6.0d) * d2) + d : 2.0d * d2 < 1.0d ? d3 : 3.0d * d2 < 2.0d ? (((d3 - d) * (0.6666666666666666d - d2)) * 6.0d) + d : d;
            if (6.0d * d5 < 1.0d) {
                d3 = (((d3 - d) * 6.0d) * d5) + d;
                d = d6;
            } else if (2.0d * d5 < 1.0d) {
                d = d6;
            } else if (3.0d * d5 < 2.0d) {
                d3 = (((d3 - d) * (0.6666666666666666d - d5)) * 6.0d) + d;
                d = d6;
            } else {
                d3 = d;
                d = d6;
            }
        } else {
            d3 = d4;
            d = d4;
        }
        return ((int) (d3 * 256.0d)) + ((((int) (d * 256.0d)) << 16) + (((int) (d4 * 256.0d)) << 8));
    }

    int aq(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.aj * -2130134273 || i2 >= this.ac * 498499721) {
            return 0;
        }
        if (this.ao[i][i2] == 0) {
            return 0;
        }
        double d;
        double d2 = ((double) (this.an[i][i2] / this.aa[i][i2])) / 256.0d;
        double d3 = ((double) (this.aq[i][i2] / this.aa[i][i2])) / 256.0d;
        double d4 = ((double) (this.ao[i][i2] / this.aa[i][i2])) / 256.0d;
        if (0.0d != d3) {
            double d5;
            double d6;
            if (d4 < 0.5d) {
                d3 = (d3 + 1.0d) * d4;
            } else {
                d3 = (d3 + d4) - (d3 * d4);
            }
            d4 = (d4 * 2.0d) - d3;
            d = 0.3333333333333333d + d2;
            if (d > 1.0d) {
                d5 = d - 1.0d;
            } else {
                d5 = d;
            }
            d = d2 - 0.3333333333333333d;
            if (d < 0.0d) {
                d6 = d + 1.0d;
            } else {
                d6 = d;
            }
            d5 = 6.0d * d5 < 1.0d ? ((6.0d * (d3 - d4)) * d5) + d4 : 2.0d * d5 < 1.0d ? d3 : 3.0d * d5 < 2.0d ? (((0.6666666666666666d - d5) * (d3 - d4)) * 6.0d) + d4 : d4;
            if (6.0d * d2 < 1.0d) {
                d = (((d3 - d4) * 6.0d) * d2) + d4;
            } else if (2.0d * d2 < 1.0d) {
                d = d3;
            } else if (3.0d * d2 < 2.0d) {
                d = (((d3 - d4) * (0.6666666666666666d - d2)) * 6.0d) + d4;
            } else {
                d = d4;
            }
            if (6.0d * d6 < 1.0d) {
                d3 = (((d3 - d4) * 6.0d) * d6) + d4;
                d4 = d;
                d = d5;
            } else if (2.0d * d6 < 1.0d) {
                d4 = d;
                d = d5;
            } else if (3.0d * d6 < 2.0d) {
                d3 = (((d3 - d4) * (0.6666666666666666d - d6)) * 6.0d) + d4;
                d4 = d;
                d = d5;
            } else {
                d3 = d4;
                d4 = d;
                d = d5;
            }
        } else {
            d3 = d4;
            d = d4;
        }
        return ((int) (d3 * 256.0d)) + ((((int) (d * 256.0d)) << 16) + (((int) (d4 * 256.0d)) << 8));
    }
}
