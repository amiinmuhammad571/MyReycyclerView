package com.madev.myreycyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class President {
    private String name;
    private String remarks;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() { return remarks; }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



}
