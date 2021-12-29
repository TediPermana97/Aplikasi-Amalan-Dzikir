package com.tedystoreapp.ayatulkhirzialfatahtemboronewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aliendroid.alienads.AlienGDPR;
import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidInitialize;
import com.aliendroid.alienads.AliendroidIntertitial;
import com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.Adafter.AdapterSlideAyatulkhirzi;

import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.BACKUP_ADS_BANNER;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.BACKUP_ADS_INTER;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.CHILD_DIRECT_GDPR;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.HIGH_PAYING_KEYWORD1;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.HIGH_PAYING_KEYWORD2;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.HIGH_PAYING_KEYWORD3;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.HIGH_PAYING_KEYWORD4;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.HIGH_PAYING_KEYWORD5;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.INITIALIZE_SDK;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.INITIALIZE_SDK_BACKUP_ADS;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.MAIN_ADS_BANNER;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.MAIN_ADS_INTER;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.SELECT_ADS;
import static com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config.Settings.SELECT_BACKUP_ADS;

public class AyatulkhirziActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private AdapterSlideAyatulkhirzi sliderAdapter;
    private TextView[] mDots;
    private int CurrentPage;

    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayatulkhirzi);




        //-----------------ads------------

        AlienGDPR.loadGdpr(this,SELECT_ADS,CHILD_DIRECT_GDPR);
        switch (SELECT_ADS) {
            case "ADMOB":
                AliendroidInitialize.SelectAdsAdmob(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "GOOGLE-ADS":
                AliendroidInitialize.SelectAdsGoogleAds(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "APPLOVIN-D":
                AliendroidInitialize.SelectAdsApplovinDis(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "APPLOVIN-D-NB":
                AliendroidInitialize.SelectAdsApplovinDis(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "APPLOVIN-M":
                AliendroidInitialize.SelectAdsApplovinMax(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "APPLOVIN-M-NB":
                AliendroidInitialize.SelectAdsApplovinMax(this, SELECT_BACKUP_ADS, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "MOPUB":
                AliendroidInitialize.SelectAdsMopub(this, SELECT_BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "IRON":
                AliendroidInitialize.SelectAdsIron(this, SELECT_BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "STARTAPP":
                AliendroidInitialize.SelectAdsStartApp(this, SELECT_BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "UNITY":
                AliendroidInitialize.SelectAdsUnity(this, SELECT_BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUP_ADS);
                break;
            case "FACEBOOK":
                AliendroidInitialize.SelectAdsFAN(this, SELECT_BACKUP_ADS,  INITIALIZE_SDK_BACKUP_ADS);
                break;
        }
        RelativeLayout layAdsbanner = findViewById(R.id.layAds);
        switch (SELECT_ADS) {
            case "ADMOB":
                AliendroidBanner.SmallBannerAdmob(this,layAdsbanner,SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER, HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                AliendroidIntertitial.LoadIntertitialAdmob(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER, HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                break;
            case "APPLOVIN-M":
                AliendroidBanner.SmallBannerApplovinMax(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialApplovinMax(this, SELECT_BACKUP_ADS,MAIN_ADS_INTER,BACKUP_ADS_INTER);
                break;
            case "APPLOVIN-M-NB":
                AliendroidIntertitial.LoadIntertitialApplovinMax(this, SELECT_BACKUP_ADS,MAIN_ADS_INTER,BACKUP_ADS_INTER);
                break;
            case "APPLOVIN-D":
                AliendroidBanner.SmallBannerApplovinDis(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialApplovinDis(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "APPLOVIN-D-NB":
                AliendroidIntertitial.LoadIntertitialApplovinDis(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "MOPUB" :
                AliendroidBanner.SmallBannerMopub(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialMopub(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER,BACKUP_ADS_INTER);
                break;
            case "STARTAPP":
                AliendroidBanner.SmallBannerStartApp(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialStartApp(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "IRON":
                AliendroidBanner.SmallBannerIron(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialIron(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "FACEBOOK":
                AliendroidBanner.SmallBannerFAN(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialFAN(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "UNITY":
                AliendroidBanner.SmallBannerUnity(this, layAdsbanner, SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialUnity(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
            case "GOOGLE-ADS":
                AliendroidBanner.SmallBannerGoogleAds(this,layAdsbanner,SELECT_BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                AliendroidIntertitial.LoadIntertitialGoogleAds(this, SELECT_BACKUP_ADS, MAIN_ADS_INTER, BACKUP_ADS_INTER);
                break;
        }

        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mSlideViewPager = findViewById(R.id.SlideViewPager);
        mDotLayout = findViewById(R.id.dotSlayout);

        sliderAdapter = new AdapterSlideAyatulkhirzi(AyatulkhirziActivity.this);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewList);

    }

    public void addDotsIndicator(int posistion){
        mDots = new TextView[12];
        mDotLayout.removeAllViews();
        for (int i = 0;i <mDots.length;i++){
            mDots[i] = new TextView(AyatulkhirziActivity.this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimary));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[posistion].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewList = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {
        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            CurrentPage = i;

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };


}