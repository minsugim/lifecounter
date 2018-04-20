package edu.uw.ischool.minsugim.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRoot = findViewById<GridLayout>(R.id.my_root)
        val player1 = findViewById<TextView>(R.id.player1_lives)

        val buttons = arrayOf(R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4,
                                R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8,
                                R.id.button_9, R.id.button_10, R.id.button_11, R.id.button_12,
                                R.id.button_13, R.id.button_14, R.id.button_15, R.id.button_16)

        for (btn in buttons) {
            val button = findViewById<Button>(btn)
            button.setOnClickListener {
                val action = button.text.toString().toInt()
                val parent = button.parent as View
                val player: TextView
                val playerNumber: String
                if (parent.id.equals(R.id.player1)) {
                    player = findViewById(R.id.player1_lives)
                    playerNumber = findViewById<TextView>(R.id.text1).text.toString()
                } else if (parent.id.equals(R.id.player2)) {
                    player = findViewById(R.id.player2_lives)
                    playerNumber = findViewById<TextView>(R.id.text2).text.toString()
                } else if (parent.id.equals(R.id.player_3)) {
                    player = findViewById(R.id.player3_lives)
                    playerNumber = findViewById<TextView>(R.id.text3).text.toString()
                } else {
                    player = findViewById(R.id.player4_lives)
                    playerNumber = findViewById<TextView>(R.id.text4).text.toString()
                }
                val newTotal = player.text.toString().toInt() + button.text.toString().toInt()
                if (newTotal > 0 ) {
                    player.text = newTotal.toString()
                } else {
                    val toast = Toast.makeText(applicationContext, playerNumber + "LOSES!", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }

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