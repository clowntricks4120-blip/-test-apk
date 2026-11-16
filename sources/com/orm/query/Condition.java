package com.orm.query;

import com.orm.SugarRecord;

/* JADX INFO: loaded from: classes.dex */
public class Condition {
    private Check check;
    private String property;
    private Object value;

    public enum Check {
        EQUALS(" = "),
        GREATER_THAN(" > "),
        LESSER_THAN(" < "),
        NOT_EQUALS(" != "),
        LIKE(" LIKE "),
        NOT_LIKE(" NOT LIKE "),
        IS_NULL(" IS NULL "),
        IS_NOT_NULL(" IS NOT NULL ");

        private String symbol;

        Check(String str) {
            this.symbol = str;
        }

        public final String getSymbol() {
            return this.symbol;
        }
    }

    public enum Type {
        AND,
        OR,
        NOT
    }

    public Condition(String str) {
        this.property = str;
    }

    public static Condition prop(String str) {
        return new Condition(str);
    }

    private void setValue(Object obj) {
        if (obj instanceof SugarRecord) {
            this.value = ((SugarRecord) obj).getId();
        } else {
            this.value = obj;
        }
    }

    public Condition eq(Object obj) {
        if (obj == null) {
            return isNull();
        }
        setValue(obj);
        this.check = Check.EQUALS;
        return this;
    }

    public Check getCheck() {
        return this.check;
    }

    public String getCheckSymbol() {
        return this.check.getSymbol();
    }

    public String getProperty() {
        return this.property;
    }

    public Object getValue() {
        return this.value;
    }

    public Condition gt(Object obj) {
        setValue(obj);
        this.check = Check.GREATER_THAN;
        return this;
    }

    public Condition isNotNull() {
        setValue(null);
        this.check = Check.IS_NOT_NULL;
        return this;
    }

    public Condition isNull() {
        setValue(null);
        this.check = Check.IS_NULL;
        return this;
    }

    public Condition like(Object obj) {
        setValue(obj);
        this.check = Check.LIKE;
        return this;
    }

    public Condition lt(Object obj) {
        setValue(obj);
        this.check = Check.LESSER_THAN;
        return this;
    }

    public Condition notEq(Object obj) {
        if (obj == null) {
            return isNotNull();
        }
        setValue(obj);
        this.check = Check.NOT_EQUALS;
        return this;
    }

    public Condition notLike(Object obj) {
        setValue(obj);
        this.check = Check.NOT_LIKE;
        return this;
    }
}
