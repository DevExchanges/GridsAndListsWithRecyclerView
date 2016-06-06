package info.devexchanges.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class GridViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        recyclerView = (RecyclerView)findViewById(R.id.recyle_view);
        recyclerView.setHasFixedSize(true);

        //set GridLayoutManager
        GridLayoutManager layoutManager = new GridAutoFitLayoutManager(this, 120);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new GridViewAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}