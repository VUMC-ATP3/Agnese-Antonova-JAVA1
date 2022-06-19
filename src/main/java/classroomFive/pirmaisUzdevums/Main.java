package classroomFive.pirmaisUzdevums;

import classroomFive.encapsulation.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Author JkRowling = new Author("JK Rowling", "JK@gmail.com", 'F');
        Author Rainis = new Author("Jānis Rainis", "rainis@gmail.com", 'M');


        Cena cenaOne = new Cena(15.99, 'E');
        Cena cenaTwo = new Cena(9.99, '$');

        Book bookOne = new Book("Harry Potter",JkRowling, cenaOne);
        Book bookTwo = new Book("Klusā grāmata",Rainis, cenaTwo);

        // Otrais variants kā rakstīt var
      //  Cena cena = new Cena(9.99,'€');
      //  Book bookOne = new Book("Harry Potter", JKRowling, new Cena(15.99,'$'));
      //  Book bookTwo = new Book("Cits nosaukums", Rainis, cena);

        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());

    }
}
