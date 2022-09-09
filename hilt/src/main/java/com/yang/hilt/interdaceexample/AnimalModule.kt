package com.yang.hilt.interdaceexample

import com.yang.hilt.interdaceexample.annotations.CatImp
import com.yang.hilt.interdaceexample.annotations.DogImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author 杨剑
 * @fileName
 * @date 2022-09-09
 * @describe
 * @changeUser
 * @changTime
 */


@Module
@InstallIn(SingletonComponent::class)
abstract class AnimalModule {

    @Binds
    @CatImp
    abstract fun provideCat(cat: Cat): Animal


    @Binds
    @DogImp
    abstract fun provideDog(dog: Dog): Animal

}