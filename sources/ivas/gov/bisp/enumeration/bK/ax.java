package ivas.gov.bisp.enumeration.bK;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.W.InterfaceC0028m;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class ax {
    public Context b;
    public int c;
    public String d;
    public Spinner e;
    public ArrayList<String> f;
    public ArrayList<uc> g;
    public InterfaceC0028m h;
    public ExecutorService i = Executors.newSingleThreadExecutor();
    public Handler a = new Handler(Looper.getMainLooper());

    public ax(Context context, int i, String str, Spinner spinner, InterfaceC0028m interfaceC0028m) {
        this.g = new ArrayList<>();
        this.f = new ArrayList<>();
        this.b = context;
        this.c = i;
        this.d = str;
        this.e = spinner;
        this.h = interfaceC0028m;
        this.g = new ArrayList<>();
        this.f = new ArrayList<>();
    }
}
