package jp.techacademy.shuzo.calapp


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.shuzo.calapp.R
import kotlinx.android.synthetic.main.activity_resove.*

class ResoveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resove)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getStringExtra("VALUE3" )
        var Resove:Double=0.0

        when(value3){
            "+" -> Resove=value1+value2
            "-" -> Resove=value1-value2
            "*" -> Resove=value1*value2
            "/" -> Resove=value1/value2
        }
        textView1.text = Resove.toString()
        textView2.text = value1.toString()

        textView3.text = value2.toString()

    }
}
