package com.ubaya.advweek4160421039.view

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.ubaya.advweek4160421039.R
import com.ubaya.advweek4160421039.databinding.StudentListItemBinding
import com.ubaya.advweek4160421039.model.Student

class StudentListAdapter(val studentList:ArrayList<Student>) :RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>(),
        ButtonDetailClickListener{
    class StudentViewHolder(var binding: StudentListItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
//        val binding = StudentListItemBinding.inflate(
//            LayoutInflater.from(parent.context), parent, false)
        val binding = DataBindingUtil.inflate<StudentListItemBinding>(inflater,
            R.layout.student_list_item, parent, false)
        return StudentViewHolder(binding)
    }

    override fun onButtonDetailClick(v: View) {
        val action = StudentListFragmentDirections.actionStudentDetail(v.tag.toString())
        Navigation.findNavController(v).navigate(action)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.binding.student = studentList[position]
        holder.binding.listener = this

//        dengan dataBinding, 2 baris dibawah dapat digantikan dengan 1 baris diatas.
//        holder.binding.txtID.text = studentList[position].id
//        holder.binding.txtName.text = studentList[position].name

//        holder.binding.btnDetail.setOnClickListener {
//            val action = StudentListFragmentDirections.actionStudentDetail(studentList[position].id.toString())
//            Navigation.findNavController(it).navigate(action)
//        }

//        val picasso = Picasso.Builder(holder.itemView.context)
//        picasso.listener { picasso, uri, exception ->
//            exception.printStackTrace()
//        }
//        picasso.build().load(studentList[position].photoUrl).into(holder.binding.imageView)
//        picasso.build().load(studentList[position].photoUrl)
//            .into(holder.binding.imageView, object:Callback {
//                override fun onSuccess() {
//                    holder.binding.progressImage.visibility = View.INVISIBLE
//                    holder.binding.imageView.visibility = View.VISIBLE
//                }
//
//                override fun onError(e: Exception?) {
//                    Log.e("picasso_error", e.toString())
//                }
//
//            })

    }

    fun updateStudentList(newStudentList: ArrayList<Student>) {
        studentList.clear()
        studentList.addAll(newStudentList)
        notifyDataSetChanged()
    }
}