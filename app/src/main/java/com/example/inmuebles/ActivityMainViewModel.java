package com.example.inmuebles;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class ActivityMainViewModel extends AndroidViewModel {

    private MutableLiveData<List<Inmueble>> lista;
    private List<Inmueble> li;
    public ActivityMainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Inmueble>> getLista(){
        if (lista==null) {
            lista = new MutableLiveData<>();
        }
        return lista;
    }

    public void cargarLista(){
        li = new ArrayList<>();
        li.add(new Inmueble("Naschel",50000,R.drawable.c1));
        li.add(new Inmueble("Tilisarao",70000,R.drawable.c2));
        li.add(new Inmueble("La Toma",120000,R.drawable.c3));
        li.add(new Inmueble("Merlo",350000,R.drawable.c4));
        lista.setValue(li);
    }
}
