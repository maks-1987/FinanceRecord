package android.mmtech.financerecord;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    final static String TAG = "home_frag_tag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.home_fragment, null);
    }

    void showHomeFragment() {
        HomeFragment homeFragment = (HomeFragment)
                getFragmentManager().findFragmentByTag(TAG);

        if (homeFragment == null) {
            homeFragment = new HomeFragment();
        }

//        FragmentTransaction editAttrTransaction = getFragmentManager().beginTransaction();
//        editAttrTransaction.replace(R.id.new_vehicle_container, serviceInfoFragment, UiUtil.F_SERVICE_INFO);
//        editAttrTransaction.commit();
    }
/*    @Override
    public void onDestroy() {
        super.onDestroy();
        new AlertDialog.Builder(HomeFragment)
                .setTitle("Title")
                .setMessage("Do you really want to whatever?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(MainActivity.this, "Yaay", Toast.LENGTH_SHORT).show();
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }*/

}
