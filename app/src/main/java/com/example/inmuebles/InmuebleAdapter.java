package com.example.inmuebles;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.inmuebles.databinding.ItemBinding;

import java.util.List;

public class InmuebleAdapter extends ArrayAdapter<Inmueble> {
    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;
    private ItemBinding binding;
    public InmuebleAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context=context;
        this.li=li;
        lista=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            binding = ItemBinding.inflate(li,parent,false);
            convertView=binding.getRoot();
        }
        Inmueble i = lista.get(position);
        binding.ivFoto.setImageResource(i.getFoto());
        binding.tvUbicacion.setText(i.getUbicacion());
        binding.tvPrecio.setText(i.getPrecio()+"");
        return convertView;
        /*
        if (convertView==null){
            convertView= li.inflate(R.layout.item,parent,false);
        }
        Inmueble i = lista.get(position);
        ((ImageView) convertView.findViewById(R.id.ivFoto)).setImageResource(i.getFoto());
        ((TextView) convertView.findViewById(R.id.tvUbicacion)).setText(i.getUbicacion());
        ((TextView) convertView.findViewById(R.id.tvPrecio)).setText(i.getPrecio()+"");
        return convertView;
         */
    }
}
