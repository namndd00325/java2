
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Nam Nguyen
 */
public class TestStudent {
    public static void main(String[] args) {
        
        Student student01= new Student();
        student01.setName("Nam");
        student01.setEmail("namdd00325@fpt.edu.vn");
        student01.setBirthday("03/08/1995");
        
        Student student02= new Student();
        student02.setName("Nam");
        student02.setEmail("namdd00325@fpt.edu.vn");
        student02.setBirthday("03/08/1995");
        
        
        
        ArrayList<Student> list= new ArrayList<>();
        list.add(student01);
        list.add(student02);
        
        for(Student listStudent: list){
            System.out.println(listStudent.getName());
        }
        
        list.remove(0);
    }
    
}
