package br.uff.ic.tempo.testeaula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView tvPainel = (TextView) findViewById(R.id.tv_painel);

        Bundle extras = getIntent().getExtras();
        if (extras!= null){

            String informacao = extras.getString("NOME") +
                                " : " +
                                 extras.getString("TELEFONE");

            tvPainel.setText(informacao);
        }
    }
}
