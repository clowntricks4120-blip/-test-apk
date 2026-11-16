package androidx.media;

import android.support.v4.media.session.IMediaSession;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b != audioAttributesImplBase.b) {
            return false;
        }
        int i2 = this.c;
        int i3 = audioAttributesImplBase.c;
        int i4 = audioAttributesImplBase.d;
        if (i4 == -1) {
            int i5 = audioAttributesImplBase.a;
            int i6 = AudioAttributesCompat.a;
            if ((i3 & 1) != 1) {
                i = 4;
                if ((i3 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                        default:
                            i = 3;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
        } else {
            i = i4;
        }
        if (i == 6) {
            i3 |= 4;
        } else if (i == 7) {
            i3 |= 1;
        }
        return i2 == (i3 & 273) && this.a == audioAttributesImplBase.a && this.d == i4;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        String strO;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.a;
        int i2 = AudioAttributesCompat.a;
        switch (i) {
            case 0:
                strO = "USAGE_UNKNOWN";
                break;
            case 1:
                strO = "USAGE_MEDIA";
                break;
            case 2:
                strO = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strO = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strO = "USAGE_ALARM";
                break;
            case 5:
                strO = "USAGE_NOTIFICATION";
                break;
            case 6:
                strO = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strO = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strO = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strO = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strO = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strO = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strO = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strO = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                strO = "USAGE_GAME";
                break;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
            default:
                strO = ivas.gov.bisp.enumeration.p091n.j.o("unknown usage ", i);
                break;
            case 16:
                strO = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strO);
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
