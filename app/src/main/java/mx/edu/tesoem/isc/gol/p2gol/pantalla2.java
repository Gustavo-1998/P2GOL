package mx.edu.tesoem.isc.gol.p2gol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla2 extends AppCompatActivity implements View.OnClickListener {

    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        btn2=(Button) findViewById(R.id.btnsig2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent pantalla3= new Intent(this,pantalla3.class);
        startActivity(pantalla3);
        finish();
    }
}
