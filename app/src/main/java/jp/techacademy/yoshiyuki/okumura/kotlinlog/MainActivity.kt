package jp.techacademy.yoshiyuki.okumura.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        クラス
        val human = Human("yoshi", 39,"オリンピック" ) //名前をyoshi、年齢39歳、hobbyで、Humanのインスタンスを作る

        human.say()
//        Log.d("kotlintest", "わたしの名前は" + human.name + "です。")
//        Log.d("kotlintest", "年は" + human.age + "歳です。")

        human.think()
    }
}