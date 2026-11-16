package butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OnPageChange {

    public enum Callback {
        PAGE_SELECTED,
        /* JADX INFO: Fake field, exist only in values array */
        PAGE_SCROLLED,
        /* JADX INFO: Fake field, exist only in values array */
        PAGE_SCROLL_STATE_CHANGED
    }
}
