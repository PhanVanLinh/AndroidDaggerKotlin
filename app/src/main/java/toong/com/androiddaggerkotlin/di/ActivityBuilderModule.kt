package com.hieupham.absolutecleanarchitecturekt.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import toong.com.androiddaggerkotlin.feature.splash.SplashActivity
import toong.com.androiddaggerkotlin.feature.splash.SplashModule

/**
 * The [Module] class declares how to inject an Activity instance into corresponding
 * {@link Module}
 */
@Module
abstract class ActivityBuilderModule {

//    @ContributesAndroidInjector(modules = [MainModule::class])
//    @ActivityScope
//    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SplashModule::class])
    @ActivityScope
    internal abstract fun bindSplashActivity(): SplashActivity
}