package com.ubaya.advweek4160421039.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/ubaya/advweek4160421039/viewmodel/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "queue", "Lcom/android/volley/RequestQueue;", "studentLD", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ubaya/advweek4160421039/model/Student;", "getStudentLD", "()Landroidx/lifecycle/MutableLiveData;", "fetch", "", "studentId", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.ubaya.advweek4160421039.model.Student> studentLD = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "volleyTag";
    @org.jetbrains.annotations.Nullable
    private com.android.volley.RequestQueue queue;
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.ubaya.advweek4160421039.model.Student> getStudentLD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void fetch(@org.jetbrains.annotations.NotNull
    java.lang.String studentId) {
    }
}