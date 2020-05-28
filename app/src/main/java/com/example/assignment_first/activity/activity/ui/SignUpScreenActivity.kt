package com.example.assignment_first.activity.activity.ui

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.example.assignment_first.R
import com.example.assignment_first.activity.utils.Util

class SignUpScreenActivity : AppCompatActivity(), TextWatcher, View.OnClickListener {

    private var mIsShowPass: Boolean = false
    private var mPassET: EditText? = null
    private var mPassIV: ImageView? = null
    private var mNameET: EditText? = null
    private var mEmailET: EditText? = null
    private var mArrowUnselectBTN: Button? = null
    private var mBackBTN: ImageView? = null
    private var mArrowSelectBTN: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        getAllIDS()
        mArrowUnselectBTN!!.setOnClickListener(this)
        mArrowSelectBTN!!.setOnClickListener(this)
        mBackBTN!!.setOnClickListener(this)
        mNameET?.addTextChangedListener(this)
        mEmailET?.addTextChangedListener(this)
        mPassET?.addTextChangedListener(this)


        mPassIV!!.setOnClickListener {
            mIsShowPass = !mIsShowPass
            showPassword(mIsShowPass)

        }
        showPassword(mIsShowPass)

    }

    private fun getAllIDS() {
        mPassET = findViewById(R.id.et_password)
        mPassIV = findViewById(R.id.iv_showPass)
        mNameET = findViewById(R.id.et_name)
        mEmailET = findViewById(R.id.et_email)
        mArrowSelectBTN = findViewById(R.id.btn_arrow_select)
        mArrowUnselectBTN = findViewById(R.id.btn_arrow_unselect)
        mBackBTN = findViewById(R.id.iv_back)

    }

    private fun showPassword(isShow: Boolean) {
        if (isShow) {
            mPassET?.transformationMethod = HideReturnsTransformationMethod.getInstance()
            mPassIV?.setImageResource(R.drawable.visibility_off)
        } else {
            mPassET?.transformationMethod = PasswordTransformationMethod.getInstance()
            mPassIV?.setImageResource(R.drawable.visibility)
        }
        mPassET?.setSelection(mPassET?.text.toString().length)
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        val mUserName = mNameET?.text.toString().trim()
        val mUserEmail = mEmailET?.text.toString().trim()
        val mUserPass = mPassET?.text.toString().trim()
        if (Util.isValidEmail(mUserEmail)) {
            mEmailET?.error = "Valid Email"
        }
        if (mUserName.isNotEmpty() && mUserEmail.isNotEmpty() && mUserPass.isNotEmpty()) {
            mArrowSelectBTN!!.visibility = View.VISIBLE
            mArrowUnselectBTN!!.visibility = View.GONE
        } else {
            mArrowUnselectBTN!!.visibility = View.VISIBLE
            mArrowSelectBTN!!.visibility = View.GONE
        }
    }
    override fun afterTextChanged(editable: Editable?) {
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.iv_back -> finish()
            }
        }
    }
}







