package com.kartal.navigationdrawer2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class DovizFragment extends Fragment {

    Spinner spinnerFrom, spinnerTo;
    EditText inputMiktar;
    Button cevir;






    public DovizFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_doviz, container, false);

       inputMiktar = v.findViewById(R.id.miktar);
       spinnerFrom = v.findViewById(R.id.spFrom);
       spinnerTo = v.findViewById(R.id.spTo);
       cevir = v.findViewById(R.id.cevir);


        String[] from = {"TL","DOLAR","EURO"} ;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, from);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerFrom.setAdapter(adapter);


        String[] to = {"TL","DOLAR","EURO"} ;

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, from);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerTo.setAdapter(adapter1);


        cevir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double hesap ;

                Double miktar = Double.parseDouble(inputMiktar.getText().toString());

                if (spinnerFrom.getSelectedItem().toString() == "DOLAR" && spinnerTo.getSelectedItem().toString() == "TL") {

                    hesap = miktar / 7.40 ;


                }


            }
        });


        return v;








    }








}