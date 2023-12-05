/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Bai5 {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
       
        try {
             double luong ;
             System.out.println("nhap luong cua nguoi do : ");
             luong = nhanLuong(Double.parseDouble(sn.nextLine()));
             System.out.println("luog cua nguoi do la : "+luong);
        } 
        catch (OutOfRangeException e)
        {
            System.out.println("vui long nhap trong khoang 5.000.000 den 20.000.000 ");
        }
        catch (NumberFormatException e)
        {
            System.out.println("vui long nhap so !");
        }
                catch (Exception ex) {
                    System.out.println("loi"+ex.getMessage());
        }
    }
    private static double nhanLuong(double a) throws OutOfRangeException,Exception
    {
        if(a <5000000)
        {
            throw new OutOfRangeException("loi nhap ");
        }
        else if(a>20000000)
        {
            throw new OutOfRangeException("loi nhap ");
        }
        else
        {
            return a ;
        }
    }
}
