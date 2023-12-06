import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main{

    public static void main(String[] args) {
        ArrayList <items> obj = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            createRandomItem();
            obj.add(createRandomItem());
        }
        System.out.println("************************          Lista oggetti        **********************************");
        obj.stream().forEach(System.out::println);


        System.out.println(" ");
        System.out.println("************************          Filtro Baby        **********************************");
        System.out.println(" ");


            //obj.stream().map(getPrice -> getPrice.getPrice()).forEach(price -> System.out.println(price));
            //obj.stream().map(getName -> getName.getName()).forEach(name -> System.out.println(name));
            //obj.stream().map(getId -> getId.getItem()).forEach(item -> System.out.println(item));

        //filtro e stampa (Book prezzo 100 o maggiore)
        Predicate<items> bookFilter = item -> item.getItem().equals("Book");
        Predicate<items> priceFilter = price -> price.getPrice() > 100;
        obj.stream().filter(bookFilter.and(priceFilter)).forEach(System.out::println);

        //filtro Baby
        Predicate<items> babyFilter = item -> item.getItem().equals("Baby");
        obj.stream().filter(babyFilter.and(priceFilter)).forEach(System.out::println);

        //Predicate<items> bookFilter = item -> item.getItem().equals("Book");
        //obj.stream().filter(bookFilter).forEach(items -> {items.getPrice();double discount=items.price; discount=items.price*0,9});

        }
    public static items createRandomItem() {
        Random random = new Random();

        // Genera un prezzo casuale compreso tra 1 e 100
        int randomPrice = random.nextInt(10,1000);

        // Genera un id casuale come una stringa di lunghezza 5
        String randomId = generateRandomId(5);

        // Crea un oggetto items con i valori casuali
        String[] itemOptions = {"Book", "Baby", "18+"};

        // Genera un indice casuale per selezionare un'opzione da itemOptions
        int randomIndex = random.nextInt(itemOptions.length);
        String randomItem = itemOptions[randomIndex];

        items newItem = new items(randomPrice, randomId, randomItem);

        return newItem;
    }

    public static String generateRandomId(int length) {
        // Caratteri validi per l'id
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Creazione di una stringa casuale di lunghezza specificata
        StringBuilder randomId = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomId.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomId.toString();
    }



}
