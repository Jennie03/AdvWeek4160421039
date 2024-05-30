package com.ubaya.advweek4160421039.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u001e\u0010\u0018\u001a\u00020\u000e2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/ubaya/advweek4160421039/view/StudentListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ubaya/advweek4160421039/view/StudentListAdapter$StudentViewHolder;", "Lcom/ubaya/advweek4160421039/view/ButtonDetailClickListener;", "studentList", "Ljava/util/ArrayList;", "Lcom/ubaya/advweek4160421039/model/Student;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getStudentList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onButtonDetailClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateStudentList", "newStudentList", "StudentViewHolder", "app_debug"})
public final class StudentListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ubaya.advweek4160421039.view.StudentListAdapter.StudentViewHolder> implements com.ubaya.advweek4160421039.view.ButtonDetailClickListener {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.ubaya.advweek4160421039.model.Student> studentList = null;
    
    public StudentListAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.ubaya.advweek4160421039.model.Student> studentList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.ubaya.advweek4160421039.model.Student> getStudentList() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ubaya.advweek4160421039.view.StudentListAdapter.StudentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onButtonDetailClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.ubaya.advweek4160421039.view.StudentListAdapter.StudentViewHolder holder, int position) {
    }
    
    public final void updateStudentList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.ubaya.advweek4160421039.model.Student> newStudentList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/ubaya/advweek4160421039/view/StudentListAdapter$StudentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ubaya/advweek4160421039/databinding/StudentListItemBinding;", "(Lcom/ubaya/advweek4160421039/databinding/StudentListItemBinding;)V", "getBinding", "()Lcom/ubaya/advweek4160421039/databinding/StudentListItemBinding;", "setBinding", "app_debug"})
    public static final class StudentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.ubaya.advweek4160421039.databinding.StudentListItemBinding binding;
        
        public StudentViewHolder(@org.jetbrains.annotations.NotNull
        com.ubaya.advweek4160421039.databinding.StudentListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ubaya.advweek4160421039.databinding.StudentListItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.ubaya.advweek4160421039.databinding.StudentListItemBinding p0) {
        }
    }
}