/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projet;

/**
 *
 * @author Yavuix
 */
public class Produit {


   private int id;
   private String nom; 
   private float prix;
   private byte[] image;
   private int quantite;
   
   public Produit (int pid, String pnom, float pprix, byte[] pimg, int pquantite)
   {
       this.id = pid;
       this.nom = pnom;
       this.prix = pprix;
       this.image = pimg; 
       this.quantite = pquantite;
   
   }
   
   public int getId()
   {
       return id;
   }
   
   public String getNom()
   {
       return nom;
   }
   
   public float getPrix()
   {
       return prix;
   }
  
   
   public byte[] getimage()
   {
       return image; 
   }
   
   public int getQuantite()
   {
       return quantite;
   }
           
           
    
}


