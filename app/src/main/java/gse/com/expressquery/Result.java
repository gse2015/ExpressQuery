package gse.com.expressquery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String url = bundle.getString("url");

        WebView webView = (WebView)findViewById(R.id.webviewResult);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
