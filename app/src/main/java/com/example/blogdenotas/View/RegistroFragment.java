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

import org.w3c.dom.Text;


public class RegistroFragment extends Fragment {
    EditText nombreUserRegistro;
    EditText contraseñaRegistro;
    EditText contraseña2Registro;
    Button btnSeguirRegistro;
    TextView textViewVolverALogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registro,container,false);
        nombreUserRegistro = view.findViewById(R.id.nombreUserRegistro);
        contraseñaRegistro = view.findViewById(R.id.contraseñaRegistro);
        contraseña2Registro = view.findViewById(R.id.contraseña2Registro);
        btnSeguirRegistro = view.findViewById(R.id.btnSeguirRegistro);
        textViewVolverALogin = view.findViewById(R.id.textViewVolverALogin);

        textViewVolverALogin.setOnClickListener(v -> volverLogin());
        return inflater.inflate(R.layout.fragment_registro, container, false);
    }


    void volverLogin(){
        Fragment loginFragment = new LoginFragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main, loginFragment);
        transaction.commit();
    }

    void seguirRegistro(){
        Fragment registro2Fragment = new Registro2Fragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main, registro2Fragment);
        transaction.commit();
    }
}