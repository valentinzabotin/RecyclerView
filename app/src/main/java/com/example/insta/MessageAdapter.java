package com.example.insta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>{

    private ArrayList<Post> rData;
    private Context context;

    public MessageAdapter(Context context,ArrayList<Post> rData) {
        this.rData = rData;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_element,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Post post = rData.get(position);
        TextView textViewName = holder.textViewName;
        textViewName.setText(post.getName());

        TextView textViewMessage = holder.textViewMessage;
        textViewMessage.setText(post.getMessage());

        final ImageView imageViewLike = holder.imageLike;
        setLikeImage(imageViewLike, post.isLiked());
        imageViewLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                post.setLiked(!post.isLiked());
                setLikeImage(imageViewLike,post.isLiked());
            }
        });
    }

    private void setLikeImage(ImageView likeImage, boolean isLiked) {
        int image;
        if(isLiked){
            image = R.drawable.ic_favorite_red;
        } else {
            image = R.drawable.heart;
        }
        likeImage.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return rData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewName;
        private TextView textViewMessage;
        private ImageView imageLike;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.recycler_view_row_id_text);
            textViewMessage = itemView.findViewById(R.id.recycler_view_message);
            imageLike = itemView.findViewById(R.id.imageLike);

        }
    }
}
