package info.devexchanges.recyclerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HorizontalListAdapter extends RecyclerView.Adapter<HorizontalListAdapter.ViewHolder> {

    private Activity activity;

    public HorizontalListAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_horizontal_list, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalListAdapter.ViewHolder viewHolder, int position) {
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    /**
     * View holder to display each RecylerView item
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
