package com.amitshekhar.tflite.recipe;

import com.google.gson.annotations.SerializedName;

public class DCResponse {
    @SerializedName("recipe_nm")
    public String recipe_nm;
    @SerializedName("recipe_seq")
    public Integer recipe_seq;
    @SerializedName("cooking_no")
    public String cooking_no;
    @SerializedName("cooking_dc")
    public String cooking_dc;

    public String getRecipe_nm() {
        return recipe_nm;
    }

    public void setRecipe_nm(String recipe_nm) {
        this.recipe_nm = recipe_nm;
    }

    public Integer getRecipe_seq() {
        return recipe_seq;
    }

    public void setRecipe_seq(Integer recipe_seq) {
        this.recipe_seq = recipe_seq;
    }

    public String getCooking_no() {
        return cooking_no;
    }

    public void setCooking_no(String cooking_no) {
        this.cooking_no = cooking_no;
    }

    public String getCooking_dc() {
        return cooking_dc;
    }

    public void setCooking_dc(String cooking_dc) {
        this.cooking_dc = cooking_dc;
    }
}
