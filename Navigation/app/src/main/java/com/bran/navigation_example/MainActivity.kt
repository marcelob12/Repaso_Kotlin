package com.bran.navigation_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.bran.navigation_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //aplicando databindind para poder acceder a todos los botones,text, etc del activity main sin estar declarando IDs
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //sacamos el navhostfragment para poder manejar las acciones con los fgragmentos en la app
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_hots_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.actionChange.setOnClickListener {
            //con esto llamamos la accion en el boton para que se mueva de un fragmento (1) al (2)
            //pero al presionar el boton se sobre pone la misma ventana las veces que se preciona el boton
            navController.navigate(R.id.lastNameFragment)

        }
    }
}