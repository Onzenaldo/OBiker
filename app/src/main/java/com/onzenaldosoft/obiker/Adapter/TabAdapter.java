package com.onzenaldosoft.obiker.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.onzenaldosoft.obiker.fragment.ContatosFragment;
import com.onzenaldosoft.obiker.fragment.ConversasFragment;
import com.onzenaldosoft.obiker.fragment.MapsFragmenty;

/**
 * Created by Junior on 20/02/2018.
 */

public class TabAdapter extends FragmentStatePagerAdapter {

    private String[] titulosAbas = {"CONVERSAS", "CONTATOS", "MAPA"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0 :
                fragment = new ConversasFragment();
                break;
            case 1 :
                fragment = new ContatosFragment();
                break;
            case 2 :
                fragment = new MapsFragmenty();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return titulosAbas.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulosAbas[position];
    }
}
