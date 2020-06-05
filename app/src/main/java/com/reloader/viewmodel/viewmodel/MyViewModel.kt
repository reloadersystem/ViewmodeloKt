package com.reloader.viewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reloader.viewmodel.domain.FrutasUseCase
import com.reloader.viewmodel.modelo.Frutas

class MyViewModel: ViewModel() {

    val frutasUseCase = FrutasUseCase()

    private val listData = MutableLiveData<List<Frutas>>()

    init {
        getListaFrutas()
    }

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }
//podemos usar corutinas para pedir informacion asynchrona
    fun getListaFrutas(){
        setListData(frutasUseCase.obtenerListaFrutas())
    }

    //LiveData // escucha MutableLiveData si cambio retorna la lista  sino queda igual
    //reaccionamos al evento cuando cambia el valor sin llamar a una funcion updateDatasetChange

    fun getListaFrutasLiveData():LiveData<List<Frutas>>{   // notifica a la  UI los cambios  lo muestra o actualiza
        return listData
    }
}