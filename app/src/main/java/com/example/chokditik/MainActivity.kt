package com.example.chokditik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn= arrayOf(bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9)

        var x=0
        for (bt in btn)
        {
            bt.setOnClickListener {
                if (x%2==0)
                    bt.setText("X")
                else
                    bt.setText("O")
                bt.isEnabled = false
                x=x+1
                if(x>=9) {
                    newGame(x, btn)
                    x = 0
                }
            }

    }

    }
    fun newGame(x:Int,btn:Array<Button>)
    {

        var doStart=AlertDialog.Builder(this@MainActivity)
        doStart.setTitle("Start?")
        doStart.setMessage("do you want to start a New Game")
        doStart.setPositiveButton("Yes"){dialog, id ->
            Toast.makeText(this@MainActivity,"Player 1: X",Toast.LENGTH_SHORT).show()
for (bt in btn)
{
    bt.setText("")
    bt.isEnabled=true
}
        }
        doStart.setNegativeButton("Quit"){
                dialog,id ->
            exitProcess(0)

        }
        doStart.show()
    }
}
