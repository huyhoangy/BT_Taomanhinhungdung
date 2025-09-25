package com.example.btmanhinh.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.btmanhinh.R;
import com.example.btmanhinh.views.activity.MainActivity;

public class SignupFragment extends Fragment {
    private Button btnCreate;
    private TextView txtLogin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signup, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init( view);
        setupCLickListener();
    }
    public void init(View view){
        btnCreate=view.findViewById(R.id.btn_Create);
        txtLogin=view.findViewById(R.id.txt_Login);
    }
    private  void setupCLickListener(){
        btnCreate.setOnClickListener(v->{
            if(getActivity() instanceof MainActivity){
                ((MainActivity) getActivity()).openFragment(new LoginFragment());
            }
        });
        txtLogin.setOnClickListener(v->{
            if(getActivity() instanceof MainActivity){
                ((MainActivity ) getActivity()).openFragment(new LoginFragment());
            }
        });

    }

}
