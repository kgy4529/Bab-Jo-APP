package com.amitshekhar.tflite.recipe;

public class RecycleData {
    private int re_seq;
    private String re_name;
    private String re_content;
    private int re_profile;

    public RecycleData() {
        this.re_seq = re_seq;
        this.re_name = re_name;
        this.re_content = re_content;
    }

    public RecycleData(Integer re_seq) {
        this.re_seq = re_seq;
    }


    public int getRe_seq() {
        return re_seq;
    }

    public void setRe_seq(int re_seq) {
        this.re_seq = re_seq;
    }

    public String getRe_name() {
        return re_name;
    }

    public void setRe_name(String re_name) {
        this.re_name = re_name;
    }

    public String getRe_content() {
        return re_content;
    }

    public void setRe_content(String re_content) {
        this.re_content = re_content;
    }

    public int getRe_profile() { return re_profile; }

    public void setRe_profile(int re_profile) { this.re_profile = re_profile; }
}
