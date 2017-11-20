package com.example.a21650521.appfragmentoestatico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContadorFragment extends Fragment {


    public ContadorFragment() {
        // Required empty public constructor
    }
    private EditText et;
    private TextView tv;
    private Button btn;
    private int numChar = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contador, container, false);
        et = (EditText)view.findViewById(R.id.etTexto);
        tv = (TextView)view.findViewById(R.id.tvNumCaracteres);
        btn = (Button)view.findViewById(R.id.btnText);
        tv.setText(String.format(getString(R.string.tvText),numChar));


        btn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){

                numChar = et.getText().toString().length();
                tv.setText(String.format(getString(R.string.tvText),numChar));
            }
        });

        return view;
    }

}
