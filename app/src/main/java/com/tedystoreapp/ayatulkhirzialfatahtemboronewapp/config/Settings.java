package com.tedystoreapp.ayatulkhirzialfatahtemboronewapp.config;

public class Settings {



    public static final String FOLDER_ID ="";
    public static final String API_KEY="AIzaSyC7XwWbw_R6Qtev-QzoXdomsztXvR2wDnA";

    /*
   Please upload wallgdrive.json to your google drive
   and get FILE_ID = JSON_ID
    */
    public static final String JSON_ID="1SujymYdEWOSgVqY8RdXUkczq-vrdM8Ch";


    /*
   ON_OFF_ADS ="0" offline ads, get data from Settings.java
   ON_OFF_ADS ="1" online ads, get data from url json
    */
    public static String ON_OFF_ADS = "1";

    /*
     SELECT_ADS="ADMOB"
     SELECT_ADS="APPLOVIN-M" for MAx and SELECT_ADS="APPLOVIN-D" for Discovery
     SELECT_ADS="STARTAPP"
     SELECT_ADS="MOPUB"
     SELECT_ADS="IRON"
     SELECT_ADS="FACEBOOK"
     SELECT_ADS="UNITY"
     SELECT_ADS="GOOGLE-ADS"

     Admob can't bakup with Google Ads Manager
    */
    public static String SELECT_ADS = "ADMOB";

    /*
      SELECT_ADS="APPLOVIN-M" for MAx and SELECT_ADS="APPLOVIN-D" for Discovery
      SELECT_BACKUP_ADS="STARTAPP"
      SELECT_BACKUP_ADS="MOPUB"
      SELECT_BACKUP_ADS="IRON"
      SELECT_BACKUP_ADS="ADMOB"
      SELECT_BACKUP_ADS="FACEBOOK"
      SELECT_BACKUP_ADS="UNITY"
      SELECT_BACKUP_ADS="GOOGLE-ADS"
     */

    public static String SELECT_BACKUP_ADS = "STARTAPP";


    /*Admob ID and Applovin SDK Key
    please check string.xml
    Admob = replace <string name="admobappid">ca-app-pub-3940256099942544~3347511713</string>
    Applovin = replace <string name="sdk_key_applovin">5UhA2fX7QnsiNAwdmPdJW-QTCSqDx1ssvQm1QC252VUsD0sLAG1-2hpDaqHKsM3ZwH0RlcTNcLKTn-gB_xBeBo</string>
    with your id
     */

    public static String MAIN_ADS_INTER = "ca-app-pub-3757849483665076/4948378302";
    public static String MAIN_ADS_BANNER = "ca-app-pub-3757849483665076/5139949995";

    public static String BACKUP_ADS_INTER = " ";
    public static String BACKUP_ADS_BANNER = " ";

    /*
    INITIALIZE_SDK  and INITIALIZE_SDK_BACKUP_ADS uses for MOBUP, STARTAPP and IRONSOURCE
    fill INITIALIZE_SDK or INITIALIZE_SDK_BACKUP_ADS with App Key for IRONSOURCE
    example : INITIALIZE_SDK ="107355779"

    fill INITIALIZE_SDK or INITIALIZE_SDK_BACKUP_ADS with Banner ID for MOPUB
    example : INITIALIZE_SDK ="b195f8dd8ded45fe847ad89ed1d016da"

    fill INITIALIZE_SDK or INITIALIZE_SDK_BACKUP_ADSwith App ID for STARTAPP
    example : INITIALIZE_SDK ="123456789"

    if use Admob and Applovin as main or backup ads please input INITIALIZE_SDK ="" or INITIALIZE_SDK_BACKUP_ADS =""
     */
    public static String INITIALIZE_SDK = ""; //Main Ads
    public static String INITIALIZE_SDK_BACKUP_ADS = "203563832"; // Backup Ads

    /*
    OPEN Ads only for ADMOB
    can't load from json online
     */
    public static String ON_OFF_OPEN_ADS="1";  // "0" = on or "1" = off
    public static String ADMOB_OPENADS = "https://play.google.com/store/apps/details?id=com.tedystoreapp.apk_d_ayatulkhirzinewd";

    /*
    HPK only for Admob and Applovin-D (Discovery)
    please fill with HPK Adsense/Admob like finance, etc or you can ignore it

    uses HPK
    public static String HIGH_PAYING_KEYWORD1="finance";

    ignore HPK
    public static String HIGH_PAYING_KEYWORD1="";
     */
    public static String HIGH_PAYING_KEYWORD1="mesothelioma claims process";
    public static String HIGH_PAYING_KEYWORD2="motorcycle personal injury lawyer";
    public static String HIGH_PAYING_KEYWORD3="Asuransi mobil";
    public static String HIGH_PAYING_KEYWORD4="jasa pembuatan website iklan baris";
    public static String HIGH_PAYING_KEYWORD5="plasa hosting";

    /*
    STATUS_APP = "0" must set 0 if your app still live on playstore
    and STATUS_APP = "1" if your app "suspend"
    fill LINK_REDIRECT with new link app
    */
    public static String STATUS_APP = "0";
    public static String LINK_REDIRECT = "https://play.google.com/store/apps/details?id=com.tedystoreapp.apk_d_ayatulkhirzinewd";

    /*
   Interval for Intertitial ads
   */
    public static int INTERVAL = 5;
    public static boolean CHILD_DIRECT_GDPR = true;
}
