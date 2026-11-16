package net.sqlcipher;

/* JADX INFO: loaded from: classes.dex */
public interface CursorWindowAllocation {
    long getGrowthPaddingSize();

    long getInitialAllocationSize();

    long getMaxAllocationSize();
}
