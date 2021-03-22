package com.example.vothikimyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    //khai bao bien
    EditText edtCr, editMinh;
    Button btTinhToan;
    TextView nhanXet2,nhanXet3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gan bien voi id
        edtCr = findViewById(R.id.edt_SoTuoiCrush);
        editMinh = findViewById(R.id.edt_SoTuoiMinh);
        btTinhToan = findViewById(R.id.bt_tinhToan);
        nhanXet2 = findViewById(R.id.tx_nhanxet2);
        nhanXet3 = findViewById(R.id.tx_nhanxet3);
        btTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu li du lieu vao
                int tuoiCr = Integer.parseInt(edtCr.getText().toString());
                int tuoiMinh = Integer.parseInt(editMinh.getText().toString());
                if (tuoiCr<0 || tuoiCr>80){
                    Toast.makeText(MainActivity.this,
                            "Tuổi của Crush của bạn không được bình thường  !",
                            Toast.LENGTH_SHORT).show();
                    nhanXet2.setText("");
                    nhanXet3.setText("");
                }else if (tuoiMinh < 0 || tuoiMinh > 80){
                    Toast.makeText(MainActivity.this,
                            "Tuổi của bạn có vẻ không được bình thường !!",
                            Toast.LENGTH_SHORT).show();
                    nhanXet2.setText("");
                    nhanXet3.setText("");
                }else if (tuoiMinh < 18){
                    Toast.makeText(MainActivity.this,
                            "Học đi bạn ơi, yêu đương gì tầm này !",
                            Toast.LENGTH_SHORT).show();
                    nhanXet2.setText("");
                    nhanXet3.setText("");
                }else{
                    int finalResult;
                    finalResult = (tuoiCr + tuoiMinh)/ 10;
                    if (finalResult < 10){
                        nhanXet2.setText(" Chúc mừng hai bạn rất là hợp nhau !!!");
                        nhanXet3.setText("lừa đấy, đừng có tin:v");
                    }else{
                        nhanXet2.setText(" Không ổn rồi, chia buồn !!!");
                        nhanXet3.setText("lừa lấy đừng có tin:(");
                    }
                }
            }
        });
    }
}