package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * La clase Agenda sirve para almacenar una lista de varios {@link Persona}.
 * @version 1.0
 * @since 2024
 * @author pedro
 */
public class Agenda implements IAgenda {
    /**
     * Lista de {@link Persona} que tendra la {@link Agenda}.
     */
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Constructor que genera una {@link Agenda} con una lista de {@link Persona} vacia.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo que sirve para agregar un {@link Persona} a la {@link Agenda}, estableciendo el nombre y un numero de
     * telefono, en el caso de que ese {@link Persona} no existiera previamente y en el caso de que existiera,
     * para agregar un numero de telefono a ese {@link Persona} preexistente en la {@link Agenda}.
     * @param name El nombre del {@link Persona} que se quiere agregar o al que se quiere agregar un nuevo telefono.
     * @param phone El numero de telefono que se quiere agregar.
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo que sirve para eliminar un {@link Persona} de la {@link Agenda}.
     * @param name El nombre del {@link Persona} que se quiere eliminar.
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo que sirve para eliminar un numero de telefono antiguo de un {@link Persona} en la {@link Agenda} y
     * sustituirlo por un nuevo numero de telefono .
     * @param name El nombre del {@link Persona} al que quieres cambiar el número de telefono.
     * @param oldPhone El numero de telefono antiguo que quieres sustituir.
     * @param newPhone El numero de telefono nuevo que va a sustituir al antiguo.
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Metodo que sirve para mostrar todos los {@link Persona} que hay en la {@link Agenda}
     * @return una lista de {@link Persona}.
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}