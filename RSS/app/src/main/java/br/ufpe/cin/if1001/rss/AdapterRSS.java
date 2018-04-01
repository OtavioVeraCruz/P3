package br.ufpe.cin.if1001.rss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Otávio on 31/03/2018.
 */

public class AdapterRSS extends BaseAdapter {
    private List<ItemRSS> items;
    private Context context;
    private LayoutInflater inflater;
    public AdapterRSS(Context context, List<ItemRSS> itemRSS) {
       this.context=context;
       this.items=itemRSS;

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater==null){
             inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView==null){
            convertView=inflater.inflate(R.layout.itemlista,null);
        }
        ItemRSS item=items.get(position);
        TextView title = (TextView)convertView.findViewById(R.id.item_titulo);
        TextView data = (TextView)convertView.findViewById(R.id.item_data);

        title.setText(item.getTitle());
        data.setText(item.getPubDate());

        return convertView;
    }
}
