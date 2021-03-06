package com.neufrin.standingsick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private DatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        db = new DatabaseHandler(this);

        LinearLayout ll = (LinearLayout)findViewById(R.id.HistoryLayout);
        List<Session> sessions = db.getSessions();
        final Button[] b = new Button[sessions.size()];
        for(int i=0; i<sessions.size();i++)
        {
            b[i]= new Button(this);
            ll.addView(b[i]);
            b[i].setText(sessions.get(i).getId() + " " + sessions.get(i).getDate());
            b[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            b[i].setId(sessions.get(i).getId().intValue());
            b[i].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =v.getId();
                goToResult(id);
            }
        });
        }
    }
    public void goToResult(int id)
    {
        Intent i = new Intent(this,ResultActivity.class);
        i.putExtra("sessionId",Long.valueOf(id));
        startActivity(i);
    }
}
