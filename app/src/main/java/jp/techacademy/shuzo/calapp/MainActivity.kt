package jp.techacademy.shuzo.calapp


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import jp.techacademy.shuzo.calapp.R
import android.support.v7.app.AlertDialog

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent = Intent(this, ResoveActivity::class.java)



        try {

            val Va1 = editText1.text.toString()
            val Va2 = editText2.text.toString()


            intent.putExtra("VALUE1", Va1.toDouble())
            intent.putExtra("VALUE2", Va2.toDouble())
            when (v.id) {
                R.id.button1 -> intent.putExtra("VALUE3", "+")
                R.id.button2 -> intent.putExtra("VALUE3", "-")
                R.id.button3 -> intent.putExtra("VALUE3", "*")
                R.id.button4 -> intent.putExtra("VALUE3", "/")
            }
            startActivity(intent)
        } catch (e: Exception) {
            showAlertDialog()

        }
    }


    private fun showAlertDialog() {
        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("入力値エラー")
        alertDialogBuilder.setMessage("数値を入力してください。空白は計算しません")

        // 肯定ボタンに表示される文字列、押したときのリスナーを設定する
        alertDialogBuilder.setPositiveButton("ok") { dialog, which ->
        }
        // AlertDialogを作成して表示する
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }





}
