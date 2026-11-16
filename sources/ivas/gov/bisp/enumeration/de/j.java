package ivas.gov.bisp.enumeration.de;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import ivas.gov.bisp.enumeration.aC.C0031a;
import ivas.gov.bisp.enumeration.aC.M;
import ivas.gov.bisp.enumeration.aS.InterfaceC0081t;
import ivas.gov.bisp.enumeration.aS.J;
import ivas.gov.bisp.enumeration.aS.R;
import ivas.gov.bisp.enumeration.aS.a;
import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.aT.h;
import ivas.gov.bisp.enumeration.aY.O;
import ivas.gov.bisp.enumeration.aY.Q;
import ivas.gov.bisp.enumeration.aY.T;
import ivas.gov.bisp.enumeration.aZ.S;
import ivas.gov.bisp.enumeration.p053bz.P;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j implements SharedPreferences {
    private static int a = 0;
    private static int b = 1;
    public final SharedPreferences c;
    public final List<SharedPreferences.OnSharedPreferenceChangeListener> d = new ArrayList();
    public final String e;
    public final z f;
    public final InterfaceC0081t g;

    public static final class bJI implements SharedPreferences.Editor {
        private static int a = 0;
        private static int b = 1;
        public final j c;
        public final SharedPreferences.Editor d;
        public AtomicBoolean f = new AtomicBoolean(false);
        public final List<String> e = new CopyOnWriteArrayList();

        public bJI(j jVar, SharedPreferences.Editor editor) {
            this.c = jVar;
            this.d = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            int i = 2 % 2;
            int i2 = a + 79;
            b = i2 % 128;
            this.f.set(i2 % 2 != 0);
            return this;
        }

        public final void d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 58) + ((i2 & 58) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.c.d.iterator();
            int i5 = a;
            int i6 = i5 & 99;
            int i7 = (((i5 | 99) & (~i6)) - (~(i6 << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            while (!(!it.hasNext())) {
                int i9 = b;
                int i10 = (i9 & 3) + (i9 | 3);
                a = i10 % 128;
                int i11 = i10 % 2;
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                int i12 = a;
                int i13 = i12 ^ 123;
                int i14 = ((((i12 & 123) | i13) << 1) - (~(-i13))) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                Iterator<String> it2 = this.e.iterator();
                int i16 = a;
                int i17 = (i16 ^ 70) + ((i16 & 70) << 1);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                while (it2.hasNext()) {
                    int i20 = b;
                    int i21 = ((i20 & (-58)) | ((~i20) & 57)) + ((i20 & 57) << 1);
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        it2.next();
                        throw null;
                    }
                    next.onSharedPreferenceChanged(this.c, it2.next());
                    int i22 = a;
                    int i23 = i22 & 75;
                    int i24 = (i22 | 75) & (~i23);
                    int i25 = i23 << 1;
                    int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
            int i28 = b + 15;
            a = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
        }

        public final void c() {
            Set setKeySet;
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 11;
            int i4 = ((i2 | 11) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            if (this.f.getAndSet(false)) {
                int i6 = b + 99;
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    setKeySet = ((HashMap) this.c.getAll()).keySet();
                    int i7 = 46 / 0;
                } else {
                    setKeySet = ((HashMap) this.c.getAll()).keySet();
                }
                int i8 = a;
                int i9 = ((i8 | 13) << 1) - (i8 ^ 13);
                b = i9 % 128;
                int i10 = i9 % 2;
                Iterator it = setKeySet.iterator();
                int i11 = a;
                int i12 = (i11 & 7) + (i11 | 7);
                b = i12 % 128;
                int i13 = i12 % 2;
                while (!(!it.hasNext())) {
                    int i14 = b;
                    int i15 = ((i14 & 86) + (i14 | 86)) - 1;
                    a = i15 % 128;
                    if (i15 % 2 != 0) {
                        str = (String) it.next();
                        int i16 = 27 / 0;
                    } else {
                        str = (String) it.next();
                    }
                    int i17 = b;
                    int i18 = ((i17 | 49) << 1) - (i17 ^ 49);
                    a = i18 % 128;
                    Object obj = null;
                    if (i18 % 2 != 0) {
                        this.e.contains(str);
                        obj.hashCode();
                        throw null;
                    }
                    if (!this.e.contains(str) && !this.c.f(str)) {
                        int i19 = a;
                        int i20 = ((i19 & 95) - (~(i19 | 95))) - 1;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        SharedPreferences.Editor editor = this.d;
                        String strD = this.c.d(str);
                        int i22 = b;
                        int i23 = i22 & 101;
                        int i24 = (i22 ^ 101) | i23;
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        a = i25 % 128;
                        if (i25 % 2 != 0) {
                            editor.remove(strD);
                            throw null;
                        }
                        editor.remove(strD);
                        int i26 = b;
                        int i27 = (i26 & 69) + (i26 | 69);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
            }
            int i29 = a;
            int i30 = ((i29 | 95) << 1) - (i29 ^ 95);
            b = i30 % 128;
            int i31 = i30 % 2;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = ((i2 | 17) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            c();
            try {
                boolean zCommit = this.d.commit();
                int i6 = a;
                int i7 = i6 & 121;
                int i8 = -(-((i6 ^ 121) | i7));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                d();
                this.e.clear();
                int i11 = a;
                int i12 = i11 + 91;
                b = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 & 53;
                int i15 = (i11 ^ 53) | i14;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 59 / 0;
                }
                return zCommit;
            } catch (Throwable th) {
                d();
                this.e.clear();
                throw th;
            }
        }

        public final void e(String str, byte[] bArr) {
            SharedPreferences.Editor editor;
            String str2;
            Object obj;
            int i = 2 % 2;
            int i2 = b + 47;
            a = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                this.c.f(str);
                obj2.hashCode();
                throw null;
            }
            if (this.c.f(str)) {
                throw new SecurityException(ivas.gov.bisp.enumeration.p091n.j.r(str, " is a reserved key for the encryption keyset."));
            }
            int i3 = b + 13;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.e.add(str);
                int i4 = 93 / 0;
            } else {
                this.e.add(str);
            }
            if (str == null) {
                int i5 = b;
                int i6 = i5 | 55;
                int i7 = i6 << 1;
                int i8 = -(i6 & (~(i5 & 55)));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i5 & 41;
                int i12 = -(-((i5 ^ 41) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                str = "__NULL__";
            }
            try {
                j jVar = this.c;
                String strD = jVar.d(str);
                int i15 = a;
                int i16 = ((i15 | 85) << 1) - (i15 ^ 85);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    z zVar = jVar.f;
                    strD.getBytes(StandardCharsets.UTF_8);
                    obj2.hashCode();
                    throw null;
                }
                Pair pair = new Pair(strD, P.c(jVar.f.b(bArr, strD.getBytes(StandardCharsets.UTF_8))));
                int i17 = a;
                int i18 = ((i17 | 97) << 1) - (i17 ^ 97);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    editor = this.d;
                    str2 = (String) pair.first;
                    obj = pair.second;
                    int i19 = 30 / 0;
                } else {
                    editor = this.d;
                    str2 = (String) pair.first;
                    obj = pair.second;
                }
                editor.putString(str2, (String) obj);
                int i20 = b;
                int i21 = (-2) - (((i20 & 106) + (i20 | 106)) ^ (-1));
                a = i21 % 128;
                int i22 = i21 % 2;
            } catch (GeneralSecurityException e) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Could not encrypt data: ");
                sbW.append(e.getMessage());
                throw new SecurityException(sbW.toString(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer byteBufferAllocate;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 53;
            int i5 = i3 | 53;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                byteBufferAllocate = ByteBuffer.allocate(85);
                i = 3;
            } else {
                byteBufferAllocate = ByteBuffer.allocate(8);
                i = 4;
            }
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.putFloat(f);
            byte[] bArrArray = byteBufferAllocate.array();
            int i7 = b;
            int i8 = i7 & 33;
            int i9 = (((i7 ^ 33) | i8) << 1) - ((i7 | 33) & (~i8));
            a = i9 % 128;
            if (i9 % 2 != 0) {
                e(str, bArrArray);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            e(str, bArrArray);
            int i10 = a;
            int i11 = (((i10 & (-30)) | ((~i10) & 29)) - (~((i10 & 29) << 1))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (this.c.f(str)) {
                throw new SecurityException(ivas.gov.bisp.enumeration.p091n.j.r(str, " is a reserved key for the encryption keyset."));
            }
            int i5 = b;
            int i6 = i5 & 41;
            int i7 = ((((i5 ^ 41) | i6) << 1) - (~(-((i5 | 41) & (~i6))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            this.d.remove(this.c.d(str));
            int i9 = a + 19;
            b = i9 % 128;
            int i10 = i9 % 2;
            this.e.remove(str);
            int i11 = b;
            int i12 = i11 ^ 103;
            int i13 = -(-((i11 & 103) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 48) + ((i2 & 48) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2 != 0 ? 4 : 5;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
            byteBufferAllocate.putInt(i4);
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            e(str, byteBufferAllocate.array());
            int i5 = a;
            int i6 = ((i5 | 95) << 1) - (i5 ^ 95);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 29;
            int i4 = -(-((i2 & 29) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            c();
            this.d.apply();
            d();
            int i7 = b;
            int i8 = i7 & 41;
            int i9 = (i7 ^ 41) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            this.e.clear();
            int i12 = a + 29;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer byteBufferAllocate;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 18) + ((i3 & 18) << 1)) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                byteBufferAllocate = ByteBuffer.allocate(120);
                byteBufferAllocate.putInt(5);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.putInt(2);
            }
            int i5 = b;
            int i6 = i5 ^ 125;
            int i7 = (i5 & 125) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            Object obj = null;
            byteBufferAllocate.putInt(i);
            if (i9 != 0) {
                e(str, byteBufferAllocate.array());
                obj.hashCode();
                throw null;
            }
            e(str, byteBufferAllocate.array());
            int i10 = b;
            int i11 = i10 & 23;
            int i12 = (((i10 ^ 23) | i11) << 1) - ((i10 | 23) & (~i11));
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer byteBufferAllocate;
            int i;
            int i2 = 2 % 2;
            int i3 = a + 65;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                byteBufferAllocate = ByteBuffer.allocate(42);
                i = 5;
            } else {
                byteBufferAllocate = ByteBuffer.allocate(12);
                i = 3;
            }
            byteBufferAllocate.putInt(i);
            int i4 = (-2) - ((b + 34) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 != 0) {
                byteBufferAllocate.putLong(j);
                e(str, byteBufferAllocate.array());
                int i5 = 52 / 0;
            } else {
                byteBufferAllocate.putLong(j);
                e(str, byteBufferAllocate.array());
            }
            int i6 = a;
            int i7 = i6 & 87;
            int i8 = -(-((i6 ^ 87) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 89;
            a = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (str2 == null) {
                int i5 = i2 + 83;
                int i6 = i5 % 128;
                b = i6;
                int i7 = i5 % 2;
                int i8 = i6 & 75;
                int i9 = (i8 - (~((i6 ^ 75) | i8))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            int i11 = b;
            int i12 = (i11 | 93) << 1;
            int i13 = -(((~i11) & 93) | (i11 & (-94)));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((length & 9) + (length | 9)) - 1);
            byteBufferAllocate.putInt(0);
            int i16 = a;
            int i17 = i16 ^ 33;
            int i18 = ((i16 & 33) | i17) << 1;
            int i19 = -i17;
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            int i22 = b;
            int i23 = ((i22 | 16) << 1) - (i22 ^ 16);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            e(str, byteBufferAllocate.array());
            int i26 = b;
            int i27 = i26 & 17;
            int i28 = i26 | 17;
            int i29 = (i27 & i28) + (i28 | i27);
            a = i29 % 128;
            int i30 = i29 % 2;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            byte[] bArr;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 13;
            int i4 = (i3 - (~(-(-((i2 ^ 13) | i3))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Set set2 = set;
            if (set == null) {
                ArraySet arraySet = new ArraySet();
                int i6 = b;
                int i7 = (i6 ^ 115) + ((i6 & 115) << 1);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    arraySet.add("__NULL__");
                    obj.hashCode();
                    throw null;
                }
                arraySet.add("__NULL__");
                int i8 = a;
                int i9 = i8 & 27;
                int i10 = i9 + ((i8 ^ 27) | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                set2 = arraySet;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int i12 = a;
            int i13 = (-2) - (((i12 & 34) + (i12 | 34)) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            int size = set2.size() * 4;
            int i15 = b;
            int i16 = i15 & 115;
            int i17 = (i15 ^ 115) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            Iterator it = set2.iterator();
            int i20 = a + 23;
            b = i20 % 128;
            int i21 = i20 % 2;
            while (!(!it.hasNext())) {
                int i22 = a + 63;
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                    throw null;
                }
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                int i23 = a + 117;
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    arrayList.add(bytes);
                    size %= bytes.length;
                } else {
                    arrayList.add(bytes);
                    int length = bytes.length;
                    int i24 = size & length;
                    int i25 = size | length;
                    size = (i24 & i25) + (i25 | i24);
                }
                int i26 = a;
                int i27 = ((i26 & (-56)) | ((~i26) & 55)) + ((i26 & 55) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(1);
            Iterator it2 = arrayList.iterator();
            int i29 = a;
            int i30 = ((i29 | 121) << 1) - (i29 ^ 121);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                throw null;
            }
            while (it2.hasNext()) {
                int i31 = a;
                int i32 = i31 ^ 73;
                int i33 = (((i31 & 73) | i32) << 1) - i32;
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    bArr = (byte[]) it2.next();
                    int i34 = 50 / 0;
                } else {
                    bArr = (byte[]) it2.next();
                }
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
                int i35 = a;
                int i36 = (i35 ^ 39) + ((i35 & 39) << 1);
                int i37 = i36 % 128;
                b = i37;
                int i38 = i36 % 2;
                int i39 = (i37 ^ 123) + ((i37 & 123) << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
            }
            e(str, byteBufferAllocate.array());
            int i41 = b + 7;
            a = i41 % 128;
            int i42 = i41 % 2;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class bJJ {
        private static int a = 1;
        private static int b;
        public static final bJJ c;
        public static final /* synthetic */ bJJ[] d;
        public final a e;

        public bJJ(String str, int i, a aVar) {
            super(str, i);
            this.e = aVar;
        }

        public static bJJ valueOf(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
            a = i3 % 128;
            int i4 = i3 % 2;
            bJJ bjj = (bJJ) Enum.valueOf(bJJ.class, str);
            int i5 = a;
            int i6 = (i5 & (-62)) | ((~i5) & 61);
            int i7 = -(-((i5 & 61) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return bjj;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static bJJ[] values() {
            bJJ[] bjjArr;
            int i = 2 % 2;
            int i2 = b + 119;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                bjjArr = (bJJ[]) d.clone();
                int i3 = 40 / 0;
            } else {
                bjjArr = (bJJ[]) d.clone();
            }
            int i4 = b;
            int i5 = ((i4 | 61) << 1) - (i4 ^ 61);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return bjjArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            M.bcX bcxV = M.v();
            bcxV.f();
            M.t(bcxV.d, 64);
            M m = (M) bcxV.c();
            new O();
            bJJ bjj = new bJJ("AES256_SIV", 0, a.c("type.googleapis.com/google.crypto.tink.AesSivKey", m.e(), 1));
            int i = b;
            int i2 = i & 77;
            int i3 = -(-(i | 77));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                c = bjj;
                d = new bJJ[]{bjj};
            } else {
                c = bjj;
                bJJ[] bjjArr = new bJJ[0];
                bjjArr[0] = bjj;
                d = bjjArr;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class bJK {
        private static int a = 1;
        private static int b;
        public static final bJK c;
        public static final /* synthetic */ bJK[] d;
        public final a e;

        public bJK(String str, int i, a aVar) {
            super(str, i);
            this.e = aVar;
        }

        public static bJK valueOf(String str) {
            int i = 2 % 2;
            int i2 = b + 63;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bJK bjk = (bJK) Enum.valueOf(bJK.class, str);
            int i3 = b;
            int i4 = i3 & 19;
            int i5 = (((i3 | 19) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return bjk;
        }

        public static bJK[] values() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 115;
            int i4 = (i2 ^ 115) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            bJK[] bjkArr = (bJK[]) d.clone();
            int i7 = b;
            int i8 = i7 ^ 83;
            int i9 = -(-((i7 & 83) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return bjkArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            bJK[] bjkArr;
            C0031a.bcg bcgVarV = C0031a.v();
            bcgVarV.f();
            C0031a c0031a = bcgVarV.d;
            int i = a;
            int i2 = (i ^ 65) + ((i & 65) << 1);
            b = i2 % 128;
            int i3 = i2 % 2;
            C0031a.t(c0031a, 32);
            C0031a c0031a2 = (C0031a) bcgVarV.c();
            new ivas.gov.bisp.enumeration.aT.z();
            bJK bjk = new bJK("AES256_GCM", 0, a.c("type.googleapis.com/google.crypto.tink.AesGcmKey", c0031a2.e(), 1));
            int i4 = b;
            int i5 = i4 & 57;
            int i6 = ((i4 ^ 57) | i5) << 1;
            int i7 = -((i4 | 57) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                c = bjk;
                bjkArr = new bJK[1];
            } else {
                c = bjk;
                bjkArr = new bJK[1];
            }
            int i10 = ((i9 | 67) << 1) - (i9 ^ 67);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                bjkArr[0] = bjk;
                d = bjkArr;
            } else {
                bjkArr[0] = bjk;
                d = bjkArr;
                int i11 = 77 / 0;
            }
        }
    }

    public j(String str, String str2, SharedPreferences sharedPreferences, z zVar, InterfaceC0081t interfaceC0081t) {
        this.e = str;
        this.c = sharedPreferences;
        this.f = zVar;
        this.g = interfaceC0081t;
    }

    public static SharedPreferences c(String str, String str2, Context context, bJJ bjj, bJK bjk) {
        J jF;
        J jF2;
        int i = Q.c;
        R.g(new O(), true);
        R.i(new T());
        h.b();
        S.bhE bhe = new S.bhE();
        bhe.h = bjj.e;
        bhe.f(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        StringBuilder sb = new StringBuilder();
        sb.append("android-keystore://");
        sb.append(str2);
        String string = sb.toString();
        if (!string.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        bhe.e = string;
        S sC = bhe.c();
        synchronized (sC) {
            jF = sC.c.f();
        }
        S.bhE bhe2 = new S.bhE();
        bhe2.h = bjk.e;
        bhe2.f(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android-keystore://");
        sb2.append(str2);
        String string2 = sb2.toString();
        if (!string2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        bhe2.e = string2;
        S sC2 = bhe2.c();
        synchronized (sC2) {
            jF2 = sC2.c.f();
        }
        InterfaceC0081t interfaceC0081t = (InterfaceC0081t) jF.e(InterfaceC0081t.class);
        return new j(str, str2, context.getSharedPreferences(str, 0), (z) jF2.e(z.class), interfaceC0081t);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = ((((i2 & 123) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (f(str)) {
            throw new SecurityException(ivas.gov.bisp.enumeration.p091n.j.r(str, " is a reserved key for the encryption keyset."));
        }
        int i6 = b;
        int i7 = i6 & 77;
        int i8 = (((i6 ^ 77) | i7) << 1) - ((i6 | 77) & (~i7));
        a = i8 % 128;
        int i9 = i8 % 2;
        boolean zContains = this.c.contains(d(str));
        int i10 = a;
        int i11 = i10 & 107;
        int i12 = ((i10 | 107) & (~i11)) + (i11 << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 94 / 0;
        }
        return zContains;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int i = 2 % 2;
        bJI bji = new bJI(this, this.c.edit());
        int i2 = b + 77;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return bji;
    }

    public final boolean f(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 53) | (i2 & 53)) << 1) - (~(-(((~i2) & 53) | (i2 & (-54)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str)) {
            int i5 = a + 119;
            b = i5 % 128;
            int i6 = i5 % 2;
            if (!"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
                int i7 = b;
                int i8 = i7 & 75;
                int i9 = i8 + ((i7 ^ 75) | i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((i7 & 14) + (i7 | 14)) - 1;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        int i12 = a;
        int i13 = (-2) - (((i12 ^ 4) + ((i12 & 4) << 1)) ^ (-1));
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = a + 117;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            e(str);
            throw null;
        }
        Object objE = e(str);
        if (objE != null && !(!(objE instanceof Integer))) {
            int i4 = a;
            int i5 = (i4 & 123) + (i4 | 123);
            b = i5 % 128;
            int i6 = i5 % 2;
            i = ((Integer) objE).intValue();
            int i7 = a;
            int i8 = ((i7 | 123) << 1) - (i7 ^ 123);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = ((i10 & 41) - (~(i10 | 41))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object objE = e(str);
        if (objE != null) {
            int i5 = a;
            int i6 = (i5 & (-88)) | ((~i5) & 87);
            int i7 = (i5 & 87) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            if (!(!(objE instanceof Long))) {
                int i11 = i9 ^ 23;
                int i12 = ((i9 & 23) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                j = ((Long) objE).longValue();
                int i16 = b + 115;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = b;
        int i19 = (-2) - (((i18 ^ 58) + ((i18 & 58) << 1)) ^ (-1));
        a = i19 % 128;
        int i20 = i19 % 2;
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = ((i2 ^ 115) | i3) << 1;
        int i5 = -((i2 | 115) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            e(str);
            throw null;
        }
        Object objE = e(str);
        if (objE != null && (objE instanceof String)) {
            int i7 = b;
            int i8 = ((i7 ^ 79) | (i7 & 79)) << 1;
            int i9 = -(((~i7) & 79) | (i7 & (-80)));
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = i11 & 101;
            int i14 = ((i11 ^ 101) | i13) << 1;
            int i15 = -((i11 | 101) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            str2 = (String) objE;
        }
        int i18 = a;
        int i19 = (i18 & 77) + (i18 | 77);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.add(onSharedPreferenceChangeListener);
        int i5 = a;
        int i6 = i5 & 53;
        int i7 = (i5 | 53) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 84 / 0;
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 7) - (~(-(-((i2 & 7) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.remove(onSharedPreferenceChangeListener);
        int i5 = b;
        int i6 = ((i5 ^ 33) - (~(-(-((i5 & 33) << 1))))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objE = e(str);
        if (objE != null) {
            int i4 = b;
            int i5 = i4 & 1;
            int i6 = -(-((i4 ^ 1) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (objE instanceof Boolean) {
                int i10 = i8 & 31;
                int i11 = i8 | 31;
                int i12 = (i10 & i11) + (i10 | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                z = ((Boolean) objE).booleanValue();
                int i14 = a;
                int i15 = ((i14 & (-80)) | ((~i14) & 79)) + ((i14 & 79) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int i17 = a;
        int i18 = i17 & 99;
        int i19 = (((i17 | 99) & (~i18)) - (~(i18 << 1))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i3 - (~(-(-((i2 ^ 121) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object objE = e(str);
        if (objE != null) {
            int i6 = b + 51;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (objE instanceof Float) {
                int i9 = i7 & 105;
                int i10 = (~i9) & (i7 | 105);
                int i11 = i9 << 1;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                f = ((Float) objE).floatValue();
                int i14 = b;
                int i15 = i14 ^ 51;
                int i16 = -(-((i14 & 51) << 1));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = a;
        int i20 = (i19 ^ 14) + ((i19 & 14) << 1);
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> arraySet;
        int i = 2 % 2;
        int i2 = a + 75;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = e(str) instanceof Set;
            throw null;
        }
        Object objE = e(str);
        if (objE instanceof Set) {
            arraySet = (Set) objE;
            int i3 = a;
            int i4 = ((i3 | 9) << 1) - (i3 ^ 9);
            b = i4 % 128;
            int i5 = i4 % 2;
        } else {
            arraySet = new ArraySet<>();
            int i6 = a;
            int i7 = (-2) - (((i6 & 110) + (i6 | 110)) ^ (-1));
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        if (arraySet.size() > 0) {
            int i9 = b;
            int i10 = ((i9 ^ 110) + ((i9 & 110) << 1)) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 71 / 0;
            }
            set = arraySet;
        }
        int i12 = b;
        int i13 = i12 & 109;
        int i14 = i13 + ((i12 ^ 109) | i13);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return set;
        }
        obj.hashCode();
        throw null;
    }

    public final String d(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (str == null) {
            int i6 = i4 & 83;
            int i7 = ((i4 ^ 83) | i6) << 1;
            int i8 = -((i4 | 83) & (~i6));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 63;
            int i13 = (i10 ^ 63) | i12;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            str = "__NULL__";
        }
        try {
            InterfaceC0081t interfaceC0081t = this.g;
            Charset charset = StandardCharsets.UTF_8;
            int i16 = a;
            int i17 = (i16 & 50) + (i16 | 50);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = this.e.getBytes();
            int i20 = a;
            int i21 = (((i20 | 94) << 1) - (i20 ^ 94)) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArrB = interfaceC0081t.b(bytes, bytes2);
            int i23 = a;
            int i24 = ((i23 | 107) << 1) - (i23 ^ 107);
            b = i24 % 128;
            int i25 = i24 % 2;
            String strC = P.c(bArrB);
            int i26 = b;
            int i27 = ((i26 | 53) << 1) - (i26 ^ 53);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                return strC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Could not encrypt key. ");
            sbW.append(e.getMessage());
            throw new SecurityException(sbW.toString(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Map.Entry<String, ?> next;
        String key;
        String key2;
        InterfaceC0081t interfaceC0081t;
        int i = 2 % 2;
        HashMap map = new HashMap();
        Map<String, ?> all = this.c.getAll();
        int i2 = a + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        int i4 = b;
        int i5 = i4 & 43;
        int i6 = -(-((i4 ^ 43) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 5 / 4;
        }
        while (!(!it.hasNext())) {
            int i9 = a + 117;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                next = it.next();
                key = next.getKey();
                int i10 = 80 / 0;
            } else {
                next = it.next();
                key = next.getKey();
            }
            if (!f(key)) {
                int i11 = b;
                int i12 = ((i11 | 8) << 1) - (i11 ^ 8);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    key2 = next.getKey();
                    try {
                        interfaceC0081t = this.g;
                        int i14 = 6 / 0;
                    } catch (GeneralSecurityException e) {
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Could not decrypt key. ");
                        sbW.append(e.getMessage());
                        throw new SecurityException(sbW.toString(), e);
                    }
                } else {
                    key2 = next.getKey();
                    interfaceC0081t = this.g;
                }
                byte[] bArrB = P.b(key2, 0);
                String str = this.e;
                int i15 = a;
                int i16 = (i15 & (-22)) | ((~i15) & 21);
                int i17 = (i15 & 21) << 1;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                String str2 = new String(interfaceC0081t.e(bArrB, str.getBytes()), StandardCharsets.UTF_8);
                int i20 = a;
                int i21 = i20 & 33;
                int i22 = -(-(i20 | 33));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                if (!(!str2.equals("__NULL__"))) {
                    int i25 = b;
                    int i26 = (((i25 | 12) << 1) - (i25 ^ 12)) - 1;
                    int i27 = i26 % 128;
                    a = i27;
                    int i28 = i26 % 2;
                    int i29 = (((i27 & (-108)) | ((~i27) & 107)) - (~((i27 & 107) << 1))) - 1;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    str2 = null;
                }
                map.put(str2, e(str2));
                int i31 = a;
                int i32 = i31 & 21;
                int i33 = (((i31 | 21) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
            }
        }
        int i35 = a;
        int i36 = ((i35 | 101) << 1) - (i35 ^ 101);
        b = i36 % 128;
        int i37 = i36 % 2;
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x039c  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b9  */
    public final Object e(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 119;
        int i5 = -(-((i3 ^ 119) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        boolean z = true;
        if (!(!f(str))) {
            throw new SecurityException(ivas.gov.bisp.enumeration.p091n.j.r(str, " is a reserved key for the encryption keyset."));
        }
        int i8 = a;
        int i9 = i8 & 19;
        int i10 = (i8 ^ 19) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        int i12 = i11 % 128;
        b = i12;
        Object objValueOf = null;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            int i13 = (i12 & (-122)) | ((~i12) & 121);
            int i14 = -(-((i12 & 121) << 1));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 88 / 0;
            }
            str = "__NULL__";
        }
        try {
            String strD = d(str);
            SharedPreferences sharedPreferences = this.c;
            int i17 = b;
            int i18 = i17 & 75;
            int i19 = (i17 ^ 75) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                sharedPreferences.getString(strD, null);
                throw null;
            }
            String string = sharedPreferences.getString(strD, null);
            int i21 = a;
            int i22 = i21 | 75;
            int i23 = (i22 << 1) - ((~(i21 & 75)) & i22);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
            if (string != null) {
                byte[] bArrB = P.b(string, 0);
                z zVar = this.f;
                int i24 = a;
                int i25 = (i24 ^ 71) + ((i24 & 71) << 1);
                b = i25 % 128;
                int i26 = i25 % 2;
                byte[] bArrE = zVar.e(bArrB, strD.getBytes(StandardCharsets.UTF_8));
                int i27 = b;
                int i28 = (i27 | 95) << 1;
                int i29 = -(((~i27) & 95) | (i27 & (-96)));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                a = i30 % 128;
                int i31 = i30 % 2;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrE);
                byteBufferWrap.position(0);
                int i32 = b;
                int i33 = ((i32 ^ 98) + ((i32 & 98) << 1)) - 1;
                a = i33 % 128;
                int i34 = i33 % 2;
                int i35 = byteBufferWrap.getInt();
                if (i35 != 0) {
                    int i36 = b;
                    int i37 = i36 ^ 109;
                    int i38 = ((i36 & 109) | i37) << 1;
                    int i39 = -i37;
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    int i41 = i40 % 128;
                    a = i41;
                    int i42 = i40 % 2;
                    if (i35 != 1) {
                        int i43 = (i36 & 11) + (i36 | 11);
                        int i44 = i43 % 128;
                        a = i44;
                        if (i43 % 2 == 0 ? i35 == 2 : i35 == 3) {
                            i = 3;
                        } else if (i35 != 3) {
                            int i45 = i36 & 77;
                            int i46 = -(-((i36 ^ 77) | i45));
                            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                            int i48 = i47 % 128;
                            a = i48;
                            if (i47 % 2 == 0 ? i35 == 4 : i35 == 5) {
                                int i49 = (i36 & 101) + (i36 | 101);
                                a = i49 % 128;
                                if (i49 % 2 != 0) {
                                    int i50 = 4 % 3;
                                }
                                i = 5;
                            } else {
                                int i51 = i48 + 109;
                                int i52 = i51 % 128;
                                b = i52;
                                if (i51 % 2 != 0 ? i35 == 5 : i35 == 3) {
                                    int i53 = i52 ^ 59;
                                    int i54 = ((i52 & 59) | i53) << 1;
                                    int i55 = -i53;
                                    int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                                    a = i56 % 128;
                                    int i57 = i56 % 2;
                                    i = 6;
                                } else {
                                    int i58 = i48 & 107;
                                    int i59 = ((i48 ^ 107) | i58) << 1;
                                    int i60 = -((~i58) & (i48 | 107));
                                    int i61 = (i59 & i60) + (i59 | i60);
                                    b = i61 % 128;
                                    int i62 = i61 % 2;
                                    i = 0;
                                }
                            }
                        } else {
                            int i63 = i44 ^ 125;
                            int i64 = (((i44 & 125) | i63) << 1) - i63;
                            b = i64 % 128;
                            int i65 = i64 % 2;
                            i = 4;
                        }
                    } else {
                        int i66 = (((i41 & (-56)) | ((~i41) & 55)) - (~(-(-((i41 & 55) << 1))))) - 1;
                        b = i66 % 128;
                        int i67 = i66 % 2;
                        i = 2;
                    }
                } else {
                    int i68 = b;
                    int i69 = ((i68 | 61) << 1) - (i68 ^ 61);
                    a = i69 % 128;
                    if (i69 % 2 != 0) {
                        int i70 = 5 % 4;
                    }
                    i = 1;
                }
                int iC = ivas.gov.bisp.enumeration.p003ac.P.c(i);
                if (iC != 0) {
                    int i71 = a;
                    int i72 = i71 + 87;
                    b = i72 % 128;
                    if (i72 % 2 != 0 ? iC == 1 : iC == 1) {
                        ArraySet arraySet = new ArraySet();
                        int i73 = a;
                        int i74 = (i73 ^ 75) + ((i73 & 75) << 1);
                        b = i74 % 128;
                        int i75 = i74 % 2;
                        while (!(!byteBufferWrap.hasRemaining())) {
                            int i76 = b;
                            int i77 = (i76 ^ 81) + ((i76 & 81) << 1);
                            a = i77 % 128;
                            if (i77 % 2 != 0) {
                                byteBufferWrap.getInt();
                                byteBufferWrap.slice();
                                throw null;
                            }
                            int i78 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                            byteBufferSlice.limit(i78);
                            int iPosition = byteBufferWrap.position();
                            int i79 = b;
                            int i80 = (i79 & 89) + (i79 | 89);
                            a = i80 % 128;
                            if (i80 % 2 != 0) {
                                byteBufferWrap.position(iPosition >>> i78);
                            } else {
                                int i81 = -(-i78);
                                int i82 = iPosition ^ i81;
                                int i83 = (i81 & iPosition) << 1;
                                byteBufferWrap.position(((i82 | i83) << 1) - (i83 ^ i82));
                            }
                            arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice).toString());
                            int i84 = a;
                            int i85 = i84 & 121;
                            int i86 = (i84 | 121) & (~i85);
                            int i87 = i85 << 1;
                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                            b = i88 % 128;
                            int i89 = i88 % 2;
                        }
                        if (arraySet.size() == 1) {
                            int i90 = a + 119;
                            b = i90 % 128;
                            int i91 = i90 % 2;
                            if ("__NULL__".equals(arraySet.valueAt(0))) {
                                int i92 = a;
                                int i93 = ((i92 ^ 90) + ((i92 & 90) << 1)) - 1;
                                int i94 = i93 % 128;
                                b = i94;
                                int i95 = i93 % 2;
                                int i96 = ((i94 | 19) << 1) - (i94 ^ 19);
                                a = i96 % 128;
                                if (i96 % 2 != 0) {
                                    int i97 = 4 / 3;
                                }
                            } else {
                                int i98 = b;
                                int i99 = i98 ^ 113;
                                int i100 = (i98 & 113) << 1;
                                int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                                a = i101 % 128;
                                int i102 = i101 % 2;
                                objValueOf = arraySet;
                            }
                        } else {
                            int i910 = b;
                            int i911 = i910 ^ 113;
                            int i103 = (i910 & 113) << 1;
                            int i104 = ((i911 | i103) << 1) - (i103 ^ i911);
                            a = i104 % 128;
                            int i105 = i104 % 2;
                            objValueOf = arraySet;
                        }
                    } else {
                        int i106 = ((i71 & 114) + (i71 | 114)) - 1;
                        b = i106 % 128;
                        if (i106 % 2 != 0 ? iC == 2 : iC == 4) {
                            objValueOf = Integer.valueOf(byteBufferWrap.getInt());
                            int i107 = b;
                            int i108 = i107 & 83;
                            int i109 = (((i107 | 83) & (~i108)) - (~(i108 << 1))) - 1;
                            a = i109 % 128;
                            int i110 = i109 % 2;
                        } else if (iC != 3) {
                            int i111 = i71 + 43;
                            b = i111 % 128;
                            int i112 = i111 % 2;
                            if (iC != 4) {
                                int i113 = i71 & 15;
                                int i114 = (~i113) & (i71 | 15);
                                int i115 = -(-(i113 << 1));
                                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                                int i117 = i116 % 128;
                                b = i117;
                                if (i116 % 2 != 0 ? iC == 5 : iC == 3) {
                                    if (byteBufferWrap.get() != 0) {
                                        int i118 = b;
                                        int i119 = i118 + 27;
                                        a = i119 % 128;
                                        int i120 = i119 % 2;
                                        int i121 = i118 & 3;
                                        int i122 = (i118 | 3) & (~i121);
                                        int i123 = i121 << 1;
                                        int i124 = (i122 & i123) + (i122 | i123);
                                        a = i124 % 128;
                                        int i125 = i124 % 2;
                                    } else {
                                        z = false;
                                    }
                                    objValueOf = Boolean.valueOf(z);
                                    int i126 = a;
                                    int i127 = i126 & 79;
                                    int i128 = i126 | 79;
                                    int i129 = (i127 & i128) + (i128 | i127);
                                    b = i129 % 128;
                                    if (i129 % 2 == 0) {
                                        int i130 = 4 / 3;
                                    }
                                } else {
                                    int i131 = i117 ^ 81;
                                    int i132 = ((i117 & 81) | i131) << 1;
                                    int i133 = -i131;
                                    int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                                    a = i134 % 128;
                                    int i135 = i134 % 2;
                                    int i136 = i117 & 83;
                                    int i137 = i136 + ((i117 ^ 83) | i136);
                                    a = i137 % 128;
                                    int i138 = i137 % 2;
                                }
                            } else {
                                objValueOf = Float.valueOf(byteBufferWrap.getFloat());
                                int i139 = a;
                                int i140 = (i139 ^ 113) + ((i139 & 113) << 1);
                                b = i140 % 128;
                                int i141 = i140 % 2;
                            }
                        } else {
                            objValueOf = Long.valueOf(byteBufferWrap.getLong());
                            int i142 = b;
                            int i143 = (((i142 | 23) << 1) - (~(-(i142 ^ 23)))) - 1;
                            a = i143 % 128;
                            int i144 = i143 % 2;
                        }
                    }
                } else {
                    int i145 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    int i146 = a;
                    int i147 = (i146 & (-104)) | ((~i146) & 103);
                    int i148 = (i146 & 103) << 1;
                    int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
                    b = i149 % 128;
                    if (i149 % 2 == 0) {
                        byteBufferWrap.limit(i145);
                        Charset charset = StandardCharsets.UTF_8;
                        objValueOf.hashCode();
                        throw null;
                    }
                    byteBufferWrap.limit(i145);
                    Object string2 = StandardCharsets.UTF_8.decode(byteBufferSlice2).toString();
                    int i150 = a;
                    int i151 = (i150 & 113) + (i150 | 113);
                    b = i151 % 128;
                    if (i151 % 2 == 0) {
                        int i152 = 83 / 0;
                        if (!string2.equals("__NULL__")) {
                            objValueOf = string2;
                        } else {
                            int i153 = a;
                            int i154 = i153 & 3;
                            int i155 = (((i153 ^ 3) | i154) << 1) - ((i153 | 3) & (~i154));
                            int i156 = i155 % 128;
                            b = i156;
                            int i157 = i155 % 2;
                            int i158 = (-2) - ((i156 + 92) ^ (-1));
                            a = i158 % 128;
                            int i159 = i158 % 2;
                        }
                    } else if (string2.equals("__NULL__")) {
                        int i1510 = a;
                        int i1511 = i1510 & 3;
                        int i1512 = (((i1510 ^ 3) | i1511) << 1) - ((i1510 | 3) & (~i1511));
                        int i1513 = i1512 % 128;
                        b = i1513;
                        int i1514 = i1512 % 2;
                        int i1515 = (-2) - ((i1513 + 92) ^ (-1));
                        a = i1515 % 128;
                        int i1516 = i1515 % 2;
                    } else {
                        objValueOf = string2;
                    }
                }
            }
            int i160 = a + 15;
            b = i160 % 128;
            int i161 = i160 % 2;
            return objValueOf;
        } catch (GeneralSecurityException e) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Could not decrypt value. ");
            sbW.append(e.getMessage());
            throw new SecurityException(sbW.toString(), e);
        }
    }
}
