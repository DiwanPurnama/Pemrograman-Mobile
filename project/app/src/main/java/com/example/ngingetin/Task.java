package com.example.ngingetin;

import android.os.Parcel;
import android.os.Parcelable;

public class Task implements Parcelable {
    private String nama,description,deadline;

    public Task(String nama, String description, String deadline) {
        this.nama = nama;
        this.description = description;
        this.deadline = deadline;
    }

    public Task(Parcel in) {
        nama = in.readString();
        deadline = in.readString();
        description = in.readString();
    }

    public static final Creator<Task> CREATOR = new Creator<Task>() {
        @Override
        public Task createFromParcel(Parcel in) {
            return new Task(in);
        }

        @Override
        public Task[] newArray(int size) {
            return new Task[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(nama);
        dest.writeString(deadline);
        dest.writeString(description);
    }
}
