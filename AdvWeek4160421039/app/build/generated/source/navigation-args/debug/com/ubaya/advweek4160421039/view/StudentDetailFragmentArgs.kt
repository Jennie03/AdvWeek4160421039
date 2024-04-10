package com.ubaya.advweek4160421039.view

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class StudentDetailFragmentArgs(
  public val studentId: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("student_id", this.studentId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("student_id", this.studentId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): StudentDetailFragmentArgs {
      bundle.setClassLoader(StudentDetailFragmentArgs::class.java.classLoader)
      val __studentId : String?
      if (bundle.containsKey("student_id")) {
        __studentId = bundle.getString("student_id")
        if (__studentId == null) {
          throw IllegalArgumentException("Argument \"student_id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"student_id\" is missing and does not have an android:defaultValue")
      }
      return StudentDetailFragmentArgs(__studentId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): StudentDetailFragmentArgs {
      val __studentId : String?
      if (savedStateHandle.contains("student_id")) {
        __studentId = savedStateHandle["student_id"]
        if (__studentId == null) {
          throw IllegalArgumentException("Argument \"student_id\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"student_id\" is missing and does not have an android:defaultValue")
      }
      return StudentDetailFragmentArgs(__studentId)
    }
  }
}
