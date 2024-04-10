package com.ubaya.advweek4160421039.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.ubaya.advweek4160421039.model.Student

class DetailViewModel(application: Application): AndroidViewModel(application) {
    val studentLD = MutableLiveData<Student>()

    val TAG = "volleyTag"
    private var queue: RequestQueue? = null

    fun fetch(studentId: String){
        val urlOrigin = "http://adv.jitusolution.com/student.php?id=" + studentId

        queue = Volley.newRequestQueue(getApplication())
        val stringRequest = StringRequest(
            Request.Method.GET, urlOrigin,
            {
                val result = Gson().fromJson(it, Student::class.java)
                studentLD.value = result
                Log.d("showvoleydetail", it)
            },
            {
                Log.d("showvoleydetail", it.toString())
            })

        stringRequest.tag = TAG
        queue?.add(stringRequest)
    }

//    fun fetch() {
//        val student1 = Student("16055","Nonie","1998/03/28","5718444778","http://dummyimage.com/75x100.jpg/cc0000/ffffff")
//        studentLD.value = student1
//    }

}
