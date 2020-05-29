package azz.lokcay.hewanar;

import android.content.Intent;
import android.service.autofill.OnClickAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHewanAdapter extends RecyclerView.Adapter<ListHewanAdapter.ListViewHolder> {
    private ArrayList<Hewan> listHewan;

    public ListHewanAdapter(ArrayList<Hewan> list){
        this.listHewan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( viewGroup.getContext()).inflate(R.layout.item_row_hewan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Hewan hewan = listHewan.get( position );
        Glide.with( holder.itemView.getContext() )
                .load( hewan.getPhoto() )
                .apply( new RequestOptions().override( 55, 55 ) )
                .into( holder.imgPhoto );
        holder.tvNama.setText( hewan.getNama() );
        holder.tvDetail.setText( hewan.getDetail() );

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listHewan.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                Intent intent = i.putExtra("title", holder.getAdapterPosition());
                intent.putExtra("photo", hewan.getPhoto());
                intent.putExtra("nama", hewan.getNama());
                intent.putExtra("detail", hewan.getDetail());
                v.getContext().startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listHewan.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama,tvDetail;
        Button arBtn;
        ListViewHolder(@NonNull View itemView) {
            super( itemView );
            imgPhoto = itemView.findViewById( R.id.img_item_photo );
            tvNama = itemView.findViewById( R.id.tv_item_name );
            tvDetail = itemView.findViewById( R.id.tv_detail );
            arBtn = itemView.findViewById( R.id.btn_Ar );

        }
    }
}
