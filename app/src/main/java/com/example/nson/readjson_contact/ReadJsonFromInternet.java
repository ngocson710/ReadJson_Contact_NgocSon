package com.example.nson.readjson_contact;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by NSON on 02/06/2017.
 */

public class ReadJsonFromInternet extends AsyncTask<String, Void, String>{

    readJsonFromInternetListener readJsonFromInternetListener=null;
    public void setReadJsonFromInternetListener(readJsonFromInternetListener readJsonFromInternetListener){
        this.readJsonFromInternetListener= readJsonFromInternetListener;
    }
    @Override
    protected String doInBackground(String... params) {
        return readJsonFromInternet(params[0]).toString();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if(readJsonFromInternetListener!=null){
            readJsonFromInternetListener.xulyJson(s);
        }
    }
    public StringBuilder readJsonFromInternet(String urlString){
        StringBuilder content = new StringBuilder();
        try {
            URL url=new URL(urlString);
            InputStreamReader inputStreamReader= new InputStreamReader(url.openConnection().getInputStream());
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
            String line="";
            while ((line = bufferedReader.readLine())!=null){
                content.append(line);
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
