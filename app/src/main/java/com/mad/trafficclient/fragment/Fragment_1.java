/**
 *
 */
package com.mad.trafficclient.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.mad.trafficclient.R;


public class Fragment_1 extends Fragment implements View.OnClickListener {

    private TextView mTvBalance;
    private Spinner mSp;
    private EditText mEditText;
    private Button mBtSelect;
    private Button mBtRecharge;

    private int carid = 0;
    private TextView te_1_1;
    private Spinner sp_1_1;
    private Button btn_1_1;
    private Button btn_1_2;


//    String url = ""
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_layout01, container, false);
        initView(view);


        return view;
    }


    @Override
    public void onClick(View v) {

    }

    private void initView(View view) {
        te_1_1 = (TextView) view.findViewById(R.id.te_1_1);
        sp_1_1 = (Spinner) view.findViewById(R.id.sp_1_1);
        btn_1_1 = (Button) view.findViewById(R.id.btn_1_1);
        btn_1_2 = (Button) view.findViewById(R.id.btn_1_2);

        btn_1_1.setOnClickListener(this);
        btn_1_2.setOnClickListener(this);
    }
}
