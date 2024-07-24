package jp.techacademy.yoshiyuki.okumura.kotlinlog

import android.util.Log

open class Human:Animal {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
    }
//    Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)")
    }
}

    // Thinkableインターフェイスのメソッドをオーバーライド
//    override fun think() {
//        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
//    }
//}
