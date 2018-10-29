package com.crnaosa.daggerProject.lobby;

import dagger.Module;
import dagger.Provides;

@Module
public class LobbyActivityModule {

    @Provides
    LobbyHelloService provideLobbyHelloService() {
        return new LobbyHelloService();
    }
}