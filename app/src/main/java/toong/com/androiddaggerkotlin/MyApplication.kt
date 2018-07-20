package toong.com.androiddaggerkotlin

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import toong.com.androiddaggerkotlin.di.DaggerAppComponent

class MyApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}
