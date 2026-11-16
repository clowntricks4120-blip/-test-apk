package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class login_details {
    public String expire_session;
    public String fu;
    public long id;
    public String mu;
    public String token;
    public String user_name;

    public login_details(long j, String str, String str2, String str3, String str4, String str5) {
        this.id = j;
        this.user_name = str;
        this.token = str2;
        this.expire_session = str3;
        this.fu = str4;
        this.mu = str5;
    }
}
