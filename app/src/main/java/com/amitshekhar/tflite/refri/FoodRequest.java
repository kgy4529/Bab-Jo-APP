package com.amitshekhar.tflite.refri;

import com.google.gson.annotations.SerializedName;

public class FoodRequest {
    @SerializedName("refriUserSeq")
    public String refriUserSeq;
    @SerializedName("cdNm")
    public String cdNm;

    public String getRefriUserSeq() {
        return refriUserSeq;
    }

    public void setRefriUserSeq(String refriUserSeq) {
        this.refriUserSeq = refriUserSeq;
    }

    public String getCdNm() {
        return cdNm;
    }

    public void setCdNm(String cdNm) {
        this.cdNm = cdNm;
    }

    public FoodRequest(String refriUserSeq, String cdNm){
        this.refriUserSeq = refriUserSeq;
        this.cdNm = cdNm;
    }
}
