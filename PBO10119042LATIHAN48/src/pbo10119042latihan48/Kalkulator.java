/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan48;

/**
 *
 * @author 
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi: Program ini berisi program untuk menampilkan KALKULATOR
 */
public class Kalkulator {
    private double value1, value2;
    
    public double getValue1(){
        return this.value1;
    }
    
    public void setValue1(double value1){
        this.value1 = value1;
    }
    
    public double getValue2(){
        return this.value2;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note) {
        note = note;
    }
    
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    
    public double minus(double val1, double val2) {
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    
    public double division(double val1, double val2) {
        return val1 / val2;
    }
    
    
    
}
