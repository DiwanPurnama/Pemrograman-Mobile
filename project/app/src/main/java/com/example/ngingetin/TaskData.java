package com.example.ngingetin;

import java.util.ArrayList;
import java.util.List;

public class TaskData {
    private static String[] names={
            "PPB",
            "APSI",
            "PPL1",
            "StatPro",
            "Proyek 4",
            "PPB"
    };

    private static String[] deskripsi={
            "Desain Mockup",
            "Membuat Business Proses",
            "Refactoring Galaga",
            "Pelajari Probabilitas",
            "Desain Database",
            "Implementasi Mockup"
    };

    private static String[] deadlines ={
            "30-03-2022",
            "27-03-2022",
            "20-03-2022",
            "11-04-2022",
            "26-03-2022",
            "08-04-2022"
    };

    public static List<Task> getDatas(){
        ArrayList<Task> tasks = new ArrayList<>();
        for(int i=0; i<names.length;i++){
            Task task = new Task(names[i],deskripsi[i],deadlines[i] );
            tasks.add(task);
        }
        return tasks;
    }
}
