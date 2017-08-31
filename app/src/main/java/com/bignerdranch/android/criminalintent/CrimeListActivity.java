package com.bignerdranch.android.criminalintent;



import android.support.v4.app.Fragment;

/**
 * Created by bnb003 on 24/08/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
