package com.reloader.viewmodel.data

import com.reloader.viewmodel.modelo.Frutas

class FrutasDataSet {

    fun crearListaFrutas(): List<Frutas> {  // return,
        return listOf(
            Frutas("Manzana", "Rojo", 4.5F, 35.5F),
            Frutas("Banana", "Amarillo", 3.5F, 200.5F),
            Frutas("Uvas", "Verde", 10.50F, 100.5F)
        )

    }
}