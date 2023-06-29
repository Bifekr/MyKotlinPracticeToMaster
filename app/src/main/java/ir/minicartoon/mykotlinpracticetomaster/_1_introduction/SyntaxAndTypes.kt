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

        maxOf(2, 40)
        Log.i(TAG, "maxOf2:${maxOf2(0, 42)} ")

        Log.i(TAG, "printProduct: ${printProduct("6", "7")} ")
        Log.i(TAG, "printProduct: ${printProduct("a", "7")} ")
        Log.i(TAG, "printProduct: ${printProduct("a", "b")} ")
        printProduct("a", "2")

        forLoop()
        forLoop2()
        whileLoop()
        intOutOfRange()
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
        var s1: Int
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
    private fun maxOf2(a: Int, b: Int) = if (a > b) a else b


//////////////////.............Using Nullable values and checking for Null .............///////////

    // A Reference must be explicitly marked as nullable when null value is possible
    //Return null if str does not hold an Integer
    private fun parsInt(str: String): Int? {

        return (str.toIntOrNull())

    }

    private fun printProduct(arg: String, arg2: String) {
        val x = parsInt(arg)
        val y = parsInt(arg2)
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        } else {
            Log.i(TAG, "printProduct: either '$arg' or '$arg2' is not a number ")
        }

        /*or
        *     if (x == null) {
        println("Wrong number format in arg1: '${arg1}'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '${arg2}'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}*/
    }


////////////////////////.............Using a For Loop.......... .............//////////////////


    private fun forLoop() {
        val items = listOf<String>("apple", "orange", "kiwi")
        for (item in items) {
            Log.i(TAG, "forLoop: $item")
        }

    }

    private fun forLoop2() {
        val items = listOf("apple", "orange", "kiwi")
        for (item in items.indices) {
            // Log.i(TAG, "forLoop2: item at $item is $items[$item]")
            Log.i(TAG, "forLoop2: item at $item is ${items[item]}")
        }
    }


////////////////////////.............Using a while Loop.......... .............//////////////////

    private fun whileLoop() {
        val items = listOf<String>("apple", "orange", "kiwi")
        var index = 0
        while (index < items.size) {
            Log.i(TAG, "whileLoop: item at index $index is ${items[index]}")
            index++
        }
    }


////////////////////////.............Using a when Loop.......... .............//////////////////


    //sampleStart
    private fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
//sampleEnd

    fun describe2() {
        Log.i(TAG, "main: ${describe(1)}")
        println(describe("Hello"))
        println(describe(1000L))
        println(describe(2))
        println(describe("other"))
    }


////////////////////////.............Using Ranges.......... ............./////////////////////

    //Check if a number is within a range using in operator:
    fun main(args: Array<String>) {
//sampleStart
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }
//sampleEnd
    }


//Check if a number is out of range:

    private fun intOutOfRange() {
        val list = listOf("a", "b", "c", "d", "e")
        if (list.size !in list.indices) {
            Log.i(TAG, "intOutOfRange: list size is out of valid list indices range too")
            Log.i(TAG, "intOutOflist.indices: ${list.indices}")
            Log.i(TAG, "intOutOflist.size: ${list.size}")
        }
    }

//Iterating over a range:

    fun iteratingOverRange(args: Array<String>) {

        for (x in 1..5) {
            print(x)
        }

    }
  //  or over a progression:

    fun progression(args: Array<String>) {

        for (x in 1..10 step 2) {
            print(x)
        }
        for (x in 9 downTo 0 step 3) {
            print(x)
        }

    }


///////////////////////...............Using collections...................//////////////////////























}