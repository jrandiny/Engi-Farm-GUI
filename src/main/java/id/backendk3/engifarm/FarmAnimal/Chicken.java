package id.backendk3.engifarm.FarmAnimal;

import id.backendk3.engifarm.Cell.Cell;
import id.backendk3.engifarm.Product.FarmProduct.ChickenEgg;
import id.backendk3.engifarm.Product.Product;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Kelas riil turunan FarmAnimal
 * 
 * <p>Kelas untuk salah satu tipe {@link FarmAnimal}.
 * Merepresentasikan hewan ayam
 * 
 * @author backendk3
 * @see FarmAnimal
 */

public class Chicken extends FarmAnimal{
    
    /** 
     * Konstruktor kelas Chicken
     * 
     * @param _x Lokasi X
     * @param _y Lokasi Y
     */
    public Chicken(int _x, int _y){
        super(_x,_y,20,Cell.CellType.CoopType);
    }

    /**
     * Mengembalikan suara Chicken
     * 
     * @return String suara Chicken
     */
    public String speak(){
        return "Cook-a-Doodle-Doo!";
    }

    /**
     * Mengembalikan produk dari Chicken
     * 
     * @return Product berupa ChickenEgg
     * @see ChickenEgg
     */
    public Product getProduct(){
        Product res = new ChickenEgg();
        setHaveProduct(false);
        return res;    
    }

    /**
     * Mengembalikan sprite untuk Chicken
     * 
     * @return Gambar sprite Chicken
     */
    public Image getSprite() throws IOException{
        Image image;
        if(getEatStatus()){
            // sudah makan
            image = ImageIO.read(getClass().getClassLoader().getResource("sprites/animal/chicken.png"));
        } else {
            image = ImageIO.read(getClass().getClassLoader().getResource("sprites/animal/chicken-hungry.png"));
        }
        return image;
    }
}