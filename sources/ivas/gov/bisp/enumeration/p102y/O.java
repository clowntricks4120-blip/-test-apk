package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class O extends h {
    @Override // ivas.gov.bisp.enumeration.p096p.h
    public <T> T aC(Class<T> cls) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot allocate ");
        sb.append(cls);
        throw new UnsupportedOperationException(sb.toString());
    }
}
