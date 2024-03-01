package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Contacto sirve para almacenar uno o varios numeros de telefono asociados a un nombre.
 * @version 1.0
 * @since 2024
 * @author pedro
 */
class Contacto {
    /**
     * Nombre del {@link Contacto}.
     */
    private String name;
    /**
     * Numero o numeros de telefono del {@link Contacto}.
     */
    private List<String> phones;

    /**
     * Constructor que crea un {@link Contacto} con un nombre y uno o varios numeros de telefono.
     * @param name Nombre del {@link Contacto}.
     * @param phone Numero o numeros de telefono del {@link Contacto}.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Metodo get que sirve para obtener el nombre de {@link Contacto}.
     * @return un String que indica el nombre de {@link Contacto}.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo que sirve para obtener el o los numeros de telefono de {@link Contacto}.
     * @return una lista de String con los numeros de telefono asociados a un {@link Contacto}.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}