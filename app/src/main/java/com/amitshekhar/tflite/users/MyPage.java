package com.amitshekhar.tflite.users;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.amitshekhar.tflite.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyPage extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    final private static String TAG = "MyPage";

    TextView nameT, emailT, sexT, ageT;
    private String UserEmail, UserPwd, UserName, UserSex;
    int UserAge;


    private String mParam1;
    private String mParam2;

    public MyPage() {
        // Required empty public constructor
    }

    public static MyPage newInstance(String param1, String param2) {
        MyPage fragment = new MyPage();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_page, container, false);
        nameT = (TextView) view.findViewById(R.id.text_nm);
        emailT = (TextView) view.findViewById(R.id.text_email);
        sexT = (TextView) view.findViewById(R.id.text_gend);
        ageT = (TextView) view.findViewById(R.id.text_age);

        if(LoginData.loginUser != null){
            nameT.setText(LoginData.loginUser.getUserName());
            emailT.setText(LoginData.loginUser.getUserEmail());
            sexT.setText(LoginData.loginUser.getUserSex());
            ageT.setText(String.valueOf(LoginData.loginUser.getUserAge()));

        }
        else{
            Log.i(TAG, "로그인한 사용자 정보가 없습니다.");
        }

        return view;
    }
}