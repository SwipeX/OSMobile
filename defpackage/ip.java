package defpackage;

import java.lang.reflect.Array;

public class ip {
    static float[][] aa = ((float[][]) Array.newInstance(Float.TYPE, new int[]{2, 8}));
    static final int ac = 4;
    static final float ah = 100.0f;
    static final float ai = 8.0f;
    static int[][] ak = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 8}));
    static float ap = 0.0f;
    static int at = 0;
    static final float aw = 32.703197f;
    int[] aj = new int[2];
    int[][][] an = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));
    int[] ao = new int[2];
    int[][][] aq = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));

    ip() {
    }

    float aa(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aq[i][0][i2]) + (((float) (this.aq[i][1][i2] - this.aq[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float aj(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aq[i][0][i2]) + (((float) (this.aq[i][1][i2] - this.aq[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float ak(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aq[i][0][i2]) + (((float) (this.aq[i][1][i2] - this.aq[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float ap(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aq[i][0][i2]) + (((float) (this.aq[i][1][i2] - this.aq[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float at(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.aq[i][0][i2]) + (((float) (this.aq[i][1][i2] - this.aq[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    static float ac(float f) {
        return ((aw * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    static float ah(float f) {
        return ((aw * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    static float ai(float f) {
        return ((aw * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    static float aw(float f) {
        return ((aw * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    float an(int i, int i2, float f) {
        return ip.ac((((float) this.an[i][0][i2]) + (((float) (this.an[i][1][i2] - this.an[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    int am(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            ap = (float) Math.pow(0.1d, (double) (((((float) this.ao[0]) + (((float) (this.ao[1] - this.ao[0])) * f)) * 0.0030517578f) / 20.0f));
            at = (int) (ap * 65536.0f);
        }
        if (this.aj[i] == 0) {
            return 0;
        }
        int i3;
        float aj = aj(i, 0, f);
        aa[i][0] = (-2.0f * aj) * ((float) Math.cos((double) an(i, 0, f)));
        aa[i][1] = aj * aj;
        for (i3 = 1; i3 < this.aj[i]; i3++) {
            float aj2 = aj(i, i3, f);
            float cos = (-2.0f * aj2) * ((float) Math.cos((double) an(i, i3, f)));
            float f2 = aj2 * aj2;
            aa[i][(i3 * 2) + 1] = aa[i][(i3 * 2) - 1] * f2;
            aa[i][i3 * 2] = (aa[i][(i3 * 2) - 1] * cos) + (aa[i][(i3 * 2) - 2] * f2);
            for (int i4 = (i3 * 2) - 1; i4 >= 2; i4--) {
                float[] fArr = aa[i];
                fArr[i4] = fArr[i4] + ((aa[i][i4 - 1] * cos) + (aa[i][i4 - 2] * f2));
            }
            float[] fArr2 = aa[i];
            fArr2[1] = (f2 + (aa[i][0] * cos)) + fArr2[1];
            fArr2 = aa[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.aj[0] * 2; i3++) {
                float[] fArr3 = aa[0];
                fArr3[i3] = fArr3[i3] * ap;
            }
        }
        while (i2 < this.aj[i] * 2) {
            ak[i][i2] = (int) (aa[i][i2] * 65536.0f);
            i2++;
        }
        return this.aj[i] * 2;
    }

    int aq(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            ap = (float) Math.pow(0.1d, (double) (((((float) this.ao[0]) + (((float) (this.ao[1] - this.ao[0])) * f)) * 0.0030517578f) / 20.0f));
            at = (int) (ap * 65536.0f);
        }
        if (this.aj[i] == 0) {
            return 0;
        }
        int i3;
        float aj = aj(i, 0, f);
        aa[i][0] = (-2.0f * aj) * ((float) Math.cos((double) an(i, 0, f)));
        aa[i][1] = aj * aj;
        for (i3 = 1; i3 < this.aj[i]; i3++) {
            float aj2 = aj(i, i3, f);
            float cos = (-2.0f * aj2) * ((float) Math.cos((double) an(i, i3, f)));
            float f2 = aj2 * aj2;
            aa[i][(i3 * 2) + 1] = aa[i][(i3 * 2) - 1] * f2;
            aa[i][i3 * 2] = (aa[i][(i3 * 2) - 1] * cos) + (aa[i][(i3 * 2) - 2] * f2);
            for (int i4 = (i3 * 2) - 1; i4 >= 2; i4--) {
                float[] fArr = aa[i];
                fArr[i4] = fArr[i4] + ((aa[i][i4 - 1] * cos) + (aa[i][i4 - 2] * f2));
            }
            float[] fArr2 = aa[i];
            fArr2[1] = (f2 + (aa[i][0] * cos)) + fArr2[1];
            fArr2 = aa[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.aj[0] * 2; i3++) {
                float[] fArr3 = aa[0];
                fArr3[i3] = fArr3[i3] * ap;
            }
        }
        while (i2 < this.aj[i] * 2) {
            ak[i][i2] = (int) (aa[i][i2] * 65536.0f);
            i2++;
        }
        return this.aj[i] * 2;
    }

    final void ae(he heVar, ig igVar) {
        int au = heVar.au(-310118664);
        this.aj[0] = au >> 4;
        this.aj[1] = au & 15;
        if (au != 0) {
            int i;
            this.ao[0] = heVar.ay((byte) 1);
            this.ao[1] = heVar.ay((byte) 1);
            int au2 = heVar.au(-310118664);
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    this.an[i][0][au] = heVar.ay((byte) 1);
                    this.aq[i][0][au] = heVar.ay((byte) 1);
                }
            }
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    if ((((1 << (i * 4)) << au) & au2) != 0) {
                        this.an[i][1][au] = heVar.ay((byte) 1);
                        this.aq[i][1][au] = heVar.ay((byte) 1);
                    } else {
                        this.an[i][1][au] = this.an[i][0][au];
                        this.aq[i][1][au] = this.aq[i][0][au];
                    }
                }
            }
            if (au2 != 0 || this.ao[1] != this.ao[0]) {
                igVar.ac(heVar);
                return;
            }
            return;
        }
        int[] iArr = this.ao;
        this.ao[1] = 0;
        iArr[0] = 0;
    }

    final void al(he heVar, ig igVar) {
        int au = heVar.au(-310118664);
        this.aj[0] = au >> 4;
        this.aj[1] = au & 15;
        if (au != 0) {
            int i;
            this.ao[0] = heVar.ay((byte) 1);
            this.ao[1] = heVar.ay((byte) 1);
            int au2 = heVar.au(-310118664);
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    this.an[i][0][au] = heVar.ay((byte) 1);
                    this.aq[i][0][au] = heVar.ay((byte) 1);
                }
            }
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    if ((((1 << (i * 4)) << au) & au2) != 0) {
                        this.an[i][1][au] = heVar.ay((byte) 1);
                        this.aq[i][1][au] = heVar.ay((byte) 1);
                    } else {
                        this.an[i][1][au] = this.an[i][0][au];
                        this.aq[i][1][au] = this.aq[i][0][au];
                    }
                }
            }
            if (au2 != 0 || this.ao[1] != this.ao[0]) {
                igVar.ac(heVar);
                return;
            }
            return;
        }
        int[] iArr = this.ao;
        this.ao[1] = 0;
        iArr[0] = 0;
    }

    final void ao(he heVar, ig igVar) {
        int au = heVar.au(-310118664);
        this.aj[0] = au >> 4;
        this.aj[1] = au & 15;
        if (au != 0) {
            int i;
            this.ao[0] = heVar.ay((byte) 1);
            this.ao[1] = heVar.ay((byte) 1);
            int au2 = heVar.au(-310118664);
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    this.an[i][0][au] = heVar.ay((byte) 1);
                    this.aq[i][0][au] = heVar.ay((byte) 1);
                }
            }
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    if ((((1 << (i * 4)) << au) & au2) != 0) {
                        this.an[i][1][au] = heVar.ay((byte) 1);
                        this.aq[i][1][au] = heVar.ay((byte) 1);
                    } else {
                        this.an[i][1][au] = this.an[i][0][au];
                        this.aq[i][1][au] = this.aq[i][0][au];
                    }
                }
            }
            if (au2 != 0 || this.ao[1] != this.ao[0]) {
                igVar.ac(heVar);
                return;
            }
            return;
        }
        int[] iArr = this.ao;
        this.ao[1] = 0;
        iArr[0] = 0;
    }

    final void as(he heVar, ig igVar) {
        int au = heVar.au(-310118664);
        this.aj[0] = au >> 4;
        this.aj[1] = au & 15;
        if (au != 0) {
            int i;
            this.ao[0] = heVar.ay((byte) 1);
            this.ao[1] = heVar.ay((byte) 1);
            int au2 = heVar.au(-310118664);
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    this.an[i][0][au] = heVar.ay((byte) 1);
                    this.aq[i][0][au] = heVar.ay((byte) 1);
                }
            }
            for (i = 0; i < 2; i++) {
                for (au = 0; au < this.aj[i]; au++) {
                    if ((((1 << (i * 4)) << au) & au2) != 0) {
                        this.an[i][1][au] = heVar.ay((byte) 1);
                        this.aq[i][1][au] = heVar.ay((byte) 1);
                    } else {
                        this.an[i][1][au] = this.an[i][0][au];
                        this.aq[i][1][au] = this.aq[i][0][au];
                    }
                }
            }
            if (au2 != 0 || this.ao[1] != this.ao[0]) {
                igVar.ac(heVar);
                return;
            }
            return;
        }
        int[] iArr = this.ao;
        this.ao[1] = 0;
        iArr[0] = 0;
    }
}
