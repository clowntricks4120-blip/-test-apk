package o;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public int a;
    public int d;
    public int e;

    public static void b(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int c(int i) {
        b bVar = b.e;
        return ((bVar.d[0][(i >>> 24) & 255] + bVar.d[1][(i >>> 16) & 255]) ^ bVar.d[2][(i >>> 8) & 255]) + bVar.d[3][i & 255];
    }
}
