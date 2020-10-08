package kominfo.go.id.latihanstorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button internalStorage,eksternalStorage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internalStorage = findViewById(R.id.internalStorage);
        eksternalStorage = findViewById(R.id.externalStorage);
        internalStorage.setOnClickListener(this);
        eksternalStorage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.internalStorage:
                Intent internal = new Intent(MainActivity.this, InternalActivity.class);
                startActivity(internal);
                break;
            case R.id.externalStorage:
                Intent eksternal = new Intent(MainActivity.this, EksternalActivity.class);
                startActivity(eksternal);
                break;
        }

    }


}
