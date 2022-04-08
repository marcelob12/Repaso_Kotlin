package com.bran.navigation_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bran.navigation_example.databinding.FragmentLastNameBinding

class LastNameFragment : Fragment() {

    //obteniendo las variables de cualquier lado
    private val args: LastNameFragmentArgs by navArgs()
    private lateinit var biding: FragmentLastNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        biding = DataBindingUtil.inflate(inflater,R.layout.fragment_last_name, container, false)
        return biding.root
        //recibir argumentos
        args.name
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding
    }

}