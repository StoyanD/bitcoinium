
package com.veken0m.cavirtex.exchanges;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.veken0m.cavirtex.BaseExchangeFragment;
import com.veken0m.cavirtex.R;

public class CampBXFragment extends BaseExchangeFragment {

    public CampBXFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        buildMenu(view, CAMPBX, false);
        return view;
    }

}