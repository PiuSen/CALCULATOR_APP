package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ac.setOnClickListener {
            binding.text1.text = ""
            binding.text2.text = ""
        }
        binding.zero.setOnClickListener {
            binding.text1.append("0")
        }
        binding.one.setOnClickListener {
            binding.text1.append("1")
        }
        binding.two.setOnClickListener {
            binding.text1.append("2")
        }
        binding.three.setOnClickListener {
            binding.text1.append("3")
        }
        binding.four.setOnClickListener {
            binding.text1.append("4")
        }
        binding.five.setOnClickListener {
            binding.text1.append("5")
        }

        binding.six.setOnClickListener {
            binding.text1.append("6")
        }
        binding.seven.setOnClickListener {
            binding.text1.append("7")
        }
        binding.eight.setOnClickListener {
            binding.text1.append("8")
        }
        binding.nine.setOnClickListener {
            binding.text1.append("9")
        }
        binding.dot.setOnClickListener {
            binding.text1.append(".")
        }
        binding.plus.setOnClickListener {
            binding.text1.append("+")
        }
        binding.minus.setOnClickListener {
            binding.text1.append("-")
        }
        binding.multiply.setOnClickListener {
            binding.text1.append("*")
        }
        binding.division.setOnClickListener {
            binding.text1.append("/")
        }
        binding.percentage.setOnClickListener {
            binding.text1.append("%")
        }
        binding.openBracket.setOnClickListener {
            binding.text1.append("(")
        }
        binding.closeBracket.setOnClickListener {
            binding.text1.append(")")
        }
        binding.equal.setOnClickListener {
            val expression= ExpressionBuilder(binding.text1.text.toString()).build()
             val result=expression.evaluate()
            val longresult=result.toLong()
            if(result==longresult.toDouble()){
                binding.text2.text=longresult.toString()

            }
            else{
                binding.text2.text=result.toString()
            }
        }
    }
}
