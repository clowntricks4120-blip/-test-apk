package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class offline_survey_count {
    public long id;
    public int not_sync_count;
    public int sync_count;

    public offline_survey_count(long j, int i, int i2) {
        this.id = j;
        this.sync_count = i;
        this.not_sync_count = i2;
    }
}
