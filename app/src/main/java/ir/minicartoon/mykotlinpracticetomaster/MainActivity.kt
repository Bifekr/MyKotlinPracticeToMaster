package ir.minicartoon.mykotlinpracticetomaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import ir.minicartoon.mykotlinpracticetomaster._1_introduction.SyntaxAndTypes
import ir.minicartoon.mykotlinpracticetomaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        var tx1=findViewById<TextView>(R.id.tx1)
        startActivity(Intent(this,SyntaxAndTypes::class.java))
    }
}