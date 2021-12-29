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

public class AdapterSlideAyatulkhirzi extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public AdapterSlideAyatulkhirzi(Context context){
        this.context = context;
    }
    public int[] id ={
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12
    };

    public int[] slide_image ={
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10,
            R.drawable.a11,
            R.drawable.a12,
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
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_ayatulkhirzi,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.idayatulkhirzi);

        slideImageView.setImageResource(slide_image[position]);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
