package com.amitshekhar.tflite.refri;

import com.google.gson.annotations.SerializedName;

public class FoodResponse {
    @SerializedName("refriUserSeq")
    public String refriUserSeq;
    @SerializedName("foodCode")
    public String foodCode;
    @SerializedName("refriFoodCpcty")
    public String refriFoodCpcty;
    @SerializedName("foodNm")
    public String foodNm;

    public String getRefriUserSeq() {
        return refriUserSeq;
    }

    public void setRefriUserSeq(String refriUserSeq) {
        this.refriUserSeq = refriUserSeq;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getRefriFoodCpcty() {
        return refriFoodCpcty;
    }

    public void setRefriFoodCpcty(String refriFoodCpcty) {
        this.refriFoodCpcty = refriFoodCpcty;
    }

    public String getFoodNm() {
        return foodNm;
    }

    public void setFoodNm(String foodNm) {
        this.foodNm = foodNm;
    }

    @Override
    public String toString() {
        return "FoodResponse{" +
                "refriUserSeq='" + refriUserSeq + '\'' +
                ", foodCode='" + foodCode + '\'' +
                ", refriFoodCpcty='" + refriFoodCpcty + '\'' +
                ", foodNm='" + foodNm + '\'' +
                '}';
    }
}
