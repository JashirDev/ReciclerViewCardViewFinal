package com.example.gamer.reciclerviewcardviewfinal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolderPersona> {
    ArrayList<Persona> listapersonas;

    public PersonaAdapter(ArrayList<Persona> listapersonas) {
        this.listapersonas = listapersonas;
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.persona_card,null,false);

        return new ViewHolderPersona(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        holder.nombre.setText(listapersonas.get(position).getNombre());
        holder.descripcion.setText(listapersonas.get(position).getInfo());
        holder.imagen.setImageResource(listapersonas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listapersonas.size();
    }

    public class ViewHolderPersona extends RecyclerView.ViewHolder {
        TextView nombre, descripcion;
        ImageView imagen;
        public ViewHolderPersona(View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvNombre);
            descripcion=(TextView)itemView.findViewById(R.id.tvInfo);
            imagen=(ImageView)itemView.findViewById(R.id.ivImagen);

        }
    }
}
