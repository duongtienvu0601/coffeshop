/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import DAO.BanDAO;
import Model.Ban;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Test {
    public static void main(String[] args) {
        Ban ban = new Ban();
        BanDAO bd= new BanDAO();
        List<Ban> ls= bd.select();
        System.out.println(ls.size());
    }
}
