package com.reloader.viewmodel.domain

import com.reloader.viewmodel.data.FrutasDataSet
import com.reloader.viewmodel.modelo.Frutas

class FrutasUseCase {

   private val frutasDataSet = FrutasDataSet()

    fun obtenerListaFrutas():List<Frutas>{
        return frutasDataSet.crearListaFrutas()
    }
}