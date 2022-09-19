package com.yang.hilt.net

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * @author 杨剑
 * @fileName
 * @date 2022-09-08
 * @describe
 * @changeUser
 * @changTime
 */
interface UserService {

    /**
     * 获取用户信息
     */
    @FormUrlEncoded
    @POST("user/login")
    suspend fun userInfo(@Field("username") username:String,
                         @Field("password") password:String
                         ): BaseReqData<LoginReq>

}