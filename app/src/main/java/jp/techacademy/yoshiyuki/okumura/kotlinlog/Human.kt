package jp.techacademy.yoshiyuki.okumura.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
        //        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。" )
    }
}