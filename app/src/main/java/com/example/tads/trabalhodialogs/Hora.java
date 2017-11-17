package com.example.tads.trabalhodialogs;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.TimePicker;

public class Hora extends AppCompatDialogFragment implements TimePickerDialog.OnTimeSetListener{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TimePickerDialog(getActivity(), this, 8, 45, false);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        String msg = String.format("%02d:%02d", i, i1);
    }
}
