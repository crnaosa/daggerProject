package com.crnaosa.daggerProject.di;

import com.crnaosa.daggerProject.lobby.LobbyActivity;
import com.crnaosa.daggerProject.lobby.LobbyActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = LobbyActivityModule.class)
    abstract LobbyActivity bindLobbyActivity();

    // Add bindings for other sub-components here
}