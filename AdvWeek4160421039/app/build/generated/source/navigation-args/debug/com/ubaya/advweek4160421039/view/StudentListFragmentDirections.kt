package com.ubaya.advweek4160421039.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ubaya.advweek4160421039.R

public class StudentListFragmentDirections private constructor() {
  public companion object {
    public fun actionStudentDetail(): NavDirections =
        ActionOnlyNavDirections(R.id.actionStudentDetail)
  }
}
