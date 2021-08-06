package com.kartal.navigationdrawer2;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AnasayfaFragment extends Fragment {

    CardView profilcard,notcard,gezdimcard,resimcard ;



    public AnasayfaFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_anasayfa, container, false);

        profilcard = (CardView) view.findViewById(R.id.profil_card);
        notcard = (CardView) view.findViewById(R.id.not_card);
        gezdimcard = (CardView) view.findViewById(R.id.gezdim_card);
        resimcard = (CardView) view.findViewById(R.id.resim_card);


        profilcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProfilYonlendirme.class);
                startActivity(intent);
            }
        });

        notcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),NotlarYonlendirme.class);
                startActivity(intent);
            }
        });


        gezdimcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),GezdimYonlendirme.class);
                startActivity(intent);
            }
        });


        resimcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ResimYonlendirme.class);
                startActivity(intent);
            }
        });


        return view;
    }
}