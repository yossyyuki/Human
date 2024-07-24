package jp.techacademy.yoshiyuki.okumura.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val Human = Human("yoshi", 39)      // 名前をyoshi、年齢39歳で、Humanのインスタンスを作る

        Human.say()
        Log.d("kotlintest", "私の名前は" + Human.name + "です。")
        Log.d("kotlintest", "年は" + Human.age + "歳です。")
    }
    }
