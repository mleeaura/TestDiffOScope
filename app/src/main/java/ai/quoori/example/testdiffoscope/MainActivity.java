package ai.quoori.example.testdiffoscope;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import ai.quoori.example.testoscopedepmodule.TestDepClass;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);

        String display = TestProjClass.getChangeText()
                + System.getProperty ("line.separator") + TestDepClass.getChangeText()
                + System.getProperty ("line.separator") + TestProjClass.getAssetString(this)
                + System.getProperty ("line.separator") + TestDepClass.getAssetString(this);

        TestProjClass.getAssetStringX(this);

        tv.setText(display);
    }
}
