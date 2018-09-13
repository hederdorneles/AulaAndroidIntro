package br.uff.ic.tempo.testeaula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNome = (EditText) findViewById(R.id.edt_nome);
        final EditText edtTelefone = (EditText) findViewById(R.id.edt_telefone);

        Button botao = (Button) findViewById(R.id.btn_enviar);



        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), SegundaActivity.class);
                intent.putExtra("NOME", edtNome.getText().toString());
                intent.putExtra("TELEFONE", edtTelefone.getText().toString());

                startActivity(intent);

//                String informacao = edtNome.getText().toString() + " : " +
//                            edtTelefone.getText().toString();
//
//
//                Toast.makeText(MainActivity.this,informacao, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
