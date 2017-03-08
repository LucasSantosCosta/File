package br.com.fiap.exemplofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void criar(View view) {
      try {
          FileOutputStream fos = openFileOutput("teste.txt", MODE_PRIVATE);
          String texto = "Bom dia!";
          fos.write(texto.getBytes());
          fos.close();

        } catch (Exception e){
          e.printStackTrace();
      }
}

    public void ler(View view) {

    }
}
