// Generated by data binding compiler. Do not edit!
package com.ubaya.advweek4160421039.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ubaya.advweek4160421039.R;
import com.ubaya.advweek4160421039.model.Student;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class StudentListItemBinding extends ViewDataBinding {
  @NonNull
  public final Button btnDetail;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView txtID;

  @NonNull
  public final TextView txtName;

  @Bindable
  protected Student mStudent;

  protected StudentListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnDetail, CardView cardView, ImageView imageView, TextView txtID, TextView txtName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDetail = btnDetail;
    this.cardView = cardView;
    this.imageView = imageView;
    this.txtID = txtID;
    this.txtName = txtName;
  }

  public abstract void setStudent(@Nullable Student student);

  @Nullable
  public Student getStudent() {
    return mStudent;
  }

  @NonNull
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.student_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<StudentListItemBinding>inflateInternal(inflater, R.layout.student_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.student_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<StudentListItemBinding>inflateInternal(inflater, R.layout.student_list_item, null, false, component);
  }

  public static StudentListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static StudentListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (StudentListItemBinding)bind(component, view, R.layout.student_list_item);
  }
}
