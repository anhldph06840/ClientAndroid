package com.example.connectserver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<Sanpham> productList;

    public ListAdapter(Context context, List<Sanpham> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.sanpham,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvType = convertView.findViewById(R.id.tvType);
            viewHolder.imgUrl = convertView.findViewById(R.id.imgUrl);
            viewHolder.tvInfor = convertView.findViewById(R.id.tvInfor);
            viewHolder.tvCost = convertView.findViewById(R.id.tvCost);

            convertView.setTag(viewHolder);
        }

        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }



        Sanpham sanpham = (Sanpham) getItem(position);
        viewHolder.tvName.setText(sanpham.getName());
        viewHolder.tvType.setText(sanpham.getType());

        viewHolder.tvInfor.setText(sanpham.getInfor());
        viewHolder.tvCost.setText(sanpham.getCost());
        Picasso.get().load(sanpham.getUrl()).into(viewHolder.imgUrl);

        return convertView;
    }
    private class ViewHolder{
        TextView tvName;
        TextView tvType;
        ImageView imgUrl;
        TextView tvInfor;
        TextView tvCost;
    }
}
