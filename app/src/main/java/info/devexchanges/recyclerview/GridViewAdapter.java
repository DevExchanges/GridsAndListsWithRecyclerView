package info.devexchanges.recyclerview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ViewHolder> {

    private Activity activity;

    public GridViewAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_grid, viewGroup, false);

        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(GridViewAdapter.ViewHolder viewHolder, int position) {
        if (position % 3 == 0) {
            viewHolder.imageView.setImageResource(R.drawable.sample_3);
        } else if (position % 3 == 1) {
            viewHolder.imageView.setImageResource(R.drawable.sample_1);
        } else {
            viewHolder.imageView.setImageResource(R.drawable.sample_2);
        }
        viewHolder.textView.setText("Position: " + (position + 1));
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    /**
     * View holder to display each RecylerView item
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }
}
