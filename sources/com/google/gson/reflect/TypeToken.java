package com.google.gson.reflect;

import ivas.gov.bisp.enumeration.p102y.C0328j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TypeToken<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeC = C0328j.c(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.b = typeC;
        this.a = (Class<? super T>) C0328j.h(typeC);
        this.c = typeC.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C0328j.e(this.b, ((TypeToken) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return C0328j.b(this.b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type typeC = C0328j.c(type);
        this.b = typeC;
        this.a = (Class<? super T>) C0328j.h(typeC);
        this.c = typeC.hashCode();
    }
}
