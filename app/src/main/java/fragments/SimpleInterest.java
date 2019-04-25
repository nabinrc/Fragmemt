package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragmemt.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment implements View.OnClickListener{

    EditText etPrinciple,etTime,etRate;
    Button btnInterest;


    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrinciple = view.findViewById(R.id.etPrinciple);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        btnInterest = view.findViewById(R.id.btnInterest);

        btnInterest.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        float Pvalue=Float.parseFloat(etPrinciple.getText().toString());
        float Tvalue=Float.parseFloat(etTime.getText().toString());
        float Rvalue=Float.parseFloat(etRate.getText().toString());

        float Iresult = (Pvalue*Tvalue*Rvalue)/100;

        Toast.makeText(getActivity(),"Your Interest is: " +Iresult,Toast.LENGTH_LONG).show();

    }
}