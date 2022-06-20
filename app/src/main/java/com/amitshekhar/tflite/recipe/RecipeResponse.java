package com.amitshekhar.tflite.recipe;

import com.google.gson.annotations.SerializedName;

public class RecipeResponse {

    @SerializedName("recipe_seq")
    public Integer recipe_seq;
    @SerializedName("recipe_nm")
    public String recipe_nm;
    @SerializedName("recipe_sumry")
    public String recipe_sumry;
    @SerializedName("cooking_no")
    public String cooking_no;

    public Integer getRecipe_seq() {
        return recipe_seq;
    }

    public void setRecipe_seq(Integer recipe_seq) {
        this.recipe_seq = recipe_seq;
    }

    public String getRecipe_nm() {
        return recipe_nm;
    }

    public void setRecipe_nm(String recipe_nm) {
        this.recipe_nm = recipe_nm;
    }

    public String getRecipe_sumry() {
        return recipe_sumry;
    }

    public void setRecipe_sumry(String recipe_sumry) {
        this.recipe_sumry = recipe_sumry;
    }

    public String getCooking_no() {
        return cooking_no;
    }

    public void setCooking_no(String cooking_no) {
        this.cooking_no = cooking_no;
    }

    public RecipeResponse(Integer recipe_seq, String recipe_nm, String recipe_sumry){
        this.recipe_seq = recipe_seq;
        this.recipe_nm = recipe_nm;
        this.recipe_sumry = recipe_sumry;
    }
}
