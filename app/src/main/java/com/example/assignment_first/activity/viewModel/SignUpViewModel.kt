package com.example.assignment_first.activity.viewModel

import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModel
import com.example.assignment_first.activity.Interface.SignUpCallBack
import com.example.assignment_first.activity.model.User

class SignUpViewModel(private  val listener :SignUpCallBack) :ViewModel() ,TextWatcher{

    private  val user : User? =null

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        TODO("Not yet implemented")
    }

}


