package com.amitshekhar.tflite.refri;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by amitshekhar on 17/03/18.
 */

public interface Classifier {

    class Recognition {
        private final String id;
        private final String title;
        private final boolean quant; //모델의 양자화 또는 부동가중치를 가지는 지 알아보기 위한 변수
        private final Float confidence; //인식률

        public Recognition(
                final String id, final String title, final Float confidence, final boolean quant) {
            this.id = id;
            this.title = title;
            this.confidence = confidence;
            this.quant = quant;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public Float getConfidence() {
            return confidence;
        }

        @Override
        public String toString() {
            String resultString = "";
//            if (id != null) {
//                resultString += "[" + id + "] ";
//            }

            if (title != null) {
                resultString += title + " ";
            }
//
//            if (confidence != null) {
//                resultString += String.format("(%.1f%%) ", confidence * 100.0f);
//            }

            return resultString.trim();
        }

    }


    List<Recognition> recognizeImage(Bitmap bitmap);

    void close();
}
