package com.orm.util;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadUtil {
    private ThreadUtil() {
    }

    public static Future doInBackground(Callable callable) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(callable);
        if (executorServiceNewSingleThreadExecutor.isTerminated()) {
            executorServiceNewSingleThreadExecutor.shutdown();
        }
        return futureSubmit;
    }
}
