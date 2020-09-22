package com.mercado.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Mercado {
    private static byte CAPACIDAD = 49;
    private String nombresuper;
    private List<Producto> productos;

    public Mercado(String nombresuper) {
        this.nombresuper = nombresuper;
        this.productos = new ArrayList<>();
    }

    public boolean agregar (Producto p){
        AtomicBoolean existePdto = new AtomicBoolean(false);
        productos.forEach(producto -> {
            if (producto.getCodigo()==(p.getCodigo())){
                existePdto.set(true);
            }
        });
        if (existePdto.get()){
            return false;
        }
        else if (productos.size()>CAPACIDAD){
            return false;
        }
        else{
            productos.add(p);
            return true;
        }
    }

    public boolean retirar (String nombre){
        AtomicBoolean existePdto = new AtomicBoolean(false);
        productos.forEach(producto -> {
            if (producto.getNombre().equals(nombre)){
                existePdto.set(true);
            }
        });
        if (existePdto.get()){
            productos.remove(nombre);
            return true;
        }
        else{
            return false;
        }
    }

    public Producto buscar (String nombre){
        AtomicBoolean existePdto = new AtomicBoolean(false);
        productos.forEach(producto -> {
            if (producto.getNombre().equals(nombre)){
                existePdto.set(true);
            }
        });
        if (existePdto.get()){
            return productos.get(Integer.parseInt(nombre));
        }
        else{
            return null;
        }
    }

    public Producto buscar (int codigo){
        AtomicBoolean existePdto = new AtomicBoolean(false);
        productos.forEach(producto -> {
            if (producto.getCodigo()==codigo){
                existePdto.set(true);
            }
        });
        if (existePdto.get()){
            return productos.get(codigo);
        }
        else{
            return null;
        }
    }

    public List<Producto> buscarPorTipo (String tipo){
        AtomicBoolean existePdto = new AtomicBoolean(false);
        List<Producto> listaTipo = new ArrayList<>();
        productos.forEach(producto -> {
            if (producto.getTipo().equals(tipo)){
                listaTipo.add(producto);
                existePdto.set(true);
            }
        });
        if (existePdto.get()){
            return listaTipo;
        }
        else{
            return listaTipo;
        }
    }

    public int calcularTotal (){
        int total = productos.stream().mapToInt(producto -> producto.getCantidad() * producto.getPrecio()).sum();
        return total;
    }

}
