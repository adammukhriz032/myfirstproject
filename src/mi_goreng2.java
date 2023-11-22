//pembelajaran: if else if statement 

public class mi_goreng2 {
    public static void main(String args[]){
      int umur = 45;
      if(umur >= 50){
        System.out.println("ibu dapat diskaun 30%");
      }else if(umur >= 40){
        System.out.println("ibu dapat diskaun 20%");
      }else{
        System.out.println("ibu dapat diskaun 10%");
      }
      
    }
}

//create satu program untuk bagi diskaun kepada kaum ibu. jika ibu kamu umur 45 tahun. dia akan dapat diskaun 20%
//tetapi list kan jenis diskaun yang terdapat di zoo. 
// umur 30 - diskaun 10 %
// umur 40 - diskaun 20%
//umur 50 - diskaun 30%
//else terakhir tidak perlu copy yang else if kedua(else only)
//else if digunakan untuk banyak option(macam switch statement)(dan sesuaiuntuk nomborS)