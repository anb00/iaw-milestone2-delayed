package com.iesemilidarder.anicolau.resolution.core;

import com.iesemilidarder.anicolau.resolution.core.data.Activity;
import com.iesemilidarder.anicolau.resolution.core.data.Hotel;
import com.iesemilidarder.anicolau.resolution.core.data.Product;
import com.iesemilidarder.anicolau.resolution.core.data.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class DataHelper {

    public static Integer MAX_NUM = 2; //poner el número que queramos



    /* Lista de Restaurantes Array 1 */

    private static List<Restaurant> restaurantes = new ArrayList<>();

    public static List<Restaurant> getRestaurantes() {

        if (restaurantes.isEmpty()) {
            isEmptyRestaurant();
        }
        return restaurantes;
    }


    /* Lista de Actividades Array 1 */

    private static List<Activity> actividades = new ArrayList<>();

    public static List<Activity> getActividades() {

        if (actividades.isEmpty()) {
            isEmptyActividades();
        }
        return actividades;
    }




    /* Lista de productos Array 2 */

    public static List<Product> products = new ArrayList<>();

    public static List<Product> getItems() {
        if (products.isEmpty()) {
            isempty();
        }
        return products;
    }

    /* Find by id */

    public Product getProduct(UUID id) {
        return products.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    /**
     * Delete By Id
     */
    /**
     * Método Delete 2
     */
    public static void deleteProduct(Product product) {
        products.remove(product);
    }

    /**
     * En delete product method by anb
     */
/*

    public static void updateProduct(Product product) { products.update(product);
    }
*/











    /* Lista de hoteles Para Mostrar , agregar y Detallar */

    private static List<Hotel> hoteles = new ArrayList<>();

    public static List<Hotel> getHotels() {
        if (hoteles.isEmpty()) {
            isemptyhoteles();
        }
        return hoteles;
    }


    /* end Array Hoteles */


    /* FIND BY UUID in HOTELS AND ITEMS */
    public static Product getItemById(UUID id) {
        try {
            for (Product aux : products) {
                if (aux.getId().equals(id)) {
                    return aux;
                }
            }
        } catch (Exception e) {
            System.out.println("WANTED!!!" + e.toString());
        }
        return null;
    }

    /**
     * Método específico para buscar por ID
     * @param id
     * @return
     */
    public static Restaurant getItemByIdRest(UUID id) {
        try {
            for (Restaurant aux : restaurantes) {
                if (aux.getId().equals(id)) {
                    return aux;
                }
            }
        } catch (Exception e) {
            System.out.println("WANTED!!! " + e.toString());
        }
        return null;
    }



    /* edit or update product */

    public void  getAndUpdate(UUID id) {
        try {
            for (Product aux : products) {
                if (aux.getId().equals(id)) {
                }
                else{
                    this.addItem(aux);
                }
            }
        } catch (Exception e) {
            System.out.println("WANTED!!!" + e.toString());
        }

    }
    /* end edit and update */


    public static void addItem(Product aux) {
        try {
            if (aux != null) {
                products.add(aux);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }

    /* add restaurants */
    public static void addItemRest(Restaurant aux) {
        try {
            if (aux != null) {
                restaurantes.add(aux);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }



    public static void isempty() {
        for (int i = 0; i < MAX_NUM; i++) {
            Product Item;
            Item = new Product();
            Item.setName("Hotel Marbella Nº" + i);
            Item.setPrecio(++i + 100 + i + 00.00);
            Item.setDescription("Cada Hotel Incluye Pension completa según Nº de estrellas (Starts Nº" + i + ")");
            Item.setImgUri("España");
            products.add(Item);

        }

    }


    /* IsEmpty Restaurant */
    public static void isEmptyRestaurant() {
        for (int i = 0; i < MAX_NUM; i++) {
            Restaurant rest1;
            rest1 = new Restaurant() {
                @Override
                public void setName(String name) {
                    super.setName(name);

                }
            };

            rest1.setName("Restaurante Nº" + i);
            rest1.setPrecio(++i + 100 + i + 00.00);
            rest1.setDescription("Cada rest Incluye  Menú Degustacion según Nº de estrellas Michelin (Starts Nº" + i + ")");
            rest1.setImgUri("http://");
            restaurantes.add(rest1);

        }

    }

    /* is empty Hoteles */
    public static void isemptyhoteles() {
        for (int i = 0; i < MAX_NUM; i++) {
            Hotel hotelx = new Hotel();
            Hotel alpha = new Hotel();
            alpha.setName("Bella Vista");
            alpha.setDescription("asdasd");
            alpha.setPrecio(12.0);
            alpha.setImgUri("no image");
            hotelx.setName("Hotel Marbella Nº" + i);
            hotelx.setPrecio(++i + 100 + i + 00.00);
            hotelx.setDescription("Cada Hotel Incluye Pension completa según Nº de estrellas (Starts Nº" + i + ")");
            hotelx.setImgUri("http://");
            hoteles.add(hotelx);
            hoteles.add(alpha);


        }

    }

    /* is Empty Actividades */ /* Esto genera actividades */
    public static void isEmptyActividades() {
        for (int i = 0; i < MAX_NUM; i++) {
            Activity actx;
            actx = new Activity();

            actx.setName("Actividades Nº" + i);
            actx.setPrecio(++i + 100 + i + 00.00);
            actx.setDescription("Cada Actividad Tiene una descripción (Starts Nº" + i + ")");
            actx.setImgUri("http://");
            actividades.add(actx);

        }

    }


    /* MÉTODO TO DELETE fase Alpha  */

    public static void deleteproduct(UUID product) {
        try {
            if (product != null) {
                products.remove(product);
                //products.del(aux);
            }
        } catch (Exception e) {
            System.out.println("MEK!!!" + e.toString());
        }
    }
    /**
     * Método Delete 2 fase beta
     */






}