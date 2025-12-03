package com.example.blogdenotas.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.blogdenotas.R;


public class LoginFragment extends Fragment {

    EditText nombreLogin;
    EditText contraseñaLogin;
    Button btnLogin;
    TextView textViewRegistrarse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        nombreLogin = view.findViewById(R.id.nombreLogin);
        contraseñaLogin = view.findViewById(R.id.contraseñaLogin);
        btnLogin = view.findViewById(R.id.btnLogin);
        textViewRegistrarse = view.findViewById(R.id.textViewRegistrarse);


        textViewRegistrarse.setOnClickListener(v -> irRegistro());
        return view;
    }


    void irRegistro(){
        Fragment registroFragment = new RegistroFragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main, registroFragment);
        transaction.commit();
    }
}