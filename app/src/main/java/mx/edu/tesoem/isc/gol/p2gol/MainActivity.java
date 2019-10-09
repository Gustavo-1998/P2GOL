package mx.edu.tesoem.isc.gol.p2gol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btnsig1);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            Intent pantalla2= new Intent(this,pantalla2.class);
            startActivity(pantalla2);
            finish();

    }
}
