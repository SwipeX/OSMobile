package defpackage;

public class kl {
    int[] aj;

    public kl(int[] iArr) {
        int i;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= iArr.length + (iArr.length >> 1)) {
            i3 <<= 1;
        }
        this.aj = new int[(i3 + i3)];
        for (i = 0; i < i3 + i3; i++) {
            this.aj[i] = -1;
        }
        while (i2 < iArr.length) {
            i = iArr[i2] & (i3 - 1);
            while (this.aj[(i + i) + 1] != -1) {
                i = (i + 1) & (i3 - 1);
            }
            this.aj[i + i] = iArr[i2];
            this.aj[(i + i) + 1] = i2;
            i2++;
        }
    }

    public int ac(int i) {
        int length = (this.aj.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.aj[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.aj[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int aj(int i) {
        int length = (this.aj.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.aj[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.aj[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int an(int i) {
        int length = (this.aj.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.aj[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.aj[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }
}
