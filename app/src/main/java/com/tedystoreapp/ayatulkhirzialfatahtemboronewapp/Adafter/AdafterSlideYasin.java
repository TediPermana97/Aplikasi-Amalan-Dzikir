package com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.Adafter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.R;


public class AdafterSlideYasin extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public AdafterSlideYasin(Context context) {
        this.context = context;
    }

    public int[] id = {
            13,
            14,
            15,
            16,
            17,
            18,
            19,
            20,
            21,
            22,
            23,
            24,
            25

    };

    public int[] slide_image = {
            R.drawable.a13,
            R.drawable.a14,
            R.drawable.a15,
            R.drawable.a16,
            R.drawable.a17,
            R.drawable.a18,
            R.drawable.a19,
            R.drawable.a20,
            R.drawable.a21,
            R.drawable.a22,
            R.drawable.a23,
            R.drawable.a24,
            R.drawable.a25,
    };

    @Override
    public int getCount() {
        return slide_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_yasin, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.idyasin);

        slideImageView.setImageResource(slide_image[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
