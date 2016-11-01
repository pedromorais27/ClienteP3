package br.usjt.arqdesis.clientep3.Controller;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import br.usjt.arqdesis.clientep3.R;
import br.usjt.arqdesis.clientep3.Model.Cliente;
import br.usjt.arqdesis.clientep3.Model.Util;

public class DetalheClienteActivity extends AppCompatActivity {
    ImageView clienteImageView;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        Intent intent = getIntent();
        cliente = new Cliente(1, intent.getStringExtra(ListaClientesActivity.NOME),
                intent.getStringExtra(ListaClientesActivity.FONE),
                intent.getStringExtra(ListaClientesActivity.EMAIL));
        clienteImageView = (ImageView) findViewById(R.id.cliente_image_view);
        Drawable drawable = Util.getDrawable(this, cliente.getFoto());
        clienteImageView.setImageDrawable(drawable);

        TextView nome = (TextView)findViewById(R.id.txt_cliente_nome);
        TextView fone = (TextView)findViewById(R.id.txt_cliente_fone);
        TextView email = (TextView)findViewById(R.id.txt_cliente_email);

        nome.setText(cliente.getNome());
        fone.setText(cliente.getFone());
        email.setText(cliente.getEmail());
    }
}
