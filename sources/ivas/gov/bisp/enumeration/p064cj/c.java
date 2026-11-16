package ivas.gov.bisp.enumeration.p064cj;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 1;
    private static int b;
    public static final BigInteger c = BigInteger.valueOf(0);
    public static final BigInteger d = BigInteger.valueOf(1);

    static {
        BigInteger.valueOf(2L);
        BigInteger.valueOf(3L);
        new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        int i = b;
        int i2 = i & 57;
        int i3 = (i2 - (~((i ^ 57) | i2))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        BigInteger.valueOf(743L).bitLength();
        int i5 = b + 39;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
