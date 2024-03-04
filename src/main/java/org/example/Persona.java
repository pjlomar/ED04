package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Contacto sirve para almacenar uno o varios numeros de telefono asociados a un nombre.
 * @version 1.0
 * @since 2024
 * @author pedro
 */
class Persona {
    /**
     * Nombre del {@link Persona}.
     */
    private String name;
    /**
     * Numero o numeros de telefono del {@link Persona}.
     */
    private List<String> phones;

    /**
     * Constructor que crea un {@link Persona} con un nombre y uno o varios numeros de telefono.
     * @param name Nombre del {@link Persona}.
     * @param phone Numero o numeros de telefono del {@link Persona}.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Metodo get que sirve para obtener el nombre de {@link Persona}.
     * @return un String que indica el nombre de {@link Persona}.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo que sirve para obtener el o los numeros de telefono de {@link Persona}.
     * @return una lista de String con los numeros de telefono asociados a un {@link Persona}.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}