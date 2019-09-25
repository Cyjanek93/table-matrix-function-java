//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

public class HelloWorld{
  
  public static void main(String []args){
    System.out.println("SOFTWARE OPEN");
    
    
    potega(2,2);
    System.out.println("-----------");
    tablica();
    
    
    
  }// KONIEC FUNKCJI MAIN
  
  
  
  
  public static int potega(int a, int b){
    int liczba = a;
    int wykladnik = b;
    int wynik = 1;
    
    if(wykladnik!=0){
      
      for(int i = 1;i<=wykladnik;i++)
      {
        wynik*=liczba;
      }
    }
    else
    {
      wynik =1;
    }
    System.out.println(wynik);
    return wynik;
    
    
  }// KONIEC FUNKCJI POTEGA
  
  public static void tablica(){
    
    int x= 0;
    int dni[] = new int[31]; // JEŻELI NAPISZESZ [31] TO MASZ 31 komórek liczonych od 0 do 30
    for(int i =0;i<=30;i++){
      dni[i] = i+1;
    }
    for (int j = 0;j<=30;j++){
      System.out.println(dni[j]);
    }
    
    System.out.println(dni[0]);
    System.out.println(dni[30]);
  }//KONIEC FUNKCJI TABLICA
  
}//KONIEC KLASY HELLO WORLD
