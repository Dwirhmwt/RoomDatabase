package com.example.roomdatabase.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDao {

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getAll();

    @Query("SELECT * FROM mahasiswa WHERE nama LIKE :nama ")
    Mahasiswa findByName(String nama);

    @Insert
    void insertAll(Mahasiswa mahasiswa);

    @Delete
    public void deleteUsers(Mahasiswa users);
    void deleteAll(Mahasiswa mahasiswa);

    @Update
    public void update(Mahasiswa mahasiswa);
    void updateAll(Mahasiswa mahasiswa);

    @Delete
    public void deleteAll(Mahasiswa  user1, Mahasiswa user2);

    void updateAll(Mahasiswa mahasiswa);
}
