package edu.uw.ischool.minsugim.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRoot = findViewById<GridLayout>(R.id.my_root)
        val player1 = findViewById<TextView>(R.id.player1_lives)


//            player1.findViewWithTag<Button>("button").setOnClickListener {
//                var lives = player1.text.toString().toInt()
//                lives++
//                player1.setText(lives.toString())
//            }

    }
}

//class Player(val player: String = "") {
//    var lives: Int = 20
//
//    inner class PlusButton : Button {
//        constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//
//        override fun setOnClickListener(l: OnClickListener?) {
//            lives++
//        }
//    }
//
//    inner class minusButton : Button {
//        constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//
//        override fun setOnClickListener(l: OnClickListener?) {
//            lives--
//        }
//    }
//}