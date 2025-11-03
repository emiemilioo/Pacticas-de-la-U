package myphotos.myphotos.src.main.java.espol.poo;

import java.util.ArrayList;

import myphotos.myphotos.src.main.java.espol.poo.*;

public class Main {
    public static void main(String[] args) {
    MyPhotos app = new MyPhotos();
    ArrayList<Archivo> seleccion = app.armarCarrusel(5);
    MyPhotos.mostrarCarrusel(seleccion);
    }
}