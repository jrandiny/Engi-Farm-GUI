package id.backendk3.engifarm.FarmAnimal;

import id.backendk3.engifarm.Product.*;
import id.backendk3.engifarm.Product.FarmProduct.*;
import id.backendk3.engifarm.Cell.Cell;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Kelas riil turunan FarmAnimal
 * 
 * <p>Kelas untuk salah satu tipe {@link FarmAnimal}.
 * Merepresentasikan hewan sapi
 * 
 * @author backendk3
 * @see FarmAnimal
 */

public class Cow extends FarmAnimal{
    
    /** 
     * Konstruktor kelas Cow
     * 
     * @param _x Lokasi X
     * @param _y Lokasi Y
     */
    public Cow(int _x, int _y, Cell.CellType _type){
        super(_x,_y,20,_type);
    }

    /**
     * Mengembalikan suara Cow
     * 
     * @return String suara Cow
     */
    public String speak(){
        return "Moooooooo..!";
    }

    /**
     * Mengembalikan produk dari Cow tergantung habitat
     * 
     * @return Product berupa CowMeat jika habitatnya Barn, CowMilk jika habitatnya GrassLand
     * @see CowMeat
     * @see CowMilk
     */
    public Product getProduct(){
        Product res;
        if(habitat==Cell.CellType.BarnType){
            res = new CowMeat();
        }else if(habitat==Cell.CellType.GrassLandType){
            res = new CowMilk();
        }else{
            throw new RuntimeException("Ga mungkin bang");
        }
        setHaveProduct(false);
        return res;    


    }

    /**
     * Mengembalikan sprite untuk Cow
     * 
     * @return Gambar sprite Cow
     */
    public Image getSprite() throws IOException{
        Image image = ImageIO.read(getClass().getClassLoader().getResource("sprites/animal/cow.png"));
        return image;
    }
}