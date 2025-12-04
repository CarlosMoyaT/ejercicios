package metodos;

public class Discount {
    public static void main(String[] args) {
        /*
        *
        * ¿Qué necesito recibir? → precio original y porcentaje de descuento
          ¿Qué necesito devolver? → precio final (un número decimal)
          ¿Qué cálculo hago? → restar el descuento del precio original*/


        System.out.println("price is: " + finalPrice);



    }

    public static double discountPrice(double price, double discountPercentage) {
        double discount = price * (discountPercentage / 100);
        return price - discount;


    }

    static double finalPrice = discountPrice(100.0, 20.0);


}
