/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1948.framework.classe;

/**
 *
 * @author falyarivelo
 */
public class Mapping {
    String className;
    String method;

    public Mapping(){

    }
    public void setClassName(String value){
        if(value!=""){
            this.className=value;
        }
    }
    public void setMethod(String value){
        if(value!=""){
            this.method=value;
        }
    }
    public String getClassName(){
        return this.className;
    }
    public String getMethod(){
        return this.method;
    }
}