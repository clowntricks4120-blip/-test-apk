package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class question_options {

    @o0OO00O("option")
    public String option;

    @o0OO00O("option_id")
    public int option_id;

    @o0OO00O("question")
    public String question;

    @o0OO00O("sort_order")
    public int sort_order;

    public question_options(int i, String str, String str2, int i2) {
        this.option_id = i;
        this.question = str;
        this.option = str2;
        this.sort_order = i2;
    }
}
