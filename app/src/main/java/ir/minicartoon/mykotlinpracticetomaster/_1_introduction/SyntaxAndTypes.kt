package ir.minicartoon.mykotlinpracticetomaster._1_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.minicartoon.mykotlinpracticetomaster.R

class SyntaxAndTypes : AppCompatActivity() {
    private val TAG = "tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syntax_and_types)

        Log.i(TAG, "sum of 3 and 5 is: ${sum(2, 3)} ")
        Log.i(TAG, "sum2 of 3 and 5 is: ${sum2(2, 3)} ")
        sum3(8, 3)
        readOnlyLocal()
        mutableVariables()
        stringTemplate()
        maxOf(2,40)
        Log.i(TAG, "maxOf2:${maxOf2(0,42)} ")
    }

    ///////////////////////////..........Defining Functions.......////////////////////////

    //function having two parameters and with int return type:
    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //function with expression body and inferred return types
    private fun sum2(a: Int, b: Int) = a + b

    //function with no meaningful value:
    private fun sum3(a: Int, b: Int): Unit {
        Log.i(TAG, "sum3(Unit): $a+$b is ${a + b} ")
    }

    ////////////////////.................Defining Local Variables.............///////////////////

    //Assign_Once(readOnly) local var #value
    private fun readOnlyLocal() {
        val a: Int = 2  //immediate Assignment
        val b = 3     //'Int' Type is inferred
        val c: Int   // Type required when no initializer is provided
        c = 4          // deferred assignment

        Log.i(TAG, "readOnlyLocal: a=$a,b=$b,c=$c")
    }

    //mutable variables #variable
    private fun mutableVariables() {
        var x = 5 // 'Int' type inferred
        x += 1
        Log.i(TAG, "mutableVariables: x=$x")

    }
    ////////////////////.................Using String Template.............///////////////////

    private fun stringTemplate() {
        var a = 1
        //simple String Template
        val s1 = "the a is  $a"

        a = 2
        //arbitrary expression in template
        val s2 = "${s1.replace("is", "was")}, but now $a "
        Log.i(TAG, "stringTemplate: $s2 ")
    }


////////////////////.................Using Conditional expression.............///////////////////

    private fun maxOf(a: Int, b: Int) {
        var s1 : Int
        if (a > b) {
            s1 = a
        } else {
            s1 = b
        }
      ///or like this Syntax ->
      //  val s1 : Int = if (a > b) a else b


        Log.i(TAG, "maxOf: $s1")

    }

    //using if as an expression
    private fun maxOf2(a: Int, b: Int)=if (a > b) a else b



//////////////////.............Using Nullable values and checking for Null .............///////////








































































}