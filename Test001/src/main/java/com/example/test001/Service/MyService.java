package com.example.test001.Service;


import com.example.test001.Model.AllEmploy;
import com.example.test001.Model.Employ;
import com.example.test001.Model.TotalEmploy;
import com.example.test001.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepo myRepo;

    public Employ addEmploy(Employ employ){
        myRepo.save(employ);
        return employ;
    }
    public List<Employ> getEmploy(){
        return myRepo.findAll();
    }
    public AllEmploy getEmployObjects(){
        AllEmploy allEmploy=new AllEmploy() ;
        allEmploy.setEmployList(myRepo.findAll());
        return allEmploy;
    }
    public TotalEmploy getTotalEmploy(){
        TotalEmploy totalEmploy=new TotalEmploy();
        AllEmploy allEmploy=new AllEmploy() ;
        allEmploy.setEmployList(myRepo.findAll());
        totalEmploy.setTotalEmploy(allEmploy.getEmployList().size());
        totalEmploy.setEmployList(allEmploy);
        return totalEmploy;
    }
    public void deleteEmploy(Integer id){
        myRepo.deleteById(id);
    }
    public Employ updateEmploy(Employ employ){
        myRepo.save(employ);
        return employ;
    }
    public Employ getEmployById(int id){
        return myRepo.findById(id).get();
    }

}
