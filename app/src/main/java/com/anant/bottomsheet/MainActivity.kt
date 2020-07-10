package com.anant.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var btnClick:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick=findViewById(R.id.btnClick)

        btnClick.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view=layoutInflater.inflate(R.layout.dialog_layout,null)

            val imgClose=view.findViewById<ImageView>(R.id.img_close)
            val txtItem1=view.findViewById<TextView>(R.id.txtItem1)
            val txtItem2=view.findViewById<TextView>(R.id.txtItem2)
            val txtItem3=view.findViewById<TextView>(R.id.txtItem3)
            val txtItem4=view.findViewById<TextView>(R.id.txtItem4)
            val txtItem5=view.findViewById<TextView>(R.id.txtItem5)

            txtItem1.setOnClickListener {
                Toast.makeText(applicationContext,"Item 1 clicked",Toast.LENGTH_LONG).show()
            }
            txtItem2.setOnClickListener {
                Toast.makeText(applicationContext,"Item 2 clicked",Toast.LENGTH_LONG).show()
            }
            txtItem3.setOnClickListener {
                Toast.makeText(applicationContext,"Item 3 clicked",Toast.LENGTH_LONG).show()
            }
            txtItem4.setOnClickListener {
                Toast.makeText(applicationContext,"Item 4 clicked",Toast.LENGTH_LONG).show()
            }
            txtItem5.setOnClickListener {
                Toast.makeText(applicationContext,"Item 5 clicked",Toast.LENGTH_LONG).show()
            }

            imgClose.setOnClickListener {
                dialog.dismiss()
            }

           dialog.setCancelable(false)

            dialog.setContentView(view)
            dialog.show()
        }

    }
}

