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
public class FtocFragment extends Fragment implements View.OnClickListener {

    private Button btnFtoc;
    private EditText etFtoc;


    public FtocFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ftoc, container, false);
        etFtoc = view.findViewById(R.id.etFtoc);
        btnFtoc = view.findViewById(R.id.btnFtoc);

        btnFtoc.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float ftocValue = Float.parseFloat(etFtoc.getText().toString());
        float ftocResult = 5*(ftocValue-32)/9;

        Toast.makeText(getActivity(),"Celcius is: " +ftocResult,Toast.LENGTH_LONG).show();

    }
}