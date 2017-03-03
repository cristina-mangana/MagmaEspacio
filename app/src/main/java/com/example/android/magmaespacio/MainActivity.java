package com.example.android.magmaespacio;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import static android.text.Html.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the device screen height
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int screenHeight = size.y;
        //Find the Layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.mainLayout);
        //Set the height of the layout based on the screen height
        ViewGroup.LayoutParams params = layout.getLayoutParams();
        params.height = screenHeight - getStatusBarHeight();

        //Superscript Text and Change Color
        TextView textViewDescription = (TextView) findViewById(R.id.description);
        SpannableStringBuilder spannable = new SpannableStringBuilder("Magma is a 300 m2 Coworking space in the center of Ourense, designed to create a collaborative work environment for professionals (freelancers, entrepreneurs and small businesses).");
        spannable.setSpan(new SuperscriptSpan(), 16, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new RelativeSizeSpan(0.75f), 16, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 18, 27, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 131, 142, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 144, 157, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 162, 178, 0);
        textViewDescription.setText(spannable);

        //Add maps activity on link
        TextView textViewLocation = (TextView) findViewById(R.id.location);
        textViewLocation.setText(fromHtml("<a href=\"http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia\">" +
                "Bedoya 27 Bj. Ourense, 32004, Galicia" +"</a>"));
        textViewLocation.setMovementMethod(LinkMovementMethod.getInstance());

        // Set the font's path
        String fontPathRobotoMedium = "fonts/Roboto-Medium.ttf";
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        // Get the id TextView
        TextView textViewMainText1a = (TextView) findViewById(R.id.mainText1a);
        TextView textViewMainText1b = (TextView) findViewById(R.id.mainText1b);
        TextView textViewMainText2a = (TextView) findViewById(R.id.mainText2a);
        TextView textViewMainText2b = (TextView) findViewById(R.id.mainText2b);
        TextView textViewOne = (TextView) findViewById(R.id.one);
        TextView textViewTwo = (TextView) findViewById(R.id.two);
        TextView textViewWhatIs = (TextView) findViewById(R.id.whatIs);
        TextView textViewAboutUs = (TextView) findViewById(R.id.aboutUs);
        TextView textViewServices = (TextView) findViewById(R.id.services);
        TextView textViewTheSpace = (TextView) findViewById(R.id.theSpace);
        TextView textViewContact = (TextView) findViewById(R.id.contact);
        TextView textViewSlogan = (TextView) findViewById(R.id.slogan);
        TextView textViewNameMartinho = (TextView) findViewById(R.id.nameMartinho);
        TextView textViewNameMaria = (TextView) findViewById(R.id.nameMaria);
        TextView textViewNameManu = (TextView) findViewById(R.id.nameManu);
        TextView textViewNameSonia = (TextView) findViewById(R.id.nameSonia);
        TextView textViewNameGory = (TextView) findViewById(R.id.nameGory);
        TextView textViewNamePatricia = (TextView) findViewById(R.id.namePatricia);
        TextView textViewNameRebeca = (TextView) findViewById(R.id.nameRebeca);
        TextView textViewNameSandra = (TextView) findViewById(R.id.nameSandra);
        TextView textViewNameEsteban = (TextView) findViewById(R.id.nameEsteban);
        TextView textViewNamePedro = (TextView) findViewById(R.id.namePedro);
        TextView textViewNameJaime = (TextView) findViewById(R.id.nameJaime);
        TextView textViewNameMarta = (TextView) findViewById(R.id.nameMarta);
        TextView textViewNameDaniela = (TextView) findViewById(R.id.nameDaniela);
        TextView textViewNameAna = (TextView) findViewById(R.id.nameAna);
        TextView textViewNameJuan = (TextView) findViewById(R.id.nameJuan);
        TextView textViewCompMartinho = (TextView) findViewById(R.id.compMartinho);
        TextView textViewCompMaria = (TextView) findViewById(R.id.compMaria);
        TextView textViewCompManu = (TextView) findViewById(R.id.compManu);
        TextView textViewCompSonia = (TextView) findViewById(R.id.compSonia);
        TextView textViewCompGory = (TextView) findViewById(R.id.compGory);
        TextView textViewCompPatricia = (TextView) findViewById(R.id.compPatricia);
        TextView textViewCompRebeca = (TextView) findViewById(R.id.compRebeca);
        TextView textViewCompSandra = (TextView) findViewById(R.id.compSandra);
        TextView textViewCompEsteban = (TextView) findViewById(R.id.compEsteban);
        TextView textViewCompPedro = (TextView) findViewById(R.id.compPedro);
        TextView textViewCompJaime = (TextView) findViewById(R.id.compJaime);
        TextView textViewCompMarta = (TextView) findViewById(R.id.compMarta);
        TextView textViewCompDaniela = (TextView) findViewById(R.id.compDaniela);
        TextView textViewCompAna = (TextView) findViewById(R.id.compAna);
        TextView textViewCompJuan = (TextView) findViewById(R.id.compJuan);
        TextView textViewStations = (TextView) findViewById(R.id.stations);
        TextView textViewMeeting = (TextView) findViewById(R.id.meeting);
        TextView textViewDomiciliation = (TextView) findViewById(R.id.domiciliation);
        TextView textViewEvents = (TextView) findViewById(R.id.events);
        TextView textViewPhone = (TextView) findViewById(R.id.phone);
        TextView textViewMail = (TextView) findViewById(R.id.mail);
        TextView textViewTimetable = (TextView) findViewById(R.id.timetable);
        TextView textViewWeb = (TextView) findViewById(R.id.web);
        // Load the font as a TypeFace object
        Typeface typeFaceRobotoMedium = Typeface.createFromAsset(getAssets(), fontPathRobotoMedium);
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        // Set the extra fancy font in the customFont TextView
        textViewMainText1a.setTypeface(typeFaceRobotoMedium);
        textViewMainText1b.setTypeface(typeFaceRobotoMedium);
        textViewMainText2a.setTypeface(typeFaceRobotoMedium);
        textViewMainText2b.setTypeface(typeFaceRobotoMedium);
        textViewOne.setTypeface(typeFaceRobotoRegular);
        textViewTwo.setTypeface(typeFaceRobotoRegular);
        textViewWhatIs.setTypeface(typeFaceRobotoRegular);
        textViewAboutUs.setTypeface(typeFaceRobotoRegular);
        textViewServices.setTypeface(typeFaceRobotoRegular);
        textViewTheSpace.setTypeface(typeFaceRobotoRegular);
        textViewContact.setTypeface(typeFaceRobotoRegular);
        textViewDescription.setTypeface(typeFaceRobotoRegular);
        textViewSlogan.setTypeface(typeFaceRobotoMedium);
        textViewNameMartinho.setTypeface(typeFaceRobotoMedium);
        textViewNameMaria.setTypeface(typeFaceRobotoMedium);
        textViewNameManu.setTypeface(typeFaceRobotoMedium);
        textViewNameSonia.setTypeface(typeFaceRobotoMedium);
        textViewNameGory.setTypeface(typeFaceRobotoMedium);
        textViewNamePatricia.setTypeface(typeFaceRobotoMedium);
        textViewNameRebeca.setTypeface(typeFaceRobotoMedium);
        textViewNameSandra.setTypeface(typeFaceRobotoMedium);
        textViewNameEsteban.setTypeface(typeFaceRobotoMedium);
        textViewNamePedro.setTypeface(typeFaceRobotoMedium);
        textViewNameJaime.setTypeface(typeFaceRobotoMedium);
        textViewNameMarta.setTypeface(typeFaceRobotoMedium);
        textViewNameDaniela.setTypeface(typeFaceRobotoMedium);
        textViewNameAna.setTypeface(typeFaceRobotoMedium);
        textViewNameJuan.setTypeface(typeFaceRobotoMedium);
        textViewCompMartinho.setTypeface(typeFaceRobotoRegular);
        textViewCompMaria.setTypeface(typeFaceRobotoRegular);
        textViewCompManu.setTypeface(typeFaceRobotoRegular);
        textViewCompSonia.setTypeface(typeFaceRobotoRegular);
        textViewCompGory.setTypeface(typeFaceRobotoRegular);
        textViewCompPatricia.setTypeface(typeFaceRobotoRegular);
        textViewCompRebeca.setTypeface(typeFaceRobotoRegular);
        textViewCompSandra.setTypeface(typeFaceRobotoRegular);
        textViewCompEsteban.setTypeface(typeFaceRobotoRegular);
        textViewCompPedro.setTypeface(typeFaceRobotoRegular);
        textViewCompJaime.setTypeface(typeFaceRobotoRegular);
        textViewCompMarta.setTypeface(typeFaceRobotoRegular);
        textViewCompDaniela.setTypeface(typeFaceRobotoRegular);
        textViewCompAna.setTypeface(typeFaceRobotoRegular);
        textViewCompJuan.setTypeface(typeFaceRobotoRegular);
        textViewStations.setTypeface(typeFaceRobotoMedium);
        textViewMeeting.setTypeface(typeFaceRobotoMedium);
        textViewDomiciliation.setTypeface(typeFaceRobotoMedium);
        textViewEvents.setTypeface(typeFaceRobotoMedium);
        textViewLocation.setTypeface(typeFaceRobotoRegular);
        textViewPhone.setTypeface(typeFaceRobotoRegular);
        textViewMail.setTypeface(typeFaceRobotoRegular);
        textViewTimetable.setTypeface(typeFaceRobotoRegular);
        textViewWeb.setTypeface(typeFaceRobotoRegular);
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    //Function onClick
    public void seeMartinho (View view){
        RelativeLayout layoutMartinho = (RelativeLayout) findViewById(R.id.textMartinho);
        layoutMartinho.setVisibility(View.VISIBLE);
    }
    public void notseeMartinho (View view){
        RelativeLayout layoutMartinho = (RelativeLayout) findViewById(R.id.textMartinho);
        layoutMartinho.setVisibility(View.INVISIBLE);
    }

    public void seeMaria (View view){
        RelativeLayout layoutMaria = (RelativeLayout) findViewById(R.id.textMaria);
        layoutMaria.setVisibility(View.VISIBLE);
    }
    public void notseeMaria (View view){
        RelativeLayout layoutMaria = (RelativeLayout) findViewById(R.id.textMaria);
        layoutMaria.setVisibility(View.INVISIBLE);
    }

    public void seeManu (View view){
        RelativeLayout layoutManu = (RelativeLayout) findViewById(R.id.textManu);
        layoutManu.setVisibility(View.VISIBLE);
    }
    public void notseeManu (View view){
        RelativeLayout layoutManu = (RelativeLayout) findViewById(R.id.textManu);
        layoutManu.setVisibility(View.INVISIBLE);
    }

    public void seeSonia (View view){
        RelativeLayout layoutSonia = (RelativeLayout) findViewById(R.id.textSonia);
        layoutSonia.setVisibility(View.VISIBLE);
    }
    public void notseeSonia (View view){
        RelativeLayout layoutSonia = (RelativeLayout) findViewById(R.id.textSonia);
        layoutSonia.setVisibility(View.INVISIBLE);
    }

    public void seeGory (View view){
        RelativeLayout layoutGory = (RelativeLayout) findViewById(R.id.textGory);
        layoutGory.setVisibility(View.VISIBLE);
    }
    public void notseeGory (View view){
        RelativeLayout layoutGory = (RelativeLayout) findViewById(R.id.textGory);
        layoutGory.setVisibility(View.INVISIBLE);
    }

    public void seePatricia (View view){
        RelativeLayout layoutPatricia = (RelativeLayout) findViewById(R.id.textPatricia);
        layoutPatricia.setVisibility(View.VISIBLE);
    }
    public void notseePatricia (View view){
        RelativeLayout layoutPatricia = (RelativeLayout) findViewById(R.id.textPatricia);
        layoutPatricia.setVisibility(View.INVISIBLE);
    }

    public void seeRebeca (View view){
        RelativeLayout layoutRebeca = (RelativeLayout) findViewById(R.id.textRebeca);
        layoutRebeca.setVisibility(View.VISIBLE);
    }
    public void notseeRebeca (View view){
        RelativeLayout layoutRebeca = (RelativeLayout) findViewById(R.id.textRebeca);
        layoutRebeca.setVisibility(View.INVISIBLE);
    }

    public void seeSandra (View view){
        RelativeLayout layoutSandra = (RelativeLayout) findViewById(R.id.textSandra);
        layoutSandra.setVisibility(View.VISIBLE);
    }
    public void notseeSandra (View view){
        RelativeLayout layoutSandra = (RelativeLayout) findViewById(R.id.textSandra);
        layoutSandra.setVisibility(View.INVISIBLE);
    }

    public void seeEsteban (View view){
        RelativeLayout layoutEsteban = (RelativeLayout) findViewById(R.id.textEsteban);
        layoutEsteban.setVisibility(View.VISIBLE);
    }
    public void notseeEsteban (View view){
        RelativeLayout layoutEsteban = (RelativeLayout) findViewById(R.id.textEsteban);
        layoutEsteban.setVisibility(View.INVISIBLE);
    }

    public void seePedro (View view){
        RelativeLayout layoutPedro = (RelativeLayout) findViewById(R.id.textPedro);
        layoutPedro.setVisibility(View.VISIBLE);
    }
    public void notseePedro (View view){
        RelativeLayout layoutPedro = (RelativeLayout) findViewById(R.id.textPedro);
        layoutPedro.setVisibility(View.INVISIBLE);
    }

    public void seeJaime (View view){
        RelativeLayout layoutJaime = (RelativeLayout) findViewById(R.id.textJaime);
        layoutJaime.setVisibility(View.VISIBLE);
    }
    public void notseeJaime (View view){
        RelativeLayout layoutJaime = (RelativeLayout) findViewById(R.id.textJaime);
        layoutJaime.setVisibility(View.INVISIBLE);
    }

    public void seeMarta (View view){
        RelativeLayout layoutMarta = (RelativeLayout) findViewById(R.id.textMarta);
        layoutMarta.setVisibility(View.VISIBLE);
    }
    public void notseeMarta (View view){
        RelativeLayout layoutMarta = (RelativeLayout) findViewById(R.id.textMarta);
        layoutMarta.setVisibility(View.INVISIBLE);
    }

    public void seeDaniela (View view){
        RelativeLayout layoutDaniela = (RelativeLayout) findViewById(R.id.textDaniela);
        layoutDaniela.setVisibility(View.VISIBLE);
    }
    public void notseeDaniela (View view){
        RelativeLayout layoutDaniela = (RelativeLayout) findViewById(R.id.textDaniela);
        layoutDaniela.setVisibility(View.INVISIBLE);
    }

    public void seeAna (View view){
        RelativeLayout layoutAna = (RelativeLayout) findViewById(R.id.textAna);
        layoutAna.setVisibility(View.VISIBLE);
    }
    public void notseeAna (View view){
        RelativeLayout layoutAna = (RelativeLayout) findViewById(R.id.textAna);
        layoutAna.setVisibility(View.INVISIBLE);
    }

    public void seeJuan (View view){
        RelativeLayout layoutJuan = (RelativeLayout) findViewById(R.id.textJuan);
        layoutJuan.setVisibility(View.VISIBLE);
    }
    public void notseeJuan (View view){
        RelativeLayout layoutJuan = (RelativeLayout) findViewById(R.id.textJuan);
        layoutJuan.setVisibility(View.INVISIBLE);
    }

    public void facebook (View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=https://m.facebook.com/MagmaEspacio/"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.facebook.com/MagmaEspacio")));
        }
    }

    public void twitter (View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://MagmaEspacio/"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/MagmaEspacio")));
        }
    }

    public void pinterest (View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("pinterest://MagmaEspacio/"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pinterest.com/MagmaEspacio")));
        }
    }

    public void map (View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia")));
        }
    }

    public void scroll (View view){
        ScrollView layoutmain = (ScrollView) findViewById(R.id.activity_main);
        RelativeLayout main = (RelativeLayout) findViewById(R.id.mainLayout);
        layoutmain.smoothScrollTo(0, main.getBottom());
    }
}
