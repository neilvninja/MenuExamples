package com.menu.neil.menuexamples;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) { //to build the dialog

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setMessage("Sample dialog - testing");
        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() { //set ok button
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Yh you clicked", Toast.LENGTH_SHORT).show(); //if they click on the ok button
            }
        });

        theDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { //set cancel button
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Yh you clicked cancel you bum", Toast.LENGTH_SHORT).show(); //if they click on the cancel button
            }
        });

        return theDialog.create();
    }
}
