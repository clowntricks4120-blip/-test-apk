package ivas.gov.bisp.enumeration.p024ax;

import ivas.gov.bisp.enumeration.models.ResponseMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface aE {
    void onError(ResponseMessage responseMessage);

    void onSuccess(JSONObject jSONObject);
}
