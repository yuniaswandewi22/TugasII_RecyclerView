package id.ac.unud1805551060;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.CardViewViewHolder> {
    private ArrayList<Pizza_Menu> listPizza;
    private Context context;

    public PizzaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Pizza_Menu> getListPizza() {
        return listPizza;
    }

    public void setListPizza(ArrayList<Pizza_Menu> listPizza) {
        this.listPizza = listPizza;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_card, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Pizza_Menu p = getListPizza().get(position);

        Glide.with(context)
                .load(getListPizza().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.tPhoto);

        holder.tName.setText(p.getName());
        holder.tRemarks.setText(p.getDesc());
    }

    @Override
    public int getItemCount() {
        return getListPizza().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView tPhoto;
        TextView tName, tRemarks;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            tPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
        }
    }
}