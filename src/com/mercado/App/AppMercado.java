package com.mercado.App;

import com.mercado.domain.Mercado;
import com.mercado.domain.Producto;
import com.mercado.domain.TipoProducto;

public class AppMercado {
    public static void main(String[] args) {
        Mercado mercado = new Mercado("Mercado Rionegro");

        Producto res = new Producto(1,"Carne de res", 3,15000,"Carne");
        Producto cerdo = new Producto(2,"Cane de cerdo", 2,9000,"Carne");
        Producto zanahoria = new Producto(3,"Zanahoria", 1,1500,"Verdura");
        Producto repollo = new Producto(4,"Repollo", 1,1000,"Verdura");
        Producto queso = new Producto(5,"Queso", 2,3250,"Lacteo");
        Producto leche = new Producto(6,"Leche", 10,1800,"Lacteo");
        Producto manzana = new Producto(7,"Manzana", 3,1250,"Fruta");
        Producto mandarina = new Producto(8,"Mandarina", 3,1250,"Fruta");
        Producto panqueso = new Producto(9,"Pan queso", 1,2500,"Pan");
        Producto panTajado = new Producto(10,"Pan tajado", 3,1000,"Pan");
        Producto arroz = new Producto(11,"Arroz", 1,2500,"Grano");
        Producto frijol = new Producto(12,"Frijol", 6,1750,"Grano");
        Producto carnemolida = new Producto(13,"Carne molida", 4,3800,"CarneFría");
        Producto salchicha = new Producto(14,"Salchicha", 2,5000,"CarneFría");
        Producto cerveza = new Producto(15,"Cerveza", 2,22000,"Licor");
        Producto aguardiente = new Producto(16,"Aguardiente", 1,90000,"Licor");

        System.out.println(mercado.agregar(res));
        System.out.println(mercado.agregar(cerdo));
        System.out.println(mercado.agregar(aguardiente));
        System.out.println(mercado.agregar(cerveza));
        System.out.println(mercado.agregar(leche));
        System.out.println(mercado.agregar(salchicha));
        System.out.println(mercado.agregar(cerveza));

        System.out.println();
        System.out.println(mercado.retirar("Carne de res"));
        System.out.println(mercado.retirar("Frijol"));

        System.out.println();
        mercado.buscarPorTipo("Lacteo").forEach(producto -> {
            System.out.println(producto.getNombre());
        });

        System.out.println();
        System.out.println(mercado.calcularTotal());

        System.out.println();
        System.out.println(mercado.buscar(1).getNombre());
        System.out.println(mercado.buscar(2).getNombre());
        System.out.println(mercado.buscar("Cerveza").getNombre());
        System.out.println(mercado.buscar("Arroz").getNombre());









    }
}
