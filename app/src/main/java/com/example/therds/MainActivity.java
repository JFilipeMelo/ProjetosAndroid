package com.example.therds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Start(View view) {
        TarefaDispendiosa tarefa = new TarefaDispendiosa();

        Thread thread = new Thread(tarefa);

        thread.start();
        }


    public void Stop(View view) {
    }

    private class TarefaDispendiosa implements Runnable {

        @Override
        public void run() {
            for (int i= 0; i<10; i++){
                Log.d(TAG, "start: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
