package org.acra.collector;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.SparseArray;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bV.B;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.acra.ReportField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecListCollector extends BaseReportFieldCollector {
    private static final String COLOR_FORMAT_PREFIX = "COLOR_";
    private final SparseArray<String> mAACProfileValues;
    private final SparseArray<String> mAVCLevelValues;
    private final SparseArray<String> mAVCProfileValues;
    private final SparseArray<String> mColorFormatValues;
    private final SparseArray<String> mH263LevelValues;
    private final SparseArray<String> mH263ProfileValues;
    private final SparseArray<String> mMPEG4LevelValues;
    private final SparseArray<String> mMPEG4ProfileValues;
    public static final OooO00o Companion = new OooO00o(null);
    private static final String[] MPEG4_TYPES = {"mp4", "mpeg4", "MP4", "MPEG4"};
    private static final String[] AVC_TYPES = {"avc", "h264", "AVC", "H264"};
    private static final String[] H263_TYPES = {"h263", "H263"};
    private static final String[] AAC_TYPES = {"aac", "AAC"};

    public enum CodecType {
        AVC,
        H263,
        MPEG4,
        AAC
    }

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    public final /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CodecType.values().length];
            iArr[CodecType.AVC.ordinal()] = 1;
            iArr[CodecType.H263.ordinal()] = 2;
            iArr[CodecType.MPEG4.ordinal()] = 3;
            iArr[CodecType.AAC.ordinal()] = 4;
            a = iArr;
        }
    }

    public MediaCodecListCollector() {
        super(ReportField.MEDIA_CODEC_LIST);
        this.mColorFormatValues = new SparseArray<>();
        this.mAVCLevelValues = new SparseArray<>();
        this.mAVCProfileValues = new SparseArray<>();
        this.mH263LevelValues = new SparseArray<>();
        this.mH263ProfileValues = new SparseArray<>();
        this.mMPEG4LevelValues = new SparseArray<>();
        this.mMPEG4ProfileValues = new SparseArray<>();
        this.mAACProfileValues = new SparseArray<>();
    }

    @TargetApi(16)
    private JSONObject collectCapabilitiesForType(MediaCodecInfo mediaCodecInfo, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int[] iArr = capabilitiesForType.colorFormats;
        r.m(iArr, "colorFormats");
        if (!(iArr.length == 0)) {
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(this.mColorFormatValues.get(i));
            }
            jSONObject.put("colorFormats", jSONArray);
        }
        CodecType codecTypeIdentifyCodecType = identifyCodecType(mediaCodecInfo);
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
        r.m(codecProfileLevelArr, "codecProfileLevels");
        if (!(codecProfileLevelArr.length == 0)) {
            JSONArray jSONArray2 = new JSONArray();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                int i2 = codecProfileLevel.profile;
                int i3 = codecProfileLevel.level;
                if (codecTypeIdentifyCodecType == null) {
                    jSONArray2.put(i2 + 45 + i3);
                    break;
                }
                int i4 = OooO0O0.a[codecTypeIdentifyCodecType.ordinal()];
                if (i4 == 1) {
                    String str2 = this.mAVCProfileValues.get(i2);
                    String str3 = this.mAVCLevelValues.get(i3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append((Object) str2);
                    sb.append("-");
                    sb.append((Object) str3);
                    jSONArray2.put(sb.toString());
                } else if (i4 == 2) {
                    String str4 = this.mH263ProfileValues.get(i2);
                    String str5 = this.mH263LevelValues.get(i3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) str4);
                    sb2.append("-");
                    sb2.append((Object) str5);
                    jSONArray2.put(sb2.toString());
                } else if (i4 == 3) {
                    String str6 = this.mMPEG4ProfileValues.get(i2);
                    String str7 = this.mMPEG4LevelValues.get(i3);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((Object) str6);
                    sb3.append("-");
                    sb3.append((Object) str7);
                    jSONArray2.put(sb3.toString());
                } else if (i4 == 4) {
                    jSONArray2.put(this.mAACProfileValues.get(i2));
                }
            }
            jSONObject.put("profileLevels", jSONArray2);
        }
        return jSONObject;
    }

    @TargetApi(16)
    private JSONObject collectMediaCodecList() throws JSONException {
        prepare();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        r.m(codecInfos, "MediaCodecList(MediaCode…st.ALL_CODECS).codecInfos");
        JSONObject jSONObject = new JSONObject();
        int length = codecInfos.length;
        for (int i = 0; i < length; i++) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i];
            JSONObject jSONObject2 = new JSONObject();
            r.l(mediaCodecInfo);
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            jSONObject2.put("name", mediaCodecInfo.getName()).put("isEncoder", mediaCodecInfo.isEncoder());
            JSONObject jSONObject3 = new JSONObject();
            r.m(supportedTypes, "supportedTypes");
            for (String str : supportedTypes) {
                r.m(str, "type");
                jSONObject3.put(str, collectCapabilitiesForType(mediaCodecInfo, str));
            }
            jSONObject2.put("supportedTypes", jSONObject3);
            jSONObject.put(String.valueOf(i), jSONObject2);
        }
        return jSONObject;
    }

    @TargetApi(16)
    private CodecType identifyCodecType(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        r.m(name, "codecInfo.name");
        for (String str : AVC_TYPES) {
            if (B.at(name, str, false, 2)) {
                return CodecType.AVC;
            }
        }
        for (String str2 : H263_TYPES) {
            if (B.at(name, str2, false, 2)) {
                return CodecType.H263;
            }
        }
        for (String str3 : MPEG4_TYPES) {
            if (B.at(name, str3, false, 2)) {
                return CodecType.MPEG4;
            }
        }
        for (String str4 : AAC_TYPES) {
            if (B.at(name, str4, false, 2)) {
                return CodecType.AAC;
            }
        }
        return null;
    }

    private void prepare() {
        try {
            Field[] fields = Class.forName("android.media.MediaCodecInfo$CodecCapabilities").getFields();
            r.m(fields, "codecCapabilitiesClass.fields");
            for (Field field : fields) {
                if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                    String name = field.getName();
                    r.m(name, "f.name");
                    if (ae.aq(name, COLOR_FORMAT_PREFIX, false, 2)) {
                        this.mColorFormatValues.put(field.getInt(null), field.getName());
                    }
                }
            }
            Field[] fields2 = Class.forName("android.media.MediaCodecInfo$CodecProfileLevel").getFields();
            r.m(fields2, "codecProfileLevelClass.fields");
            for (Field field2 : fields2) {
                if (Modifier.isStatic(field2.getModifiers()) && Modifier.isFinal(field2.getModifiers())) {
                    String name2 = field2.getName();
                    r.m(name2, "f.name");
                    if (ae.aq(name2, "AVCLevel", false, 2)) {
                        this.mAVCLevelValues.put(field2.getInt(null), field2.getName());
                    } else {
                        String name3 = field2.getName();
                        r.m(name3, "f.name");
                        if (ae.aq(name3, "AVCProfile", false, 2)) {
                            this.mAVCProfileValues.put(field2.getInt(null), field2.getName());
                        } else {
                            String name4 = field2.getName();
                            r.m(name4, "f.name");
                            if (ae.aq(name4, "H263Level", false, 2)) {
                                this.mH263LevelValues.put(field2.getInt(null), field2.getName());
                            } else {
                                String name5 = field2.getName();
                                r.m(name5, "f.name");
                                if (ae.aq(name5, "H263Profile", false, 2)) {
                                    this.mH263ProfileValues.put(field2.getInt(null), field2.getName());
                                } else {
                                    String name6 = field2.getName();
                                    r.m(name6, "f.name");
                                    if (ae.aq(name6, "MPEG4Level", false, 2)) {
                                        this.mMPEG4LevelValues.put(field2.getInt(null), field2.getName());
                                    } else {
                                        String name7 = field2.getName();
                                        r.m(name7, "f.name");
                                        if (ae.aq(name7, "MPEG4Profile", false, 2)) {
                                            this.mMPEG4ProfileValues.put(field2.getInt(null), field2.getName());
                                        } else {
                                            String name8 = field2.getName();
                                            r.m(name8, "f.name");
                                            if (ae.aq(name8, "AAC", false, 2)) {
                                                this.mAACProfileValues.put(field2.getInt(null), field2.getName());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | SecurityException unused) {
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        jVar.i(ReportField.MEDIA_CODEC_LIST, collectMediaCodecList());
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, ReportField reportField, b bVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(reportField, "collect");
        r.n(bVar, "reportBuilder");
        throw null;
    }
}
