package com.rodriguez.justanotherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.rodriguez.justanotherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //dataBinding
    private val viewModel: MainViewModel by viewModels() //viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //DataBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Asignar al viewmodel del binding
        binding.viewModel = viewModel

        //Observar los cambios en los datos
        binding.lifecycleOwner = this

        addListeners()
    }

    private fun addListeners(){
        binding.button.setOnClickListener(){
            viewModel.subtract(1)
        }

        binding.button2.setOnClickListener(){
            viewModel.add(1)
        }

        binding.sendBtn.setOnClickListener(){
            openResult()
        }
    }



    //enviando los datos al ResultLayout (la 2da pantalla)
    private fun openResult(){
        val intent = Intent(this, ResultLayout::class.java)

        //name Id de lo que se manda a la otra pagina
        intent.putExtra("counter", viewModel.counter.value)
        startActivity(intent)
    }

}