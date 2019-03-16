package assignment.androidstudent.com.studentportalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebBrowser extends AppCompatActivity {

    WebView webbrowser;
    String urlToMoodle = "https://partnerships.moodle.roehampton.ac.uk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        webbrowser = findViewById(R.id.id7_webbrowser);

        webbrowser.setWebViewClient(new WebViewClient());
        webbrowser.loadUrl(urlToMoodle);
        webbrowser.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webbrowser.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webbrowser.canGoBack()){
            webbrowser.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
