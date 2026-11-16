package ivas.gov.bisp.enumeration.aU;

import ivas.gov.bisp.enumeration.aV.i;
import ivas.gov.bisp.enumeration.aV.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.SupportedOptions;

/* JADX INFO: loaded from: classes.dex */
@SupportedOptions({"debug", "verify"})
public class c extends AbstractProcessor {
    private static int a = 1;
    private static int b;
    public final List<String> c = Collections.synchronizedList(new ArrayList());

    public c() {
        int i = p.c;
        if (!new HashMap(i.b(12)).isEmpty()) {
            throw new IllegalArgumentException();
        }
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (((i2 ^ 85) | i3) << 1) - ((i2 | 85) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
    }
}
