package com.jegan.checkbox;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    CheckBox apple,mango,orange;
    Button b1;
    //String s="";
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple=(CheckBox)findViewById(R.id.checkBox);
        mango=(CheckBox)findViewById(R.id.checkBox2);
        orange=(CheckBox)findViewById(R.id.checkBox3);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");
                if (apple.isChecked()) {
                    result.append("apple,");
                }
                if (mango.isChecked()) {
                    result.append("mango,");
                }
                if (orange.isChecked()) {
                    result.append("orange");
                }

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

