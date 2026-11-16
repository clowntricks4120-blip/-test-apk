package ivas.gov.bisp.enumeration.de;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 1;
    private static int b;
    public static final KeyGenParameterSpec c;

    static {
        KeyGenParameterSpec.Builder encryptionPaddings;
        int i;
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3);
        int i2 = b + 53;
        a = i2 % 128;
        int i3 = i2 % 2;
        KeyGenParameterSpec.Builder blockModes = builder.setBlockModes("GCM");
        String[] strArr = new String[1];
        int i4 = b;
        int i5 = i4 & 1;
        int i6 = -(-((i4 ^ 1) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            strArr[1] = "NoPadding";
            encryptionPaddings = blockModes.setEncryptionPaddings(strArr);
            i = 1593;
        } else {
            strArr[0] = "NoPadding";
            encryptionPaddings = blockModes.setEncryptionPaddings(strArr);
            i = 256;
        }
        KeyGenParameterSpec.Builder keySize = encryptionPaddings.setKeySize(i);
        int i8 = b;
        int i9 = i8 & 89;
        int i10 = (i8 ^ 89) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        c = keySize.build();
        int i13 = b;
        int i14 = i13 & 49;
        int i15 = (i13 | 49) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (java.util.Arrays.equals(r2, r4) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r9.getPurposes() != 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r2 = ivas.gov.bisp.enumeration.de.c.a;
        r4 = r2 & 63;
        r2 = (r2 ^ 63) | r4;
        r5 = ((r4 | r2) << 1) - (r2 ^ r4);
        ivas.gov.bisp.enumeration.de.c.b = r5 % 128;
        r5 = r5 % 2;
        r2 = r9.getEncryptionPaddings();
        r4 = new java.lang.String[]{"NoPadding"};
        r3 = ivas.gov.bisp.enumeration.de.c.b + 91;
        ivas.gov.bisp.enumeration.de.c.a = r3 % 128;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if ((r3 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (java.util.Arrays.equals(r2, r4) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r9.isUserAuthenticationRequired() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        r2 = ivas.gov.bisp.enumeration.de.c.a;
        r3 = (r2 & 1) + (r2 | 1);
        ivas.gov.bisp.enumeration.de.c.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if ((r3 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r9.getUserAuthenticationValidityDurationSeconds() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        throw new java.lang.IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        r9.getUserAuthenticationValidityDurationSeconds();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        r2 = r9.getKeystoreAlias();
        r4 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r6 = ivas.gov.bisp.enumeration.de.c.b;
        r7 = r6 & 87;
        r6 = ((r6 | 87) & (~r7)) + (r7 << 1);
        ivas.gov.bisp.enumeration.de.c.a = r6 % 128;
        r6 = r6 % 2;
        r4.load(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if ((!r4.containsAlias(r2)) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        r2 = ivas.gov.bisp.enumeration.de.c.b;
        r2 = (-2) - ((((r2 | 64) << 1) - (r2 ^ 64)) ^ (-1));
        ivas.gov.bisp.enumeration.de.c.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if ((r2 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        r2 = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
        r2.init(r9);
        r3 = ivas.gov.bisp.enumeration.de.c.b;
        r4 = r3 & 1;
        r3 = -(-((r3 ^ 1) | r4));
        r6 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.de.c.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        if ((r6 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        r2.generateKey();
        r2 = ivas.gov.bisp.enumeration.de.c.b;
        r3 = (r2 & 62) + (r2 | 62);
        r2 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.de.c.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        r2.generateKey();
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore").init(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        r9 = r9.getKeystoreAlias();
        r2 = ivas.gov.bisp.enumeration.de.c.a;
        r3 = r2 & 123;
        r2 = (r2 | 123) & (~r3);
        r3 = r3 << 1;
        r4 = (r2 ^ r3) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.de.c.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013e, code lost:
    
        if ((r4 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0141, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("invalid padding mode, want NoPadding got ");
        r0.append(java.util.Arrays.toString(r9.getEncryptionPaddings()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015f, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0160, code lost:
    
        java.util.Arrays.equals(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0163, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0164, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
        r0.append(r9.getPurposes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017a, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("invalid block mode, want GCM got ");
        r0.append(java.util.Arrays.toString(r9.getBlockModes()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.security.keystore.KeyGenParameterSpec r9) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.de.c.b(android.security.keystore.KeyGenParameterSpec):java.lang.String");
    }
}
