package com.example.android.magmaespacio;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.text.Html.fromHtml;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Full-screen layout: http://stackoverflow.com/questions/23158072/full-screen-layout-in-scroll-view
        //Get the device screen height
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int screenHeight = size.y;
        //Find the Layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.mainLayout);
        //Set the height of the layout based on the screen height
        ViewGroup.LayoutParams params = layout.getLayoutParams();
        params.height = screenHeight - getStatusBarHeight();

        //Superscript Text and Change Color: https://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling
        TextView textViewDescription = (TextView) findViewById(R.id.description);
        SpannableStringBuilder spannable = new SpannableStringBuilder("Magma is a 300 m2 Coworking space in the center of Ourense, designed to create a collaborative work environment for professionals (freelancers, entrepreneurs and small businesses).");
        spannable.setSpan(new SuperscriptSpan(), 16, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new RelativeSizeSpan(0.75f), 16, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 18, 27, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 131, 142, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 144, 157, 0);
        spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#EF6C00")), 162, 178, 0);
        textViewDescription.setText(spannable);

        //Custom fonts: https://discussions.udacity.com/t/is-there-a-way-to-add-a-new-font-only-with-xml-without-using-java-code/214891/6
        // Set the font's path
        String fontPathRobotoMedium = "fonts/Roboto-Medium.ttf";
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        // Get the id TextView
        List<TextView> textMedium = new ArrayList<>();
        textMedium.add((TextView) findViewById(R.id.mainText1a));
        textMedium.add((TextView) findViewById(R.id.mainText1b));
        textMedium.add((TextView) findViewById(R.id.mainText2a));
        textMedium.add((TextView) findViewById(R.id.mainText2b));
        textMedium.add((TextView) findViewById(R.id.slogan));
        textMedium.add((TextView) findViewById(R.id.nameMartinho));
        textMedium.add((TextView) findViewById(R.id.nameMaria));
        textMedium.add((TextView) findViewById(R.id.nameManu));
        textMedium.add((TextView) findViewById(R.id.nameSonia));
        textMedium.add((TextView) findViewById(R.id.nameGory));
        textMedium.add((TextView) findViewById(R.id.namePatricia));
        textMedium.add((TextView) findViewById(R.id.nameRebeca));
        textMedium.add((TextView) findViewById(R.id.nameSandra));
        textMedium.add((TextView) findViewById(R.id.nameEsteban));
        textMedium.add((TextView) findViewById(R.id.namePedro));
        textMedium.add((TextView) findViewById(R.id.nameJaime));
        textMedium.add((TextView) findViewById(R.id.nameMarta));
        textMedium.add((TextView) findViewById(R.id.nameDaniela));
        textMedium.add((TextView) findViewById(R.id.nameAna));
        textMedium.add((TextView) findViewById(R.id.nameJuan));
        textMedium.add((TextView) findViewById(R.id.stations));
        textMedium.add((TextView) findViewById(R.id.meeting));
        textMedium.add((TextView) findViewById(R.id.domiciliation));
        textMedium.add((TextView) findViewById(R.id.events));
        List<TextView> textRegular = new ArrayList<>();
        textRegular.add((TextView) findViewById(R.id.one));
        textRegular.add((TextView) findViewById(R.id.two));
        textRegular.add((TextView) findViewById(R.id.whatIs));
        textRegular.add((TextView) findViewById(R.id.aboutUs));
        textRegular.add((TextView) findViewById(R.id.services));
        textRegular.add((TextView) findViewById(R.id.theSpace));
        textRegular.add((TextView) findViewById(R.id.contact));
        textRegular.add(textViewDescription);
        textRegular.add((TextView) findViewById(R.id.compMartinho));
        textRegular.add((TextView) findViewById(R.id.compMaria));
        textRegular.add((TextView) findViewById(R.id.compManu));
        textRegular.add((TextView) findViewById(R.id.compSonia));
        textRegular.add((TextView) findViewById(R.id.compGory));
        textRegular.add((TextView) findViewById(R.id.compPatricia));
        textRegular.add((TextView) findViewById(R.id.compRebeca));
        textRegular.add((TextView) findViewById(R.id.compSandra));
        textRegular.add((TextView) findViewById(R.id.compEsteban));
        textRegular.add((TextView) findViewById(R.id.compPedro));
        textRegular.add((TextView) findViewById(R.id.compJaime));
        textRegular.add((TextView) findViewById(R.id.compMarta));
        textRegular.add((TextView) findViewById(R.id.compDaniela));
        textRegular.add((TextView) findViewById(R.id.compAna));
        textRegular.add((TextView) findViewById(R.id.compJuan));
        TextView textViewLocation = (TextView) findViewById(R.id.location);
        textRegular.add(textViewLocation);
        textRegular.add((TextView) findViewById(R.id.phone));
        textRegular.add((TextView) findViewById(R.id.mail));
        textRegular.add((TextView) findViewById(R.id.timetable));
        textRegular.add((TextView) findViewById(R.id.web));
        // Load the font as a TypeFace object
        Typeface typeFaceRobotoMedium = Typeface.createFromAsset(getAssets(), fontPathRobotoMedium);
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        // Set the extra fancy font in the customFont TextView
        // iterate over the array
        for (int i = 0; i<textMedium.size(); i++) {
            textMedium.get(i).setTypeface(typeFaceRobotoMedium);
        }
        for (int i = 0; i<textRegular.size(); i++) {
            textRegular.get(i).setTypeface(typeFaceRobotoRegular);
        }

        //Add maps activity on link. Linkify TextView: http://android.okhelp.cz/linkify-text-link-url-in-textview-text-android-example/
        textViewLocation.setText(fromHtml("<a href=\"http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia\">" +
                "Bedoya 27 Bj. Ourense, 32004, Galicia" +"</a>"));
        textViewLocation.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /** This method gets the height of the status bar, in order to subtract it to device screen
     * height and get the total available height
     */
    private int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    //Methods see and notsee responds on clicks on coworkers images and/or information
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

    /** Social network methods open the company social network pages on specific app (if it's
     * available on the device) or else on navigator.
     * Intents: https://developer.android.com/reference/android/content/Intent.html
     */
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

    /** This method opens the company location on Google Maps App if it's
     * available on the device) or else on navigator.
     * Intents: https://developer.android.com/reference/android/content/Intent.html
     */
    public void map (View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia"));
            startActivity(intent);
        } catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=Magma+Espacio,+Ourense,+32004,+Galicia")));
        }
    }

    //This method scrolls to the first section from the cover page.
    public void scroll (View view){
        ScrollView layoutmain = (ScrollView) findViewById(R.id.activity_main);
        RelativeLayout main = (RelativeLayout) findViewById(R.id.mainLayout);
        layoutmain.smoothScrollTo(0, main.getBottom());
    }

    //This method creates a popup Menu in which user can select a section to scroll to.
    public void menu (View view){
        Button buttonMenu = (Button) findViewById(R.id.menu_button);
        //Popup tutorial: https://www.javatpoint.com/android-popup-menu-example
        //Creating the instance of PopupMenu
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, buttonMenu);
        //Inflating the Popup using xml file
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        //registering popup with OnMenuItemClickListener
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                ScrollView layoutmain = (ScrollView) findViewById(R.id.activity_main);
                switch(id) {
                    case R.id.whatIsMenu:
                        RelativeLayout main = (RelativeLayout) findViewById(R.id.mainLayout);
                        layoutmain.smoothScrollTo(0, main.getBottom());
                        return true;
                    case R.id.aboutUsMenu:
                        TextView slogan = (TextView) findViewById(R.id.slogan);
                        layoutmain.smoothScrollTo(0, slogan.getBottom());
                        return true;
                    case R.id.servicesMenu:
                        LinearLayout servicesTop = (LinearLayout) findViewById(R.id.servicesLayout);
                        layoutmain.smoothScrollTo(0, servicesTop.getTop());
                        return true;
                    case R.id.theSpaceMenu:
                        LinearLayout servicesBottom = (LinearLayout) findViewById(R.id.servicesLayout);
                        layoutmain.smoothScrollTo(0, servicesBottom.getBottom());
                        return true;
                    case R.id.contactUsMenu:
                        RelativeLayout contact = (RelativeLayout) findViewById(R.id.contactLayout);
                        layoutmain.smoothScrollTo(0, contact.getTop());
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();//showing popup menu
    }
}
