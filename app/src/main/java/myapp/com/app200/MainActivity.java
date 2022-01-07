package myapp.com.app200;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageButton btn0,btn1,btn2,btn3,btn4,end;
    Button mainbut;


    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thamchieu();

        mainbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count%2==1) {
                    Random random = new Random();
                    int num = random.ints(1, 5).findFirst().getAsInt();

                    if (num == 1) {
                        xuly1();
                    } else if (num == 2) {
                        xuly2();
                    } else if (num == 3) {
                        xuly3();
                    } else
                        xuly4();
                }
                else
                    xulyvebandau();
            }
        });



    }

    void xulyvebandau()
    {
        btn0.animate().x(end.getX()).y(end.getY()).setDuration(200).withEndAction(new Runnable() {
            @Override
            public void run() {
                btn0.setX(end.getX());
                btn0.setY(end.getY());
            }
        }).start();

    }

    void xuly1()
    {
        btn0.animate().x(btn1.getX()).y(btn1.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                btn0.setX(btn1.getX());
                btn0.setY(btn1.getY());
            }
        }).start();
    }

    void xuly2()
    {
        btn0.animate().x(btn2.getX()).y(btn2.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                btn0.setX(btn2.getX());
                btn0.setY(btn2.getY());
            }
        }).start();
    }

    void xuly3()
    {
        btn0.animate().x(btn3.getX()).y(btn3.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                btn0.setX(btn3.getX());
                btn0.setY(btn3.getY());
            }
        }).start();
    }

    void xuly4()
    {
        btn0.animate().x(btn4.getX()).y(btn4.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                btn0.setX(btn4.getX());
                btn0.setY(btn4.getY());
            }
        }).start();
    }




    private void thamchieu()
    {
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        end=findViewById(R.id.end);

        mainbut=findViewById(R.id.mainbut);

    }
}
