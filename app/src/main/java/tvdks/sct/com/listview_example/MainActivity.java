package tvdks.sct.com.listview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   /*
    ListView lv;
    String[] s = {"A","B","C","D","E"};

    GridView gridView;
    String[] data = {"data1","data2","data3","data4","data5","data6","data7","data8"};
    */

    Button btnWeb;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        gridView = (GridView)findViewById(R.id.idGridView);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        gridView.setAdapter(adapter1);
*/
        btnWeb= (Button)findViewById(R.id.btnWebView);
        editText =(EditText)findViewById(R.id.idTxt);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                WebView browser = (WebView)findViewById(R.id.webview);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl(s);
            }
        });

/*
        lv = (ListView)findViewById(R.id.idListView);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        lv.setAdapter(adapter);
        //Setting onClickListener on ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(),"Item Clicked"+s[i],Toast.LENGTH_SHORT).show();
            }
        });*/
    }

}
