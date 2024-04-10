package com.ubaya.advweek4160421039.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.ubaya.advweek4160421039.R
import kotlin.Int
import kotlin.String

public class StudentListFragmentDirections private constructor() {
  private data class ActionStudentDetail(
    public val studentId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.actionStudentDetail

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("student_id", this.studentId)
        return result
      }
  }

  public companion object {
    public fun actionStudentDetail(studentId: String): NavDirections =
        ActionStudentDetail(studentId)
  }
}
