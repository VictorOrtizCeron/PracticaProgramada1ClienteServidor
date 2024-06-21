import Netflix.Pelicula;
import Netflix.categorias.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Catalogo con todas las películas
        List<Pelicula> catalogo = crearCatalogo();


        // Variables
        boolean repetirMenu = true;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        while (repetirMenu) {
            try {

                String menuPrincipal = "\n───────────★ ˙ ̟ Bienvenid@ a Netflix ★ ˙ ̟───────────\n" +
                        "1. Ver catalogo de comedias.\n" +
                        "2. Ver catalogo de accion.\n" +
                        "3. Ver catalogo de terror.\n" +
                        "4. Ver catalogo de drama.\n" +
                        "5. Ver todo el catálogo.\n" +
                        "6. Salir.\n" +
                        "★───────────────────────────────────────────────────★";

                System.out.println(menuPrincipal);
                System.out.print("Elija una opción: ");

                String entradaUsuario = scanner.nextLine();
                opcion = Integer.parseInt(entradaUsuario);

                switch (opcion) {
                    case 1: //comedia
                        List<Pelicula> peliculasComedia = new ArrayList<>();

                        for (Pelicula peli : catalogo) {
                            if (peli instanceof PeliculaComedia) {
                                peliculasComedia.add(peli);
                            }
                        }

                        int i = 1;
                        String submenu = "";
                        System.out.println("───────────★ ˙ ̟ COMEDIA  ˙ ̟───────────");
                        for (Pelicula peli : peliculasComedia) {
                            submenu = submenu + i + ". " + peli.getTitulo() + "\n";
                            i += 1;
                        }
                        submenu = submenu + i + ". Salir";

                        boolean flag = false;

                        do {
                            System.out.println(submenu);
                            System.out.println("★──────────────────────────────────────★\nElija una opción: ");
                            String opcionEscogida = scanner.nextLine();

                            String limite = String.valueOf(peliculasComedia.size() + 1);

                            //condición de salida del menú
                            if (opcionEscogida.equals(limite)) {
                                System.out.print("Regresando a menú principal ...\n");
                                flag = true;
                                break;
                            }

                            try {
                                int numOpcion = Integer.parseInt(opcionEscogida);
                                PeliculaComedia Pelicula = (PeliculaComedia) peliculasComedia.get(numOpcion - 1);
                                System.out.println(Pelicula.toString());
                                flag = true;
                            } catch (Exception e) {
                                System.out.println("\nLa opción escogida no es válida.Intentelo de nuevo:");
                            }
                        } while (!flag);

                        break;

                    case 2: //accion
                        List<Pelicula> peliculasAccion = new ArrayList<>();
                        for (Pelicula peli : catalogo) {
                            if (peli instanceof PeliculaAccion) {
                                peliculasAccion.add(peli);
                            }
                        }

                        int j = 1;
                        String submenu2 = "";
                        System.out.println("───────────★ ˙ ̟ ACCIÓN  ˙ ̟───────────");
                        for (Pelicula peli : peliculasAccion) {
                            submenu2 = submenu2 + j + ". " + peli.getTitulo() + "\n";
                            j += 1;
                        }
                        submenu2 = submenu2 + j + ". Salir";

                        boolean flag2 = false;

                        do {
                            System.out.println(submenu2);
                            System.out.println("★──────────────────────────────────────★\nElija una opción: ");
                            String opcionEscogida = scanner.nextLine();

                            String limite2 = String.valueOf(peliculasAccion.size() + 1);

                            if (opcionEscogida.equals(limite2)) {
                                System.out.print("Regresando a menú principal ...\n");
                                flag2 = true;
                                break;
                            }

                            try {
                                int numOpcion = Integer.parseInt(opcionEscogida);
                                PeliculaAccion Pelicula = (PeliculaAccion) peliculasAccion.get(numOpcion - 1);
                                System.out.println(Pelicula.toString());
                                flag2 = true;
                            } catch (Exception e) {
                                System.out.println("\nLa opción escogida no es válida. Intentelo de nuevo:");
                            }
                        } while (!flag2);

                        break;

                    case 3: //TERROR
                        List<Pelicula> peliculasTerror = new ArrayList<>();
                        for (Pelicula peli : catalogo) {
                            if (peli instanceof PeliculaTerror) {
                                peliculasTerror.add(peli);
                            }
                        }

                        int k = 1;
                        String submenu3 = "";
                        System.out.println("───────────★ ˙ ̟ TERROR  ˙ ̟───────────");
                        for (Pelicula peli : peliculasTerror) {
                            submenu3 = submenu3 + k + ". " + peli.getTitulo() + "\n";
                            k += 1;
                        }
                        submenu3 = submenu3 + k + ". Salir";

                        boolean flag3 = false;

                        do {
                            System.out.println(submenu3);
                            System.out.println("★──────────────────────────────────────★\nElija una opción: ");
                            String opcionEscogida = scanner.nextLine();

                            String limite3 = String.valueOf(peliculasTerror.size() + 1);

                            if (opcionEscogida.equals(limite3)) {
                                System.out.print("Regresando a menú principal ...\n");
                                flag3 = true;
                                break;
                            }

                            try {
                                int numOpcion = Integer.parseInt(opcionEscogida);
                                PeliculaTerror Pelicula = (PeliculaTerror) peliculasTerror.get(numOpcion - 1);
                                System.out.println(Pelicula.toString());
                                flag3 = true;
                            } catch (Exception e) {
                                System.out.println("\nLa opción escogida no es válida. Intentelo de nuevo:");
                            }
                        } while (!flag3);

                        break;

                    case 4:
                        // Drama
                        List<Pelicula> peliculasDrama = new ArrayList<>();
                        for (Pelicula peli : catalogo) {
                            if (peli instanceof PeliculaDrama) {
                                peliculasDrama.add(peli);
                            }
                        }

                        int x = 1;
                        String submenu4 = "";
                        System.out.println("───────────★ ˙ ̟ DRAMA  ˙ ̟ ★───────────");

                        for (Pelicula peli : peliculasDrama) {
                            submenu4 = submenu4 + x + ". " + peli.getTitulo() + ".\n";
                            x += 1;
                        }
                        submenu4 = submenu4 + x + ". Salir.";
                        boolean bandera = false;
                        do {
                            System.out.println(submenu4);
                            System.out.println("★──────────────────────────────────────★\nElija una opción: ");
                            String opcionCase4 = scanner.nextLine();
                            String limiteCase4 = String.valueOf(peliculasDrama.size() + 1);

                            if (opcionCase4.equals(limiteCase4)) {
                                System.out.print("Regresando a menú principal ...\n");
                                bandera = true;
                                break;
                            }

                            try {
                                int numOpcionCase4 = Integer.parseInt(opcionCase4);
                                PeliculaDrama pelicula = (PeliculaDrama) peliculasDrama.get(numOpcionCase4 - 1);
                                System.out.println(pelicula.toString());
                                bandera = true;
                            } catch (Exception e) {
                                System.out.println("\nLa opción escogida no es válida.Intentelo de nuevo:");
                            }
                        } while (!bandera);

                        break;

                    case 5:
                        int iTodos = 1;
                        String submenuTODOS = "";
                        System.out.println("───────────★ ˙ ̟ CATALOGO COMPLETO  ˙ ̟ ★───────────");

                        for (Pelicula peli : catalogo) {
                            submenuTODOS = submenuTODOS + iTodos + ". " + peli.getTitulo() + "\n";
                            iTodos += 1;
                        }
                        submenuTODOS = submenuTODOS + iTodos + ". Salir";


                        boolean flagTODOS = false;

                        do {
                            System.out.println(submenuTODOS);
                            System.out.println("★──────────────────────────────────────★\nElija una opción: ");
                            String opcionEscogida = scanner.nextLine();

                            String limite = String.valueOf(catalogo.size() + 1);

                            //condición de salida del menú
                            if (opcionEscogida.equals(limite)) {
                                System.out.print("Regresando a menú principal ...\n");
                                flagTODOS = true;

                            }

                            try {
                                int numOpcion = Integer.parseInt(opcionEscogida);
                                Pelicula peli = catalogo.get(numOpcion - 1);
                                System.out.println(peli.toString());
                                flagTODOS = true;
                            } catch (Exception e) {
                                System.out.println("\nLa opción escogida no es válida.Intentelo de nuevo:");
                            }
                        }while(!flagTODOS);
                        break;
                    case 6:
                        repetirMenu = false;
                        System.out.println("Saliendo...\n");
                        break;
                    default:
                        System.out.println("\nLa opción escogida no es válida. Intentelo de nuevo:");
                        break;
                }
            } catch (Exception e) {
                System.out.println("El dato ingresado es inválido. Inténtelo denuevo.\n");
            }
        } // while

        scanner.close();
    } // main

    public static List<Pelicula> crearCatalogo() {
        List<Pelicula> catalogo = new ArrayList<>();

        PeliculaTerror it = new PeliculaTerror("It", "Andy Muschietti", 2017, 135.0F);
        PeliculaTerror theConjuring = new PeliculaTerror("The Conjuring", "James Wan", 2013, 112.0F);
        PeliculaTerror hereditary = new PeliculaTerror("Hereditary", "Ari Aster", 2018, 127.0F);

        PeliculaComedia superbad = new PeliculaComedia("Superbad", "Greg Mottola", 2007, 113.0F);
        PeliculaComedia theHangover = new PeliculaComedia("The Hangover", "Todd Phillips", 2009, 100.0F);
        PeliculaComedia stepBrothers = new PeliculaComedia("Step Brothers", "Adam McKay", 2008, 98.0F);

        PeliculaAccion madMax = new PeliculaAccion("Mad Max: Fury Road", "George Miller", 2015, 120.0F);
        PeliculaAccion johnWick = new PeliculaAccion("John Wick", "Chad Stahelski", 2014, 101.0F);
        PeliculaAccion dieHard = new PeliculaAccion("Die Hard", "John McTiernan", 1988, 132.0F);

        PeliculaDrama theShawshankRedemption = new PeliculaDrama("The Shawshank Redemption", "Frank Darabont", 1994, 142.0F);
        PeliculaDrama forrestGump = new PeliculaDrama("Forrest Gump", "Robert Zemeckis", 1994, 142.0F);
        PeliculaDrama theGodfather = new PeliculaDrama("The Godfather", "Francis Ford Coppola", 1972, 175.0F);

        //gracias al polimorfismo se pueden insertar objetos de diferentes clases que estén relacionados
        catalogo.add(it);
        catalogo.add(theConjuring);
        catalogo.add(hereditary);

        catalogo.add(superbad);
        catalogo.add(theHangover);
        catalogo.add(stepBrothers);

        catalogo.add(madMax);
        catalogo.add(johnWick);
        catalogo.add(dieHard);

        catalogo.add(theShawshankRedemption);
        catalogo.add(forrestGump);
        catalogo.add(theGodfather);


        return catalogo;
    }
} // class
