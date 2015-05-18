package com.arif.fragmenttest;

import android.app.ListFragment;

/**
 * Created by arif on 5/18/15.
 */
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends ListFragment {
    String[] Name = new String[] { "ARIF","ANDALIB","MANIK","ATANU","SHUVRO","HIZBUL","CHANDAN","TAUHID","SHANTO"};
    String[] Roll = new String[]{"090212","090207","090233","090224","090211","090225","060234","090235","090223"};
    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Roll);
        setListAdapter(adapter);

        return view;

    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        TextFragment txt = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(Roll[position],"Name : "+Name[position]);
        getListView().setSelector(android.R.color.darker_gray);
    }
}