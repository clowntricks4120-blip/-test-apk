package ivas.gov.bisp.enumeration.bK;

import android.app.AlertDialog;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;

/* JADX INFO: loaded from: classes.dex */
public class w implements LocationListener {
    private static int a = 1;
    private static int b;
    public AppCompatActivity c;
    public LocationManager d;
    public boolean e;

    public w(AppCompatActivity appCompatActivity) {
        this.e = false;
        this.c = appCompatActivity;
        LocationManager locationManager = (LocationManager) appCompatActivity.getSystemService("location");
        this.d = locationManager;
        boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
        this.e = zIsProviderEnabled;
        if (!zIsProviderEnabled) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
            builder.setTitle("GPS is not Enabled!");
            builder.setMessage("Do you want to turn on GPS?");
            builder.setPositiveButton("Yes", new ap(this));
            k kVar = new k(this);
            int i = b;
            int i2 = (i & 45) + (i | 45);
            a = i2 % 128;
            int i3 = i2 % 2;
            builder.setNegativeButton("No", kVar);
            builder.show();
            int i4 = b;
            int i5 = (i4 & 39) + (i4 | 39);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
                return;
            }
            return;
        }
        try {
            String bestProvider = this.d.getBestProvider(new Criteria(), false);
            int i7 = a;
            int i8 = (i7 & 17) + (i7 | 17);
            b = i8 % 128;
            int i9 = i8 % 2;
            BISPApplication.d = this.d.getLastKnownLocation(bestProvider);
            int i10 = b;
            int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } catch (SecurityException unused) {
        }
        c();
        int i14 = a;
        int i15 = i14 & 19;
        int i16 = -(-((i14 ^ 19) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public final void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 83) + (i2 | 83);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        try {
            if (this.e) {
                int i6 = i4 & 67;
                int i7 = (i6 - (~((i4 ^ 67) | i6))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                this.d.requestLocationUpdates("gps", 1000L, 2.0f, this);
                int i9 = a;
                int i10 = ((i9 & 80) + (i9 | 80)) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        } catch (SecurityException unused) {
        }
        int i12 = a;
        int i13 = (i12 ^ 7) + ((i12 & 7) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 12 / 0;
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = (i2 ^ 7) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        BISPApplication.d = location;
        int i7 = a;
        int i8 = (i7 ^ 47) + ((i7 & 47) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = i3 + ((i2 ^ 19) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        c();
        int i6 = b;
        int i7 = i6 & 91;
        int i8 = ((((i6 ^ 91) | i7) << 1) - (~(-((i6 | 91) & (~i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 46) + (i3 | 46)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        LocationManager locationManager = this.d;
        if (locationManager != null) {
            int i7 = i2 & 123;
            int i8 = -(-(i2 | 123));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            locationManager.removeUpdates(this);
            int i11 = b;
            int i12 = ((i11 & 117) - (~(-(-(i11 | 117))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = i14 & 83;
        int i16 = ((i14 ^ 83) | i15) << 1;
        int i17 = -((i14 | 83) & (~i15));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
    }
}
