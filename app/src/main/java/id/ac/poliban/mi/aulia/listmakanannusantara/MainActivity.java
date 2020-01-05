package id.ac.poliban.mi.aulia.listmakanannusantara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Food> data = new ArrayList<>();
    private BaseAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mengenali object toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //memasang toolbar Activity
        setSupportActionBar(toolbar);
        setTitle("Lia Studio");
        toolbar.setSubtitle("http:/github.com/NurRizkiAulia");
        toolbar.setLogo(android.R.drawable.ic_menu_mylocation);
        listView = findViewById(R.id.listview);
        data.addAll(FoodData.getAllFood());

        adapter = new FoodAdapter(data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(((parent, view, position, id) -> {
            new  AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(data.get(position).toString())
                    .setPositiveButton("OK", null).show();
        }));
        }
    }




