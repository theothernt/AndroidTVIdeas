package com.neilturner.fadeloop.di

import com.neilturner.fadeloop.data.repository.VideoRepository
import com.neilturner.fadeloop.ui.player.PlayerViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // Singleton definition for the Repository
    single { VideoRepository() }

    // ViewModel definition
    viewModel { PlayerViewModel(get()) }
}
