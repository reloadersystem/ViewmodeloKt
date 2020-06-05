package com.reloader.viewmodel.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.reloader.viewmodel.R
import com.reloader.viewmodel.modelo.Frutas
import com.reloader.viewmodel.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {
    //todas las variables se tienen que inicializar
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        val frutasObserver = Observer<List<Frutas>>{

            //Log.d("Frutas", it.toString())

            for (fruta in it){
                Log.d("Frutas", fruta.nombreFruta)
            }

            for ((index , value) in it.withIndex()){
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }

        viewModel.getListaFrutasLiveData().observe(this, frutasObserver)


    }
}
