package com.crnaosa.daggerProject.di;

import android.content.Context;

import com.crnaosa.daggerProject.common.CommonHelloService;
import com.crnaosa.daggerProject.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    CommonHelloService provideCommonHelloService() {
        return new CommonHelloService();
    }
}