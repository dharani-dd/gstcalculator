package com.example.gstcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button multi;
    private EditText kg1;
    private EditText rs1;
    private EditText kg2;
    private EditText rs2;
    private TextView tot;
    private TextView s;
    private TextView c;
    private TextView gt;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multi = findViewById(R.id.multi);
        kg1 = findViewById(R.id.kg1);
        rs1 = findViewById(R.id.rs1);
        kg2 = findViewById(R.id.kg2);
        rs2 = findViewById(R.id.rs2);
        tot = findViewById(R.id.tot);
        s = findViewById(R.id.s);
        c = findViewById(R.id.c);
        gt = findViewById(R.id.gt);

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,aa,bb,cc,d,e,f;
                a = Double.parseDouble(kg1.getText().toString());
                b = Double.parseDouble(rs1.getText().toString());
                aa = Double.parseDouble(kg2.getText().toString());
                bb = Double.parseDouble(rs2.getText().toString());
                cc = a*b + aa*bb;
                d = cc*0.025;
                e = cc*0.025;
                f = cc+d+e;
                tot.setText(Double.toString(cc));
                s.setText(Double.toString(d));
                c.setText(Double.toString(e));
                gt.setText(Double.toString(f));


            }
        });




    }
}