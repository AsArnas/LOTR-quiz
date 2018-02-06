package com.example.android.middleearth;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;


public class MainMenu extends Activity {




    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }




            public void onClickSelect(View view) {

                String name = ((EditText) findViewById(R.id.name_text_view)).getText().toString();

                Toast toast = Toast.makeText(getApplicationContext(),"Hi "+ name + " let's dive in!", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(getApplicationContext(), QuizzClass.class);
                startActivity(intent);
            }





}
