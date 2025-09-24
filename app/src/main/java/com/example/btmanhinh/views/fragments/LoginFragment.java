package com.example.btmanhinh.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.btmanhinh.R;
import com.example.btmanhinh.views.activity.MainActivity;

public class LoginFragment extends Fragment {
    private TextView txtSignup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init( view);
        setupCLickListener();
    }
    public void init(View view){
        txtSignup=view.findViewById(R.id.txt_Signup);
    }
    public void setupCLickListener(){
        txtSignup.setOnClickListener(v -> {
            if (getActivity() instanceof MainActivity) {
                ((MainActivity) getActivity()).openFragment(new SignupFragment());
            }
        });


    }

}
