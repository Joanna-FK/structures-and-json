package com.jgdy4.structures.zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedazy> ofertaSprzedazyList = new ArrayList<>();
        ofertaSprzedazyList.add(new OfertaSprzedazy( "Masło", 5.5));
        ofertaSprzedazyList.add(new OfertaSprzedazy( "Mleko", 2.3));
        ofertaSprzedazyList.add(new OfertaSprzedazy( "Chleb", 3.0));
        ofertaSprzedazyList.add(new OfertaSprzedazy( "Ser", 7.5));

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do{
            System.out.println("Podaj komende");
            komenda = scanner.nextLine();
            if( komenda .equalsIgnoreCase("listuj")){
                ofertaSprzedazyList.forEach(System.out::println);
                System.out.println();
            } else if (komenda.equalsIgnoreCase("sortuj malejaco")) {
                Collections.sort(ofertaSprzedazyList, new OfertaComparator(true));
            } else if (komenda.equalsIgnoreCase("sortuj rosnaco")) {
                Collections.sort(ofertaSprzedazyList, new OfertaComparator(false));
            } else if (komenda.startsWith("dodaj")) {
                //                TODO: dodawanie produktów
                String [] slowa = komenda.split(" ");
                String nazwa = slowa[1];
                Double cena = Double.parseDouble(slowa[2]);

            } else if (!komenda.equalsIgnoreCase("quit")) {
                System.err.println("Nie rozpoznałem komendy");
            }

        } while (!komenda.equalsIgnoreCase("quit"));
            }
        }

