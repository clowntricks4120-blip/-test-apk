package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;

/* JADX INFO: loaded from: classes.dex */
public class PersonInfo extends SugarRecord {
    public String cnic;
    public String contact;
    public String name;
    public byte[] pic;
    public String picName;

    public PersonInfo(String str, String str2, String str3) {
        this.name = str;
        this.contact = str2;
        this.cnic = str3;
    }

    public PersonInfo(PersonInfo personInfo) {
        this.name = personInfo.name;
        this.contact = personInfo.contact;
        this.cnic = personInfo.cnic;
        this.pic = personInfo.pic;
        this.picName = personInfo.picName;
    }

    public PersonInfo() {
    }
}
