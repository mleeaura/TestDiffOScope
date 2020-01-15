package ai.quoori.example.testdiffoscope;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestProjClass
{
    public static String getChangeText()
    {
        return "From Project";
    }

    public static String getAssetStringX(Context context)
    {
        return "Hallo";
    }

    public static String getAssetString(Context context)
    {
        try
        {
            InputStream open = context.getAssets().open("proj_asset.txt");
            int read = open.read();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            return bufferedReader.readLine();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return "";
    }
}
