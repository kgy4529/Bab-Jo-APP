package com.amitshekhar.tflite.recipe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amitshekhar.tflite.JsonPlaceHolderApi;
import com.amitshekhar.tflite.R;
import com.amitshekhar.tflite.RetrofitClient;
import com.amitshekhar.tflite.users.LoginData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecipePage extends Fragment{

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    final private static String TAG = "RecipePage";

    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private TextView recipeCount;

    private RetrofitClient retrofitClient;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

    public RecipePage() {
        // Required empty public constructor
    }

    public static RecipePage newInstance(String param1, String param2) {
        RecipePage fragment = new RecipePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipe_page, container, false);

        recipeCount = (TextView) view.findViewById(R.id.recipeCount) ; //?????? ???????????? ?????? ??? ?????? ????????? ??????
        recyclerView  = (RecyclerView) view.findViewById(R.id.recyclerView);

        Log.i(TAG,"?????? ????????? ???????????? ??????");

        // ----------------------------------------------------------------------------------------------------
        Log.i(TAG,"?????????????????? ??????");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();

        Integer user_seq = Integer.parseInt(LoginData.loginUser.getUserSeq()); //????????? ???????????? ?????? ?????? ?????? ??????
        Log.i(TAG, "Recipe_seq >> " + user_seq);
        RecipeGet(user_seq);

        return view;
    }

    public void RecipeGet(Integer user_seq){
        //retrofit ??????
        retrofitClient = RetrofitClient.getInstance();
        jsonPlaceHolderApi = RetrofitClient.getRetrofitInterface();

        jsonPlaceHolderApi.getRecipe(user_seq).enqueue(new Callback<List<RecipeResponse>>() {
            @Override
            public void onResponse(Call<List<RecipeResponse>> call, Response<List<RecipeResponse>> response) {
                Log.d("<< retrofit - Recipe >>", "Data fetch success");

                //?????? ??????
                if (response.isSuccessful() && response.body() != null) {

                    //response.body()??? result??? ??????
                    List<RecipeResponse> result = response.body();


                    for(int i=0; i<result.size();i++){
                        //??? List??? ????????? data ????????? set????????????.
                        RecycleData data = new RecycleData();
                        data.setRe_seq(result.get(i).recipe_seq);
                        data.setRe_name(result.get(i).recipe_nm);
                        data.setRe_content(result.get(i).recipe_sumry);
                        adapter.addItem(data);
                    }
                    recipeCount.setText(result.size() + "?????? ???????????? ?????? ??? ????????????.");

                    recyclerView.setAdapter(adapter);

                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("??????")
                            .setMessage("????????? ?????? ????????? ?????????????????????. /n ??????????????? ??????????????????.")
                            .setPositiveButton("??????", null)
                            .create()
                            .show();
                }
            }

            @Override
            public void onFailure(Call<List<RecipeResponse>> call, Throwable t) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("??????")
                        .setMessage("????????? ?????? ????????? ?????????????????????. /n ??????????????? ??????????????????.")
                        .setPositiveButton("??????", null)
                        .create()
                        .show();
            }
        });
    }


}
