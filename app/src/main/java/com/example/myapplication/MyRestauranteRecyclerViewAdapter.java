package com.example.myapplication;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Model.Restaurante;
import com.example.myapplication.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyRestauranteRecyclerViewAdapter extends RecyclerView.Adapter<MyRestauranteRecyclerViewAdapter.ViewHolder> {

    private final List<Restaurante> mValues;
    private Context ctx;

    public MyRestauranteRecyclerViewAdapter(Context context, List<Restaurante> items) {
        mValues = items;
        ctx = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewNombre.setText(holder.mItem.getDescripcion());
        holder.textViewDireccion.setText(holder.mItem.getDireccion());
        //holder.textViewCorreo.setText(holder.mItem.getCorreo());
        //holder.textViewTelefono.setText(holder.mItem.getTelefono());
        //holder.imageViewFoto.setText(holder.mItem.getCorreo());

        Glide.with(ctx)
                .load(holder.mItem.getUrlFoto())
                .centerCrop()
                .into(holder.imageViewFoto);


        holder.ratingBarValoracion.setRating(holder.mItem.getValoracion());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewNombre;
        public final TextView textViewDireccion;
        public final ImageView imageViewFoto;
        public final RatingBar ratingBarValoracion;
        public Restaurante mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewNombre = (TextView) view.findViewById(R.id.tvNombre);
            textViewDireccion = (TextView) view.findViewById(R.id.tvDireccion);
            imageViewFoto = (ImageView) view.findViewById(R.id.ivFoto);
            ratingBarValoracion = (RatingBar) view.findViewById(R.id.rbValoracion);
        }

        @Override
        public String toString() {
            //return super.toString() + " '" + textViewNombre.getText() + "'";
            return "Hola";
        }
    }
}