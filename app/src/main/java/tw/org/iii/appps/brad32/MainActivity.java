
package tw.org.iii.appps.brad32;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private MyAdapter adapter;
    private String[] titles = {"item0","item0","item0","item0","item0","item0",
            "item0","item0","item0","item0","item0","item0","item0",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        initGridView();
    }

    private void initGridView(){
        adapter = new MyAdapter();
        gridView.setAdapter(adapter);
    }

    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        MyAdapter(){
            inflater = getLayoutInflater();
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View itemView = inflater.inflate(R.layout.item, viewGroup, false);

            TextView title = itemView.findViewById(R.id.item_title);
            title.setText(titles[i]);

            return itemView;
        }
    }

}
