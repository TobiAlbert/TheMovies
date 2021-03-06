package com.mobile.app.themovies.injection.modudles

import com.mobile.app.data.MoviesService
import com.mobile.app.data.repository.MoviesRepository
import com.mobile.app.themovies.domain.ISchedulersFactory
import com.mobile.app.themovies.SchedulersFactory
import com.mobile.app.themovies.domain.repository.IMoviesRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton
    fun providesMoviesService(retrofit: Retrofit) = retrofit.create(MoviesService::class.java)

    @Provides
    @Singleton
    fun providesSchedulersFactory(): ISchedulersFactory = SchedulersFactory()

    @Provides
    @Singleton
    fun providesMoviesRepository(moviesRepository: MoviesRepository): IMoviesRepository = moviesRepository
}