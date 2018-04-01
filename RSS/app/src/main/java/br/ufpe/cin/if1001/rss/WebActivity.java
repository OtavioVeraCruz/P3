package br.ufpe.cin.if1001.rss;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class WebActivity extends Activity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView=(WebView)findViewById(R.id.web);
        Intent intent=getIntent();
        String link = intent.getStringExtra("link");//"https://www.globo.com";
        webView.loadUrl(link);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
