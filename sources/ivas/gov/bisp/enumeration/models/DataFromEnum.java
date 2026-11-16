package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class DataFromEnum {
    private static int a = 1;
    private static int b;

    @o0OO00O("batch_info")
    private BatchInfo batchInfo;

    public BatchInfo getBatchInfo() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = (i2 ^ 101) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        BatchInfo batchInfo = this.batchInfo;
        int i8 = (i6 & (-44)) | ((~i6) & 43);
        int i9 = -(-((i6 & 43) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return batchInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBatchInfo(BatchInfo batchInfo) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 27;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.batchInfo = batchInfo;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = (((i2 | 78) << 1) - (i2 ^ 78)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
