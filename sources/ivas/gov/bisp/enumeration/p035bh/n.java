package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p050bw.J;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    private static int a = 0;
    private static int b = 1;

    public W c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 92) + ((i2 & 92) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (!(this instanceof W)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a JSON Array: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        int i6 = (((i4 | 98) << 1) - (i4 ^ 98)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        W w = (W) this;
        int i8 = i4 + 109;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return w;
        }
        throw null;
    }

    public Z d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-20)) | ((~i2) & 19)) + ((i2 & 19) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!(this instanceof Z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a JSON Primitive: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        int i5 = i2 + 105;
        a = i5 % 128;
        Z z = (Z) this;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return z;
    }

    public String toString() {
        int i = 2 % 2;
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                cVar.k = false;
                J.D.d(cVar, this);
            } else {
                cVar.k = true;
                J.D.d(cVar, this);
            }
            String string = stringWriter.toString();
            int i5 = b;
            int i6 = (i5 & 79) + (i5 | 79);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = i5 & 97;
            int i8 = -(-((i5 ^ 97) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 77 / 0;
            }
            return string;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
