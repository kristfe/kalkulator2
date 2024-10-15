package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {


    public int penjumlahan (int a, int b){
        return a+b;
    }
    public int pengurangan (int a, int b){
        return a-b;
    }

    public int perkalian (int a, int b){
        return a*b;
    }

    @Test
    public void testPenjulahan(){
        int hasil = penjumlahan(2,2);
        System.out.println("Hasil penjumlahan : " + hasil);
        Assertions.assertEquals(4,4);
    }

    @Test
    public void testPengurangan(){
        int hasil = pengurangan(5,2);
        System.out.println("Hasil penjumlahan : " + hasil);
        Assertions.assertEquals(3,3);
    }

    @Test
    public void testPerkalian(){
        int hasil = perkalian(3,5);
        System.out.println("Hasil penjumlahan : " + hasil);
        Assertions.assertEquals (15,15);
    }

}