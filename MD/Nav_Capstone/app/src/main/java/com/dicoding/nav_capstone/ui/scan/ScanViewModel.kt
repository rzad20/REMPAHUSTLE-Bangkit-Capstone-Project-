package com.dicoding.nav_capstone.ui.scan

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.nav_capstone.data.local.database.FavoriteRempah
import com.dicoding.nav_capstone.data.repository.RempahRepository
import java.io.File

class ScanViewModel(private val rempahRepository: RempahRepository) : ViewModel() {
    fun uploadImage(file: File) = rempahRepository.scanImage(file)
    private var scannedItemId: String? = null

    fun setScannedItemId(idRempah: String) {
        scannedItemId = idRempah
    }

    fun getScannedItemId(): String? {
        return scannedItemId
    }
}