package br.ulbra.piadasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtNum, txtPiada;

    private Button btnPiada, btnSair;
    public static String[] piadas = {
            "O que o pato disse para a pata?\n R.: Vem Quá",
            "Porque o menino estava falando no telefone deitado?\n R.:Para não cair a ligação ",
            "Qual é a fórmula da água benta?\n R.: H Deus O",
            "Duas formigas japonesas se encontraram e pararam para conversar:\n - Oi Qual seu nome? \n-Fu \n- Fu o que? \n- Fu Miga! ",
            "Qual a cidade brasileira que não tem táxi?\n R.: Uberlândia",
            "Porque o jacaré tirou o filho da escola?\nR.: Porque ele réptil de ano.",
            "Porque o Batman colocou o bat-móvel no seguro?\n R.: Porque ele tem medo que Robin! (Roubem)",
            "Quem é a vó dos trigos?\n R.: Avéia Quacker!",
            "Qual é o alimento mais sagrado que existe?\n R.: O amém doim.",
            "Porque o rádio não pode ter filhos?\n R.: Porque ele é stereo.",
            "Por que o policial não usa sabão?\n R.: Porque ele prefere deter gente.",
            "Por que as plantas pequenas não falam?\n R.: Porque elas são mudinhas.","" +
            "Qual a fruta que anda de trem?\n R.: O kiwiiiii.",
            "Como que o mineiro usa a internet?\n R.: Pelo UAI-fai",
            "Qual é a galinha que cai no chão e surta?\n R.: A galinha cai-i-pira;"};
    public static int npiada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();


        btnPiada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random n = new Random();
                npiada = n.nextInt(((14 - 0) + 1)+0);
                txtPiada.setText(piadas[npiada]);
                txtNum.setText("Nº "+Integer.toString(npiada));//);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void inicializarComponentes() {
        txtPiada = (TextView) findViewById(R.id.txtPiada);
        txtNum = (TextView) findViewById(R.id.txtValorSorteado);
        btnPiada = (Button) findViewById(R.id.btnMostrar);
        btnSair = (Button) findViewById(R.id.btnSair);
    }
}