package id.ac.poliban.mi.aulia.listmakanannusantara;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private List<Food> foodList = new ArrayList<>();

    public FoodAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }
    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food_list, parent, false);

        //kena;lam view ke object
        ImageView img = convertView.findViewById(R.id.img_food_image);
        TextView tvFoodName = convertView.findViewById(R.id.tv_food_name);
        TextView tvFoodDetail = convertView.findViewById(R.id.tv_food_detail);

        //isi object dengan data
        Glide.with(convertView.getContext())
                .load(foodList.get(position).getImage())
                .apply(new RequestOptions().override(90,55))
                .into(img);
        tvFoodName.setText(foodList.get(position).getFoodName());
        tvFoodDetail.setText(foodList.get(position).getFoodDetail());

        return convertView;
    }
}
