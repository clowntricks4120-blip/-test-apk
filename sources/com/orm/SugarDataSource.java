package com.orm;

import android.database.Cursor;
import com.orm.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class SugarDataSource<T> {
    private final Class<T> sClass;

    public interface ErrorCallback {
        void onError(Exception exc);
    }

    public interface SuccessCallback<S> {
        void onSuccess(S s);
    }

    private SugarDataSource(Class<T> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("sClass shouldn't be null!");
        }
        this.sClass = cls;
    }

    public static <T> SugarDataSource<T> getInstance(Class<T> cls) {
        return new SugarDataSource<>(cls);
    }

    public final void bulkInsert(final List<T> list, SuccessCallback<List<Long>> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        checkNotNull(list);
        try {
            List<Long> list2 = (List) ThreadUtil.doInBackground(new Callable<List<Long>>() { // from class: com.orm.SugarDataSource.2
                @Override // java.util.concurrent.Callable
                public List<Long> call() {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arrayList.add(i, Long.valueOf(SugarRecord.save(list.get(i))));
                    }
                    return arrayList;
                }
            }).get();
            if (list2 != null && !list2.isEmpty()) {
                successCallback.onSuccess(list2);
                return;
            }
            errorCallback.onError(new Exception("Error when performing bulk insert"));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object shouldn't be null");
        }
    }

    public final void count(SuccessCallback<Long> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        try {
            Long l = (Long) ThreadUtil.doInBackground(new Callable<Long>() { // from class: com.orm.SugarDataSource.9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Long call() {
                    return Long.valueOf(SugarRecord.count(SugarDataSource.this.getSugarClass()));
                }
            }).get();
            if (l == null) {
                errorCallback.onError(new Exception("Error when trying to get count"));
            } else {
                successCallback.onSuccess(l);
            }
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void delete(final T t, SuccessCallback<Boolean> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        checkNotNull(t);
        try {
            Boolean bool = (Boolean) ThreadUtil.doInBackground(new Callable<Boolean>() { // from class: com.orm.SugarDataSource.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(SugarRecord.delete(t));
                }
            }).get();
            if (bool != null && bool.booleanValue()) {
                successCallback.onSuccess(bool);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error when performing delete of ");
            sb.append(t.toString());
            errorCallback.onError(new Exception(sb.toString()));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void deleteAll(SuccessCallback<Integer> successCallback, ErrorCallback errorCallback) {
        delete(null, null, successCallback, errorCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void findById(final Long l, SuccessCallback<T> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        checkNotNull(l);
        try {
            Object obj = ThreadUtil.doInBackground(new Callable<T>() { // from class: com.orm.SugarDataSource.3
                @Override // java.util.concurrent.Callable
                public T call() {
                    return (T) SugarRecord.findById(SugarDataSource.this.getSugarClass(), l);
                }
            }).get();
            if (obj != null) {
                successCallback.onSuccess(obj);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The object with ");
            sb.append(l.toString());
            sb.append("doesn't exist in database");
            errorCallback.onError(new Exception(sb.toString()));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final Class<T> getSugarClass() {
        return this.sClass;
    }

    public final void insert(final T t, SuccessCallback<Long> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        checkNotNull(t);
        try {
            Long l = (Long) ThreadUtil.doInBackground(new Callable<Long>() { // from class: com.orm.SugarDataSource.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Long call() {
                    return Long.valueOf(SugarRecord.save(t));
                }
            }).get();
            if (l != null) {
                successCallback.onSuccess(l);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error when performing insert of ");
            sb.append(t.toString());
            errorCallback.onError(new Exception(sb.toString()));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void listAll(final String str, SuccessCallback<List<T>> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        try {
            List<T> list = (List) ThreadUtil.doInBackground(new Callable<List<T>>() { // from class: com.orm.SugarDataSource.5
                @Override // java.util.concurrent.Callable
                public List<T> call() {
                    return SugarRecord.listAll(SugarDataSource.this.getSugarClass(), str);
                }
            }).get();
            if (list != null && !list.isEmpty()) {
                successCallback.onSuccess(list);
                return;
            }
            errorCallback.onError(new Exception("There are no objects in the database"));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void query(final String str, final String[] strArr, final String str2, final String str3, final String str4, SuccessCallback<Cursor> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        try {
            Cursor cursor = (Cursor) ThreadUtil.doInBackground(new Callable<Cursor>() { // from class: com.orm.SugarDataSource.4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Cursor call() {
                    return SugarRecord.getCursor(SugarDataSource.this.getSugarClass(), str, strArr, str2, str3, str4);
                }
            }).get();
            if (cursor == null) {
                errorCallback.onError(new Exception("Problem when trying to get the cursor"));
            } else {
                successCallback.onSuccess(cursor);
            }
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void update(final T t, SuccessCallback<Long> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        checkNotNull(t);
        try {
            Long l = (Long) ThreadUtil.doInBackground(new Callable<Long>() { // from class: com.orm.SugarDataSource.6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Long call() {
                    return Long.valueOf(SugarRecord.update(t));
                }
            }).get();
            if (l != null) {
                successCallback.onSuccess(l);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error when performing update of ");
            sb.append(t.toString());
            errorCallback.onError(new Exception(sb.toString()));
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }

    public final void delete(final String str, final String[] strArr, SuccessCallback<Integer> successCallback, ErrorCallback errorCallback) {
        checkNotNull(successCallback);
        checkNotNull(errorCallback);
        try {
            Integer num = (Integer) ThreadUtil.doInBackground(new Callable<Integer>() { // from class: com.orm.SugarDataSource.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Integer call() {
                    return Integer.valueOf(SugarRecord.deleteAll(SugarDataSource.this.getSugarClass(), str, strArr));
                }
            }).get();
            if (num == null) {
                errorCallback.onError(new Exception("Error when performing delete of all elements"));
            } else {
                successCallback.onSuccess(num);
            }
        } catch (Exception e) {
            errorCallback.onError(e);
        }
    }
}
