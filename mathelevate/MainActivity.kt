package com.example.mathelevate

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    private var b1: Button? = null
    private var b2: Button? = null
    private var b3: Button? = null
    private var b4: Button? = null
    private var b5: Button? = null
    private var b6: Button? = null
    private var b7: Button? = null
    private var b8: Button? = null
    private var b9: Button? = null
    private var b0: Button? = null
    private var bdot: Button? = null
    private var bpi: Button? = null
    private var bequal: Button? = null
    private var bplus: Button? = null
    private var bmin: Button? = null
    private var bmul: Button? = null
    private var bdiv: Button? = null
    private var binv: Button? = null
    private var bsqrt: Button? = null
    private var bsquare: Button? = null
    private var bfact: Button? = null
    private var bln: Button? = null
    private var blog: Button? = null
    private var btan: Button? = null
    private var bcos: Button? = null
    private var bsin: Button? = null
    private var bb1: Button? = null
    private var bb2: Button? = null
    private var bc: Button? = null
    private var bac: Button? = null
    private var tvmain: TextView? = null
    private var tvsec: TextView? = null
    private var pi = "3.14159265"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeButtons()
        setOnClickListeners()
    }

    private fun initializeButtons() {
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b0 = findViewById(R.id.b0)
        bpi = findViewById(R.id.bpi)
        bdot = findViewById(R.id.bdot)
        bequal = findViewById(R.id.bequal)
        bplus = findViewById(R.id.bplus)
        bmin = findViewById(R.id.bmin)
        bmul = findViewById(R.id.bmul)
        bdiv = findViewById(R.id.bdiv)
        binv = findViewById(R.id.binv)
        bsqrt = findViewById(R.id.bsqrt)
        bsquare = findViewById(R.id.bsquare)
        bfact = findViewById(R.id.bfact)
        bln = findViewById(R.id.bln)
        blog = findViewById(R.id.blog)
        btan = findViewById(R.id.btan)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        bb1 = findViewById(R.id.bb1)
        bb2 = findViewById(R.id.bb2)
        bc = findViewById(R.id.bc)
        bac = findViewById(R.id.bac)

        tvmain = findViewById(R.id.tvmain)
        tvsec = findViewById(R.id.tvsec)
    }

    @SuppressLint("SetTextI18n")
    private fun setOnClickListeners() {
        b1?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "1"
        }

        b2?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "2"
        }

        b3?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "3"
        }

        b4?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "4"
        }

        b5?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "5"
        }

        b6?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "6"
        }

        b7?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "7"
        }

        b8?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "8"
        }

        b9?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "9"
        }

        b0?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "0"
        }

        bdot?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "."
        }

        bac?.setOnClickListener {
            tvmain?.text = ""
            tvsec?.text = ""
        }

        bc?.setOnClickListener {
            var value = tvmain?.text.toString()
            value = value.substring(0, value.length - 1)
            tvmain?.text = value
        }

        bplus?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "+"
        }

        bmin?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "-"
        }

        bmul?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "×"
        }

        bdiv?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "÷"
        }

        bsqrt?.setOnClickListener {
            val value = tvmain?.text.toString()
            val r = sqrt(value.toDouble())
            tvmain?.text = r.toString()
        }

        bb1?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "("
        }

        bb2?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + ")"
        }

        bpi?.setOnClickListener {
            tvsec?.text = bpi?.text
            tvmain?.text = tvmain?.text.toString() + pi
        }

        bsin?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "sin"
        }

        bcos?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "cos"
        }

        btan?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "tan"
        }

        binv?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "^(-1)"
        }

        bfact?.setOnClickListener {
            val value = tvmain?.text.toString().toInt()
            val fact = factorial(value)
            tvmain?.text = fact.toString()
            tvsec?.text = "$value!"
        }

        bsquare?.setOnClickListener {
            val d = tvmain?.text.toString().toDouble()
            val square = d * d
            tvmain?.text = square.toString()
            tvsec?.text = "$d²"
        }

        bln?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "ln"
        }

        blog?.setOnClickListener {
            tvmain?.text = tvmain?.text.toString() + "log"
        }

        bequal?.setOnClickListener {
            val value = tvmain?.text.toString()
            val replacedStr = value.replace('÷', '/').replace('×', '*')
            val result = eval(replacedStr)
            tvmain?.text = result.toString()
            tvsec?.text = value
        }
    }

    // Factorial function
    private fun factorial(n: Int): Int {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    companion object {
        // Eval function
        fun eval(str: String): Double {
            return object {
                var pos = -1
                var ch = 0

                private fun nextChar() {
                    ch = if (++pos < str.length) str[pos].code else -1
                }

                private fun eat(charToEat: Int): Boolean {
                    while (ch == ' '.code) nextChar()
                    if (ch == charToEat) {
                        nextChar()
                        return true
                    }
                    return false
                }

                fun parse(): Double {
                    nextChar()
                    val x = parseExpression()
                    if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                    return x
                }

                // Grammar:
                // expression = term | expression `+` term | expression `-` term
                // term = factor | term `*` factor | term `/` factor
                // factor = `+` factor | `-` factor | `(` expression `)`
                //        | number | functionName factor | factor `^` factor
                private fun parseExpression(): Double {
                    var x = parseTerm()
                    while (true) {
                        x = when {
                            eat('+'.code) -> x + parseTerm() // addition
                            eat('-'.code) -> x - parseTerm() // subtraction
                            else -> return x
                        }
                    }
                }

                private fun parseTerm(): Double {
                    var x = parseFactor()
                    while (true) {
                        x = when {
                            eat('*'.code) -> x * parseFactor() // multiplication
                            eat('/'.code) -> x / parseFactor() // division
                            else -> return x
                        }
                    }
                }

                private fun parseFactor(): Double {
                    if (eat('+'.code)) return parseFactor() // unary plus
                    return if (eat('-'.code)) -parseFactor() // unary minus
                    else {
                        var x: Double
                        val startPos = pos
                        if (eat('('.code)) { // parentheses
                            x = parseExpression()
                            eat(')'.code)
                        } else if (ch in '0'.code..'9'.code || ch == '.'.code) { // numbers
                            while (ch in '0'.code..'9'.code || ch == '.'.code) nextChar()
                            x = str.substring(startPos, pos).toDouble()
                        } else if (ch in 'a'.code..'z'.code) { // functions
                            while (ch in 'a'.code..'z'.code) nextChar()
                            val func = str.substring(startPos, pos)
                            x = parseFactor()
                            x = when (func) {
                                "sqrt" -> sqrt(x)
                                "sin" -> sin(Math.toRadians(x))
                                "cos" -> cos(Math.toRadians(x))
                                "tan" -> tan(Math.toRadians(x))
                                "log" -> log10(x)
                                "ln" -> ln(x)
                                else -> throw RuntimeException("Unknown function: $func")
                            }
                        } else {
                            throw RuntimeException("Unexpected: " + ch.toChar())
                        }
                        if (eat('^'.code)) x = x.pow(parseFactor()) // exponentiation
                        x
                    }
                }
            }.parse()
        }
    }
}
