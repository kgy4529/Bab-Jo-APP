package com.amitshekhar.tflite;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ValidateRequest extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL= "https://10.1.4.116/UserValidate.php";
    private Map<String, String> map;

    public ValidateRequest(String UserEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener,null);

        map = new HashMap<>();
        map.put("UserEmail", UserEmail);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> params = new HashMap<>();
        params.put("UserEmail", "id");
        return params;
    }
}
// -------------------------ID 중복 확인------------------------
