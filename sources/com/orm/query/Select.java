package com.orm.query;

import android.database.Cursor;
import com.orm.SugarRecord;
import com.orm.helper.NamingHelper;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class Select<T> implements Iterable {
    private static final String GROUP_BY = "GROUP BY ";
    private static final String LEFT_PARENTHESIS = "(";
    private static final String LIMIT = "LIMIT ";
    private static final String OFFSET = "OFFSET ";
    private static final String ORDER_BY = "ORDER BY ";
    private static final String RIGHT_PARENTHESIS = ")";
    private static final String SELECT_FROM = "SELECT * FROM ";
    private static final String SINGLE_QUOTE = "'";
    private static final String SPACE = " ";
    private static final String WHERE = "WHERE ";
    private String[] arguments;
    private Class<T> record;
    private String whereClause = BuildConfig.FLAVOR;
    private String orderBy = BuildConfig.FLAVOR;
    private String groupBy = BuildConfig.FLAVOR;
    private String limit = BuildConfig.FLAVOR;
    private String offset = BuildConfig.FLAVOR;
    private List<String> args = new ArrayList();

    public Select(Class<T> cls) {
        this.record = cls;
    }

    private String[] convertArgs(List<String> list) {
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static <T> Select<T> from(Class<T> cls) {
        return new Select<>(cls);
    }

    private void mergeConditions(Condition[] conditionArr, Condition.Type type) {
        StringBuilder sb = new StringBuilder();
        for (Condition condition : conditionArr) {
            if (sb.length() != 0) {
                sb.append(SPACE);
                sb.append(type.name());
                sb.append(SPACE);
            }
            if (Condition.Check.LIKE.equals(condition.getCheck()) || Condition.Check.NOT_LIKE.equals(condition.getCheck())) {
                sb.append(condition.getProperty());
                sb.append(condition.getCheckSymbol());
                sb.append(SINGLE_QUOTE);
                sb.append(condition.getValue().toString());
                sb.append(SINGLE_QUOTE);
            } else if (Condition.Check.IS_NULL.equals(condition.getCheck()) || Condition.Check.IS_NOT_NULL.equals(condition.getCheck())) {
                sb.append(condition.getProperty());
                sb.append(condition.getCheckSymbol());
            } else {
                sb.append(condition.getProperty());
                sb.append(condition.getCheckSymbol());
                sb.append("? ");
                this.args.add(condition.getValue().toString());
            }
        }
        if (!this.whereClause.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.whereClause);
            sb2.append(SPACE);
            sb2.append(type.name());
            sb2.append(SPACE);
            this.whereClause = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.whereClause);
        sb3.append(LEFT_PARENTHESIS);
        sb3.append((Object) sb);
        sb3.append(RIGHT_PARENTHESIS);
        this.whereClause = sb3.toString();
    }

    public Select<T> and(Condition... conditionArr) {
        mergeConditions(conditionArr, Condition.Type.AND);
        return this;
    }

    public long count() {
        if (this.arguments == null) {
            this.arguments = convertArgs(this.args);
        }
        return SugarRecord.count(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
    }

    public T first() {
        if (this.arguments == null) {
            this.arguments = convertArgs(this.args);
        }
        List listFind = SugarRecord.find(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, "1");
        if (listFind.size() > 0) {
            return (T) listFind.get(0);
        }
        return null;
    }

    public String[] getArgs() {
        return convertArgs(this.args);
    }

    public Cursor getCursor() {
        return SugarRecord.getCursor(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
    }

    public String getWhereCond() {
        return this.whereClause;
    }

    public Select<T> groupBy(String str) {
        this.groupBy = str;
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        if (this.arguments == null) {
            this.arguments = convertArgs(this.args);
        }
        return SugarRecord.findAsIterator(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
    }

    public Select<T> limit(String str) {
        this.limit = str;
        return this;
    }

    public List<T> list() {
        if (this.arguments == null) {
            this.arguments = convertArgs(this.args);
        }
        return SugarRecord.find(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
    }

    public Select<T> offset(String str) {
        this.offset = str;
        return this;
    }

    public Select<T> or(Condition... conditionArr) {
        mergeConditions(conditionArr, Condition.Type.OR);
        return this;
    }

    public Select<T> orderBy(String str) {
        this.orderBy = str;
        return this;
    }

    public String toSql() {
        StringBuilder sbW = j.w(SELECT_FROM);
        sbW.append(NamingHelper.toTableName(this.record));
        sbW.append(SPACE);
        if (!this.whereClause.isEmpty()) {
            sbW.append(WHERE);
            sbW.append(this.whereClause);
            sbW.append(SPACE);
        }
        if (!this.orderBy.isEmpty()) {
            sbW.append(ORDER_BY);
            sbW.append(this.orderBy);
            sbW.append(SPACE);
        }
        if (!this.groupBy.isEmpty()) {
            sbW.append(GROUP_BY);
            sbW.append(this.groupBy);
            sbW.append(SPACE);
        }
        if (!this.limit.isEmpty()) {
            sbW.append(LIMIT);
            sbW.append(this.limit);
            sbW.append(SPACE);
        }
        if (!this.offset.isEmpty()) {
            sbW.append(OFFSET);
            sbW.append(this.offset);
            sbW.append(SPACE);
        }
        return sbW.toString();
    }

    public Select<T> where(String str) {
        this.whereClause = str;
        return this;
    }

    public Select<T> whereOr(Condition... conditionArr) {
        mergeConditions(conditionArr, Condition.Type.OR);
        return this;
    }

    public Select<T> where(Condition... conditionArr) {
        mergeConditions(conditionArr, Condition.Type.AND);
        return this;
    }

    public Select<T> where(String str, String[] strArr) {
        this.whereClause = str;
        this.arguments = strArr;
        return this;
    }
}
