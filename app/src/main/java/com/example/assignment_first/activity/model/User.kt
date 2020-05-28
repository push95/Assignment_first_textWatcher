package com.example.assignment_first.activity.model

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import java.util.regex.Pattern

class User(private  var userEmail : String ,private var userPassword : String , private var userName : String ):BaseObservable() {


    val isDataValid :Boolean
    get() = (!TextUtils.isEmpty(getEmail()))
            && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
            && getPassword().length > 6
            && getName().isNotEmpty()

     fun getPassword() :String{
         return userPassword

    }

    fun getEmail(): String {
        return userEmail

    }

    fun getName(): String {
        return userName

    }

    fun setEmail(userEmail: String) {
        this.userEmail= userEmail

    }

    fun setPassword(userPassword: String) {
        this.userPassword= userPassword

    }

    fun setName(userName: String) {
        this.userName= userName

    }
}