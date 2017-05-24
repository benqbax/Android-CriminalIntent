package com.example.benforsrup.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Ben on 2017-05-24.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
