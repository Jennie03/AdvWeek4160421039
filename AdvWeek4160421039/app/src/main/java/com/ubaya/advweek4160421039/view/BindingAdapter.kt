package com.ubaya.advweek4160421039.view

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.ubaya.advweek4160421039.R
import java.lang.Exception
import kotlin.math.log

@BindingAdapter("android:imageUrl")
fun loadPhotoURL(imageView: ImageView, url:String) {
    val picasso = Picasso.Builder(imageView.context)
    picasso.listener { picasso, uri, exception ->
        exception.printStackTrace()
    }
    picasso.build().load(url).into(imageView, object : Callback{
        override fun onSuccess() {
            (imageView.parent as? View)?.let { parent->
                parent.findViewById<View>(R.id.progressImage)?.visibility = View.INVISIBLE
                imageView.visibility = View.VISIBLE
            }
        }

        override fun onError(e: Exception?) {
            Log.e("picasso_error", e.toString())
        }
    })
}