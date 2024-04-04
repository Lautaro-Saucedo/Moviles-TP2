package com.example.inmuebles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.inmuebles.databinding.ItemBinding;

import java.util.List;

public class Adapter2 extends BaseAdapter {
    private Context context;
    private List<Inmueble> lista;
    public Adapter2(Context context,List<Inmueble> lista){
        this.context=context;
        this.lista=lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(context),parent,false);
            convertView=binding.getRoot();
            convertView.setTag(binding);
        }
        ItemBinding binding = (ItemBinding) convertView.getTag();
        Inmueble i = lista.get(position);
        binding.ivFoto.setImageResource(i.getFoto());
        binding.tvUbicacion.setText(i.getUbicacion());
        binding.tvPrecio.setText(i.getPrecio()+"");
        return convertView;
    }
}
