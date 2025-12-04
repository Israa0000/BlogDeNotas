package com.example.blogdenotas.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.blogdenotas.R;

public class Registro2Fragment extends Fragment {

    EditText nombreRealRegistro;
    EditText apellidosRegistro;
    EditText fechaNacimentoRegistro;
    Button btnTerminarRegistro;
    TextView textViewVolverARegistro;
    TextView textViewVolverALogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registro2,container, false);
        nombreRealRegistro = view.findViewById(R.id.nombreRealRegistro);
        apellidosRegistro = view.findViewById(R.id.apellidosRegistro);
        fechaNacimentoRegistro = view.findViewById(R.id.fechaNacimentoRegistro);
        btnTerminarRegistro = view.findViewById(R.id.btnTerminarRegistro);
        textViewVolverARegistro = view.findViewById(R.id.textViewVolverRegistro2);
        textViewVolverALogin = view.findViewById(R.id.textViewVolverALogin2);



        return view;
    }

    void filtrarFecha(){
        String fecha = fechaNacimentoRegistro.getText().toString();
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (fecha.matches(regex)){
            Toast.makeText(getContext(), "formato de fecha valido", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "formato de fecha invalido", Toast.LENGTH_SHORT).show();

        }

    }
}