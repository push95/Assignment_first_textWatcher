package com.example.assignment_first.activity.utils

import java.util.regex.Pattern

class Util {
    companion object{



        fun isValidEmail(email :String) :Boolean{
            val regex ="^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
            val  pattern =Pattern.compile(regex , Pattern.CASE_INSENSITIVE)
            val matcher =pattern.matcher(email)
            return matcher.matches()
        }
    }
}