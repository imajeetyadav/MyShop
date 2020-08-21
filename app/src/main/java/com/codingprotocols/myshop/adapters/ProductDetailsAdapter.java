package com.codingprotocols.myshop.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.codingprotocols.myshop.fragments.ProductDescriptionFragment;
import com.codingprotocols.myshop.fragments.ProductSpecificationFragment;


public class ProductDetailsAdapter extends FragmentStatePagerAdapter {
    private int totalTab;

    public ProductDetailsAdapter(@NonNull FragmentManager fm, int totalTab) {

        super(fm, totalTab);
        this.totalTab=totalTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ProductDescriptionFragment();
            case 1:
                return new ProductSpecificationFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTab;
    }
}
