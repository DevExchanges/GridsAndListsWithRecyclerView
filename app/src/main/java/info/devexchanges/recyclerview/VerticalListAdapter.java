package info.devexchanges.recyclerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class VerticalListAdapter extends RecyclerView.Adapter<VerticalListAdapter.ViewHolder> {

    private Activity activity;

    public VerticalListAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_recycler_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        if ((position + 1) % 2 == 0) {
            viewHolder.imageView.setImageResource(R.drawable.even);
        } else {
            viewHolder.imageView.setImageResource(R.drawable.odd);
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    /**
     * View holder to display each RecylerView item
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image);
        }

    }
}
