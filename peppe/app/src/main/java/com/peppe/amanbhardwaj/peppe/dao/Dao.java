package com.peppe.amanbhardwaj.peppe.dao;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.UploadTask;
import com.peppe.amanbhardwaj.peppe.bizobj.BizObj;

/**
 * Created by Nshthbhardwaj on 05/09/17.
 */

public interface Dao {

    public void Read(ValueEventListener valueEventListener);

    public void ReadChildQuries(ChildEventListener childEventListener);

    public void update();

    public boolean commit();

    //public void retrieveImage(OnSuccessListener onSuccessListener, OnFailureListener onFailureListener);

    public void uploadImage(OnSuccessListener<UploadTask.TaskSnapshot> onSuccessListener, OnFailureListener onFailureListener);
}
