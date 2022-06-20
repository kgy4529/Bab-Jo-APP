package com.amitshekhar.tflite;

import com.amitshekhar.tflite.recipe.DCResponse;
import com.amitshekhar.tflite.recipe.RecipeResponse;
import com.amitshekhar.tflite.refri.FoodRequest;
import com.amitshekhar.tflite.refri.FoodResponse;
import com.amitshekhar.tflite.users.JoinReqRes;
import com.amitshekhar.tflite.users.LoginRequest;
import com.amitshekhar.tflite.users.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {


    @POST("users/login")
//    Call<MemberVO> getMember(@Query("user_email") String user_email, @Query("user_pwd") String user_pwd);
    Call<LoginResponse> getMember(@Body LoginRequest loginRequest);

    @POST("users/join")
    Call<JoinReqRes> userAdd(@Body JoinReqRes joinReqRes);

    @POST("refri/refriUpdate")
    Call<List<FoodResponse>> foodUpdate(@Body List<FoodRequest> foodRequests);

    @GET("recipe/user/{user_seq}")
    Call<List<RecipeResponse>> getRecipe(@Path("user_seq") Integer user_seq);

    @GET("recipe/{recipe_seq}")
    Call<List<DCResponse>> getDetail(@Path("recipe_seq") Integer recipe_seq);
}