package com.example.tads.trabalhodialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.DatePicker;

import java.util.Locale;

public class Data extends AppCompatDialogFragment implements DatePickerDialog.OnDateSetListener{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(), this, 2017, 11, 14);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        String msg = String.format(new Locale("pt", "BR"), "%02d/%02d/%2d", i2, i1, i);

    }
}
