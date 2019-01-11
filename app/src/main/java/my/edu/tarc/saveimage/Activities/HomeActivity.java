package my.edu.tarc.saveimage.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import my.edu.tarc.saveimage.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnReport;
    private Button btnAnnouncement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnReport = (Button)findViewById(R.id.buttonReport);
        btnAnnouncement = (Button)findViewById(R.id.buttonAnnouncement);

        btnReport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }
        });

        btnAnnouncement.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,CameraActivity.class));
            }
        });
    }

}
