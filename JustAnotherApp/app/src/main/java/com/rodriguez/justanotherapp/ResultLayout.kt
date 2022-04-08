package com.rodriguez.justanotherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.rodriguez.justanotherapp.databinding.ActivityResultLayoutBinding

class ResultLayout : AppCompatActivity() {

    private lateinit var binding: ActivityResultLayoutBinding
    private val viewModel: ResultViewModel by viewModels() //viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val bundle = intent.extras!!
        //en el get se pone el id con el que se mando de la pagina raiz
        val number = bundle.getInt("counter")
        //seteando el textview con el key que se le pasa (numero del contador)
        binding.textNumber.text = number.toString()

        addeventlistener()

    }

    private fun addeventlistener(){
       binding.identificatioBtn.setOnClickListener() {
           viewModel.identification(binding.textNumber.text.toString().toInt())
       }
    }






}