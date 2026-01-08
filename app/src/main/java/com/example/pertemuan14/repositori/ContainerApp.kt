package com.example.pertemuan14.repositori

import android.app.Application
import androidx.compose.ui.Modifier

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}

class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}