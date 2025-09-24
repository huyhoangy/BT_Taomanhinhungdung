package com.example.btmanhinh.views.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.btmanhinh.R;
// Nhớ import đúng đường dẫn tới LoginFragment của bạn
import com.example.btmanhinh.views.fragments.LoginFragment;
import com.example.btmanhinh.views.fragments.SignupFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment_container_view, LoginFragment.class, null)
                    .commit();
        }
    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container_view, fragment);


        transaction.addToBackStack(null);

        transaction.commit();
    }
}