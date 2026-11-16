package ivas.gov.bisp.enumeration.Q;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.j;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import ivas.gov.bisp.enumeration.o00000Oo.o0OoOo0;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface r<S> extends Parcelable {
    String a(Context context);

    S d();

    int f(Context context);

    Collection<o0ooOOo<Long, Long>> i();

    void j(long j);

    boolean q();

    View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, j jVar, o0OoOo0<S> o0oooo0);

    Collection<Long> z();
}
