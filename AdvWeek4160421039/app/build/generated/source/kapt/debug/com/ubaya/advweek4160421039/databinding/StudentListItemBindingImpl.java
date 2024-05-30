package com.ubaya.advweek4160421039.databinding;
import com.ubaya.advweek4160421039.R;
import com.ubaya.advweek4160421039.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StudentListItemBindingImpl extends StudentListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 5);
        sViewsWithIds.put(R.id.progressImage, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnButtonDetailClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public StudentListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private StudentListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.btnDetail.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtID.setTag(null);
        this.txtName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.student == variableId) {
            setStudent((com.ubaya.advweek4160421039.model.Student) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.ubaya.advweek4160421039.view.ButtonDetailClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStudent(@Nullable com.ubaya.advweek4160421039.model.Student Student) {
        this.mStudent = Student;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.student);
        super.requestRebind();
    }
    public void setListener(@Nullable com.ubaya.advweek4160421039.view.ButtonDetailClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ubaya.advweek4160421039.model.Student student = mStudent;
        java.lang.String studentId = null;
        android.view.View.OnClickListener listenerOnButtonDetailClickAndroidViewViewOnClickListener = null;
        java.lang.String studentPhotoUrl = null;
        java.lang.String studentName = null;
        com.ubaya.advweek4160421039.view.ButtonDetailClickListener listener = mListener;

        if ((dirtyFlags & 0x5L) != 0) {



                if (student != null) {
                    // read student.id
                    studentId = student.getId();
                    // read student.photoUrl
                    studentPhotoUrl = student.getPhotoUrl();
                    // read student.name
                    studentName = student.getName();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (listener != null) {
                    // read listener::onButtonDetailClick
                    listenerOnButtonDetailClickAndroidViewViewOnClickListener = (((mListenerOnButtonDetailClickAndroidViewViewOnClickListener == null) ? (mListenerOnButtonDetailClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnButtonDetailClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnDetail.setTag(studentId);
            com.ubaya.advweek4160421039.view.BindingAdapterKt.loadPhotoURL(this.imageView, studentPhotoUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtID, studentId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtName, studentName);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.btnDetail.setOnClickListener(listenerOnButtonDetailClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.ubaya.advweek4160421039.view.ButtonDetailClickListener value;
        public OnClickListenerImpl setValue(com.ubaya.advweek4160421039.view.ButtonDetailClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onButtonDetailClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): student
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}