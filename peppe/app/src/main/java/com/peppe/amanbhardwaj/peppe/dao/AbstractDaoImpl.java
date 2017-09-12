package com.peppe.amanbhardwaj.peppe.dao;

import android.net.Uri;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.peppe.amanbhardwaj.peppe.bizobj.BizObj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;

/**
 * Created by Nshthbhardwaj on 05/09/17.
 */

public abstract class AbstractDaoImpl implements Dao{


    DatabaseReference mRef ;
    FirebaseDatabase mDatabase;
    FirebaseStorage mStorage;
    StorageReference mStorageRef;
    BizObj mBizObj;
    UploadTask mUploadTask;

    Query mQuery;

    public AbstractDaoImpl(){

        mStorage = FirebaseStorage.getInstance();
        mStorageRef = mStorage.getReference();
        mDatabase = FirebaseDatabase.getInstance();
        mDatabase.setPersistenceEnabled(true);
    }


    @Override
    public void ReadChildQuries(ChildEventListener childEventListener) {
        mQuery.addChildEventListener(childEventListener);
    }

    @Override
    public void Read(ValueEventListener valueEventListener) {
        mRef.addValueEventListener(valueEventListener);
    }


    public void retrieveImage_localFile(String mStorageRefPath,File localFile,OnSuccessListener onSuccessListener, OnFailureListener onFailureListener) {
        mStorageRef = mStorage.getReference(mStorageRefPath);
        mStorageRef.getFile(localFile).addOnSuccessListener(onSuccessListener).addOnFailureListener(onFailureListener);
    }

    @Override
    public void uploadImage(OnSuccessListener<UploadTask.TaskSnapshot> onSuccessListener, OnFailureListener onFailureListener) {
        mUploadTask.addOnSuccessListener(onSuccessListener).addOnFailureListener(onFailureListener);

    }

   public void uploadImage_stream(String filePath,String mStorageRefPath,OnSuccessListener<UploadTask.TaskSnapshot> onSuccessListener, OnFailureListener onFailureListener) throws FileNotFoundException {
       FileInputStream stream = new FileInputStream(new File(filePath));
       mStorageRef = mStorage.getReference(mStorageRefPath);
       mUploadTask = mStorageRef.putStream(stream);
       uploadImage(onSuccessListener,onFailureListener);
   }

    public void uploadImage_bytes(byte[] data,String mStorageRefPath,OnSuccessListener<UploadTask.TaskSnapshot> onSuccessListener, OnFailureListener onFailureListener) throws FileNotFoundException {
        mStorageRef = mStorage.getReference(mStorageRefPath);
        mUploadTask = mStorageRef.putBytes(data);
        uploadImage(onSuccessListener,onFailureListener);
    }

    public void uploadImage_localFile(String filePath,String mStorageRefPath,OnSuccessListener<UploadTask.TaskSnapshot> onSuccessListener, OnFailureListener onFailureListener) throws FileNotFoundException {
        Uri file = Uri.fromFile(new File(filePath));
        mStorageRef = mStorage.getReference(mStorageRefPath + file.getLastPathSegment());
        mUploadTask = mStorageRef.putFile(file);
        uploadImage(onSuccessListener,onFailureListener);
    }
}
