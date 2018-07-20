package toong.com.androiddaggerkotlin.feature.splash;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashModule {

    @Provides
    String provideA() {
        return "A";
    }
}
