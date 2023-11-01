/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import common.Validate;
import view.Menu;

/**
 *
 * @author DELL
 */
public class SearchFileManager extends Menu<String> {
    
    static String[] mc = {"Count number of occurrences of a word in a file", "Search file have content which contain inputted word","Exit"};
    
    
    public SearchFileManager() {
        super("\n\t\tLIST AND SEARCH FILE BY CONTEND", mc);
    }
    
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                   System.out.print("Enter path   ");
                   String path = Validate.checkInput();
                   System.out.print("Enter word    ");
                   String name = Validate.checkInput();
                   int count =  Library.countWordInFile(path, name);   
                   System.out.print("COUNT : " + count); 
                   break;
            case 2:
                    System.out.print("Enter Path   ");//D:\Documents\NetBeansProjects\SearchFileByContent
                    String path1 = Validate.checkInput();
                    System.out.print("Enter Word     ");
                    String word = Validate.checkInput();
                    Library.getFileNameContainsWordInDirectory(path1, word);
                    break;
            case 3: System.exit(0);
        }
    }
    
     
    
}
