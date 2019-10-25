package android.mmtech.financerecord;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


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

}
